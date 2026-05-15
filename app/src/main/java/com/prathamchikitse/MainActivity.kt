package com.prathamchikitse

import android.content.Intent
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.text.Editable
import android.text.TextWatcher
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.prathamchikitse.adapter.EmergencyAdapter
import com.prathamchikitse.data.EmergencyRepository
import com.prathamchikitse.databinding.ActivityMainBinding
import com.prathamchikitse.model.Emergency
import java.util.Locale

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: EmergencyAdapter
    private var tts: TextToSpeech? = null
    private var isTTSReady = false
    private var isAudioModeEnabled = false
    private var allEmergencies = listOf<Emergency>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.title = "Pratham Chikitse"

        // Init TTS
        tts = TextToSpeech(this, this)

        allEmergencies = EmergencyRepository.getAllEmergencies()

        setupRecyclerView()
        setupSearch()
        setupAudioToggle()
        setupHospitalFinderButton()
    }

    private fun setupRecyclerView() {
        adapter = EmergencyAdapter(allEmergencies) { emergency ->
            if (isAudioModeEnabled && isTTSReady) {
                speakEmergency(emergency)
            }
            val intent = Intent(this, EmergencyDetailActivity::class.java)
            intent.putExtra(EmergencyDetailActivity.EXTRA_EMERGENCY_ID, emergency.id)
            intent.putExtra(EmergencyDetailActivity.EXTRA_AUDIO_MODE, isAudioModeEnabled)
            startActivity(intent)
        }
        binding.rvEmergencies.layoutManager = GridLayoutManager(this, 2)
        binding.rvEmergencies.adapter = adapter
    }

    private fun setupSearch() {
        binding.etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filterEmergencies(s.toString())
            }
            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun filterEmergencies(query: String) {
        val filtered = if (query.isEmpty()) {
            allEmergencies
        } else {
            allEmergencies.filter {
                it.titleEn.contains(query, ignoreCase = true) ||
                it.titleKn.contains(query, ignoreCase = true)
            }
        }
        adapter.updateList(filtered)
    }

    private fun setupAudioToggle() {
        binding.btnAudioToggle.setOnClickListener {
            isAudioModeEnabled = !isAudioModeEnabled
            if (isAudioModeEnabled) {
                binding.btnAudioToggle.text = "🔊 Audio ON"
                binding.btnAudioToggle.setBackgroundColor(getColor(R.color.audio_on))
                Toast.makeText(this, "Audio Mode ON – Instructions will be read aloud", Toast.LENGTH_SHORT).show()
            } else {
                binding.btnAudioToggle.text = "🔇 Audio OFF"
                binding.btnAudioToggle.setBackgroundColor(getColor(R.color.audio_off))
                tts?.stop()
            }
        }
    }

    private fun setupHospitalFinderButton() {
        binding.btnHospitalFinder.setOnClickListener {
            startActivity(Intent(this, HospitalFinderActivity::class.java))
        }
    }

    private fun speakEmergency(emergency: Emergency) {
        tts?.speak("Opening ${emergency.titleEn} emergency guide", TextToSpeech.QUEUE_FLUSH, null, null)
    }

    fun speakText(text: String) {
        if (isTTSReady && isAudioModeEnabled) {
            tts?.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts?.setLanguage(Locale("kn", "IN"))
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                tts?.language = Locale.ENGLISH
            }
            isTTSReady = true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_about -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onDestroy() {
        tts?.stop()
        tts?.shutdown()
        super.onDestroy()
    }
}
