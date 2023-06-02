package com.example.a6_month_3_hw

import androidx.lifecycle.MediatorLiveData

class MainViewModel {
    private var count = 0
    private var plus = ""

    val counter = MediatorLiveData<String>()
    val operation = MediatorLiveData<String>()

    fun increment(){
        ++count
        counter.value = count.toString()
        plus = "\n +$plus"
        operation.value = plus
    }

    fun decrement(){
        --count
        counter.value = count.toString()
        plus = "\n -$plus"
        operation.value = plus
    }
}