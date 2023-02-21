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
    }
}