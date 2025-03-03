package com.minhhnn.forsaken.androidtaskhijackingdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.minhhnn.forsaken.androidtaskhijackingdemo.databinding.FragmentPhishingFacebookBinding

class PhishingFacebookFragment : Fragment(), View.OnClickListener {

    private var _binding : FragmentPhishingFacebookBinding? = null

    private val binding
    get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPhishingFacebookBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI(){
        binding.btLogIn.setOnClickListener(this)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt_log_in -> Toast.makeText(context, getUserInfo(), Toast.LENGTH_LONG).show()
        }
    }

    private fun getUserInfo() : String = "Username: ${binding.etUsername.text} \n Password: ${binding.etPassword.text}"
}