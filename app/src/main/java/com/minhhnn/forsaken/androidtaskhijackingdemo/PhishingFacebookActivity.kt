package com.minhhnn.forsaken.androidtaskhijackingdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minhhnn.forsaken.androidtaskhijackingdemo.databinding.ActivityPhishingFacebookBinding

class PhishingFacebookActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPhishingFacebookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhishingFacebookBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
    }
}