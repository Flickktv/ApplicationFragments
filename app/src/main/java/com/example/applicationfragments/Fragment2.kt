package com.example.applicationfragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentResultListener
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner


class Fragment2 : Fragment(R.layout.fragment_2) {

    private val dataEvent: DataEvent by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = requireActivity().findViewById<TextView>(R.id.tvFirstName)
        dataEvent.firstName.observe(activity as LifecycleOwner, {
            name.text = it
        })
        val lastname = requireActivity().findViewById<TextView>(R.id.tvLastName)
        dataEvent.lastName.observe(activity as LifecycleOwner, {
            lastname.text = it
        })
        val email = requireActivity().findViewById<TextView>(R.id.tvEmail)
        dataEvent.email.observe(activity as LifecycleOwner, {
            email.text = it
        })

    }
}