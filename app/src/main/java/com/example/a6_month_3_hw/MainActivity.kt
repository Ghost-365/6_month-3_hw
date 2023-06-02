package com.example.a6_month_3_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a6_month_3_hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var adapter = Adapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pager2.adapter = adapter
    }
}