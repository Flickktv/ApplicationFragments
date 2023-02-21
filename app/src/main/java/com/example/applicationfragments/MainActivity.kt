package com.example.applicationfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentResultListener
import androidx.lifecycle.ViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val dataEvent: DataEvent by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFrag(Fragment1())

        val bnFragment1 = findViewById<Button>(R.id.bnFragment1)
        bnFragment1.setOnClickListener {
            val name = findViewById<EditText>(R.id.firstName).text.toString()
            dataEvent.firstName.value = name
            val lastname = findViewById<EditText>(R.id.lastName).text.toString()
            dataEvent.lastName.value = lastname
            val email = findViewById<EditText>(R.id.email).text.toString()
            dataEvent.email.value = email
            openFrag(Fragment2())
        }
        val bnFragment2 = findViewById<Button>(R.id.bnFragment2)
        bnFragment2.setOnClickListener {
            openFrag(Fragment1())
        }
    }



    private fun openFrag(f: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, f)
            .commit()
    }

}