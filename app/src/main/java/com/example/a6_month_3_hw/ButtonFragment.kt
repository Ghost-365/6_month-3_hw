package com.example.a6_month_3_hw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.a6_month_3_hw.databinding.FragmentButtonBinding


class ButtonFragment : Fragment() {

    private lateinit var binding: FragmentButtonBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        binding.plus.setOnClickListener{
            viewModel.increment()
        }

        binding.minus.setOnClickListener{
            viewModel.decrement()
        }

    }


}