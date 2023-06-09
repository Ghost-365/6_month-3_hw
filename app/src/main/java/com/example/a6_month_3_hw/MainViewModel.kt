package com.example.a6_month_3_hw

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private var count = 0
    private var plus = ""

    val counter = MutableLiveData<String>()
    val operation = MediatorLiveData<String>()

    fun increment() {
        ++count
        counter.value = count.toString()
        plus = "\n +$plus"
        operation.value = plus
    }

    fun decrement() {
        --count
        counter.value = count.toString()
        plus = "\n -$plus"
        operation.value = plus
    }
}