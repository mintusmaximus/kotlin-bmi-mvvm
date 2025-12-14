package com.example.bmimvvm.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BMIViewModel : ViewModel() {
    var height by mutableStateOf("")
        private set

    var weight by mutableStateOf("")
        private set

    fun getResult(): Float? {
        val h = height.toFloatOrNull() ?: return 0.0f
        val w = weight.toFloatOrNull() ?: return 0.0f
        return w / (h * h)
    }

    fun onWeightChange(newValue: String) {
        weight = newValue
    }

    fun onHeightChange(newValue: String) {
        height = newValue
    }

}