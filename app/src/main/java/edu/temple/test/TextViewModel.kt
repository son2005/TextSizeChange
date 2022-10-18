package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel() {
    private val text = MutableLiveData<String>()

    fun setText(text: String) {
        this.text.value = text
    }

    fun getText() : LiveData<String> {
        return text
    }
}