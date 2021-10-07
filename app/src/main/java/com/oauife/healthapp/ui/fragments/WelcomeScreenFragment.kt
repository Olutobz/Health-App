package com.oauife.healthapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.oauife.healthapp.R
import com.oauife.healthapp.databinding.FragmentWelcomeScreenBinding

class WelcomeScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentWelcomeScreenBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_welcome_screen, container, false
        )

        binding.nextButton.setOnClickListener {
            view?.findNavController()?.navigate(R.id.action_welcomeScreenFragment_to_loginFragment)
        }

        return binding.root
    }
}