package com.prathamchikitse

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.prathamchikitse.adapter.HospitalAdapter
import com.prathamchikitse.data.EmergencyRepository
import com.prathamchikitse.databinding.ActivityHospitalFinderBinding

class HospitalFinderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHospitalFinderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHospitalFinderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Nearby Hospitals"
            setDisplayHomeAsUpEnabled(true)
        }

        val hospitals = EmergencyRepository.getSimulatedHospitals()

        val adapter = HospitalAdapter(hospitals) { hospital ->
            // Simulate call action
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:${hospital.phone}"))
            startActivity(intent)
        }

        binding.rvHospitals.layoutManager = LinearLayoutManager(this)
        binding.rvHospitals.adapter = adapter

        binding.tvNote.text = "⚠️ Offline Mode: Showing nearest emergency centers.\nAlways call 108 first in a life-threatening emergency."

        // Emergency call button
        binding.btnCall108.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:108"))
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
