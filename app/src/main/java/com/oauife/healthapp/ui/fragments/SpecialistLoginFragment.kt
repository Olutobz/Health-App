package com.oauife.healthapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.oauife.healthapp.R

class SpecialistLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_specialist_login, container, false)
        val signInButton = view.findViewById<Button>(R.id.signIn_button)
        signInButton.setOnClickListener {
            view?.findNavController()
                ?.navigate(R.id.action_specialistLoginFragment_to_userPageFragment)
        }
        return view
    }
}