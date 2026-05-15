package com.prathamchikitse

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.prathamchikitse.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "About"
            setDisplayHomeAsUpEnabled(true)
        }

        binding.tvAboutContent.text = """
            Pratham Chikitse
            ಪ್ರಥಮ ಚಿಕಿತ್ಸೆ
            
            First-Aid Emergency Offline Guide
            
            This app is a life-saving manual in your pocket. It provides step-by-step guidance for 20 common medical emergencies in Kannada and English.
            
            ✅ Works completely OFFLINE
            ✅ Text-to-Speech in Kannada
            ✅ Clear Do's and Don'ts
            ✅ Hospital Finder (Simulated)
            ✅ Audio Mode for hands-free guidance
            
            Emergency Contact:
            📞 Ambulance: 108
            📞 Police: 100
            📞 Fire: 101
            📞 Women Helpline: 1091
            
            Impact Goals:
            • Public Safety – Reducing preventable deaths
            • Rural Resilience – Empowering villages
            • Language Equity – Medical info in mother tongue
            
            MindMatrix VTU Internship Program
            Project Title: 54
            Android App Development using GenAI
        """.trimIndent()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}
