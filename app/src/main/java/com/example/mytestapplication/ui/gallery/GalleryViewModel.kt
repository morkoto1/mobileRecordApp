package com.example.mytestapplication.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "SMARLOOK RECORDING\n" +
                "QA account\nThis is gallery Fragment"
    }
    val text: LiveData<String> = _text
}