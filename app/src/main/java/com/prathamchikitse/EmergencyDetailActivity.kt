package com.prathamchikitse

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.prathamchikitse.adapter.StepPagerAdapter
import com.prathamchikitse.data.EmergencyRepository
import com.prathamchikitse.databinding.ActivityEmergencyDetailBinding
import com.prathamchikitse.model.Emergency
import java.util.Locale

class EmergencyDetailActivity : AppCompatActivity(), TextToSpeech.OnInitListener {

    companion object {
        const val EXTRA_EMERGENCY_ID = "extra_emergency_id"
        const val EXTRA_AUDIO_MODE = "extra_audio_mode"
    }

    private lateinit var binding: ActivityEmergencyDetailBinding
    private var tts: TextToSpeech? = null
    private var isTTSReady = false
    private var isAudioMode = false
    private lateinit var emergency: Emergency
    private lateinit var stepAdapter: StepPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmergencyDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val emergencyId = intent.getIntExtra(EXTRA_EMERGENCY_ID, 1)
        isAudioMode = intent.getBooleanExtra(EXTRA_AUDIO_MODE, false)

        emergency = EmergencyRepository.getAllEmergencies().first { it.id == emergencyId }

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = emergency.titleEn
            setDisplayHomeAsUpEnabled(true)
        }

        tts = TextToSpeech(this, this)

        setupUI()
        setupViewPager()
        setupDosDonts()
        setupAudioButton()
    }

    private fun setupUI() {
        binding.tvEmergencyTitle.text = emergency.titleEn
        binding.tvEmergencyTitleKn.text = emergency.titleKn
        binding.tvStepCount.text = "${emergency.steps.size} Steps"
    }

    private fun setupViewPager() {
        stepAdapter = StepPagerAdapter(emergency.steps)
        binding.viewPager.adapter = stepAdapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = "Step ${position + 1}"
        }.attach()

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                updateNavigationButtons(position)
                if (isAudioMode && isTTSReady) {
                    val step = emergency.steps[position]
                    tts?.speak(step.instructionKn, TextToSpeech.QUEUE_FLUSH, null, null)
                }
            }
        })

        binding.btnPrev.setOnClickListener {
            val current = binding.viewPager.currentItem
            if (current > 0) binding.viewPager.currentItem = current - 1
        }

        binding.btnNext.setOnClickListener {
            val current = binding.viewPager.currentItem
            if (current < emergency.steps.size - 1) {
                binding.viewPager.currentItem = current + 1
            } else {
                Toast.makeText(this, "All steps completed!", Toast.LENGTH_SHORT).show()
            }
        }

        updateNavigationButtons(0)
    }

    private fun updateNavigationButtons(position: Int) {
        binding.btnPrev.visibility = if (position == 0) View.INVISIBLE else View.VISIBLE
        binding.btnNext.text = if (position == emergency.steps.size - 1) "Done ✓" else "Next →"
    }

    private fun setupDosDonts() {
        val dosText = emergency.dosList.joinToString("\n") { "✅ $it" }
        val dontsText = emergency.dontsList.joinToString("\n") { "❌ $it" }

        binding.tvDos.text = dosText
        binding.tvDonts.text = dontsText
    }

    private fun setupAudioButton() {
        updateAudioButtonState()
        binding.btnAudioToggle.setOnClickListener {
            isAudioMode = !isAudioMode
            updateAudioButtonState()
            if (isAudioMode && isTTSReady) {
                val currentStep = emergency.steps[binding.viewPager.currentItem]
                tts?.speak(currentStep.instructionKn, TextToSpeech.QUEUE_FLUSH, null, null)
            } else {
                tts?.stop()
            }
        }
    }

    private fun updateAudioButtonState() {
        if (isAudioMode) {
            binding.btnAudioToggle.text = "🔊 Audio ON"
            binding.btnAudioToggle.setBackgroundColor(getColor(R.color.audio_on))
        } else {
            binding.btnAudioToggle.text = "🔇 Audio OFF"
            binding.btnAudioToggle.setBackgroundColor(getColor(R.color.audio_off))
        }
    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result = tts?.setLanguage(Locale("kn", "IN"))
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                tts?.language = Locale.ENGLISH
            }
            isTTSReady = true
            // Auto-read first step if audio mode is on
            if (isAudioMode) {
                tts?.speak(emergency.steps[0].instructionKn, TextToSpeech.QUEUE_FLUSH, null, null)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }

    override fun onDestroy() {
        tts?.stop()
        tts?.shutdown()
        super.onDestroy()
    }
}
