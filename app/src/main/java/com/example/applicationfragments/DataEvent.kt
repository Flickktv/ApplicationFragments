package com.example.applicationfragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataEvent : ViewModel() {
    val firstName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val lastName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val email: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}