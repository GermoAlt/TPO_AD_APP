package com.ad.grupo10.gestionbarrial.activities.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ad.grupo10.gestionbarrial.R

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
    }
    override fun onPause() {
        super.onPause()
        overridePendingTransition(0, 0)
    }
}