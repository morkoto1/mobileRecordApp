package com.example.mytestapplication.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "SMARLOOK RECORDING\nQA account\nThis is home Fragment"
    }
    val text: LiveData<String> = _text
}