package com.example.applicationfragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.activityViewModels
import org.koin.android.ext.android.get
import org.koin.androidx.viewmodel.ext.android.viewModel

class Fragment1 : Fragment(R.layout.fragment_1) {

    private val dataEvent: DataEvent by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bnFragment1 = requireActivity().findViewById<Button>(R.id.bnFragment1)
        bnFragment1.setOnClickListener {
            val name = requireActivity().findViewById<EditText>(R.id.firstName).text.toString()
            dataEvent.firstName.value = name
            val lastname = requireActivity().findViewById<EditText>(R.id.lastName).text.toString()
            dataEvent.lastName.value = lastname
            val email = requireActivity().findViewById<EditText>(R.id.email).text.toString()
            dataEvent.email.value = email
        parentFragmentManager.beginTransaction().replace(R.id.container, Fragment2()).commit()
        }
    }
}