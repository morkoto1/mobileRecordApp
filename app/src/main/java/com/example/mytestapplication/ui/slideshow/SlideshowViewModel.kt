package com.example.mytestapplication.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "SMARLOOK RECORDING\n" +
                "trial account\nThis is slideshow Fragment"
    }
    val text: LiveData<String> = _text
}