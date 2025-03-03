package com.minhhnn.forsaken.androidtaskhijackingdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.minhhnn.forsaken.androidtaskhijackingdemo.databinding.FragmentPhishingFacebookBinding
import com.minhhnn.forsaken.androidtaskhijackingdemo.databinding.FragmentTransparentBinding

class TransparentFragment : Fragment() {

    private var _binding : FragmentTransparentBinding? = null

    private val binding
        get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTransparentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}