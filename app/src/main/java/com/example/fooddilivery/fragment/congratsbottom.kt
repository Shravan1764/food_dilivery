package com.example.fooddilivery.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fooddilivery.MainActivity
import com.example.fooddilivery.R
import com.example.fooddilivery.databinding.FragmentCongratsbottomBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class congratsbottom : BottomSheetDialogFragment(){

    private lateinit var binding: FragmentCongratsbottomBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentCongratsbottomBinding.inflate(inflater, container, false)

        binding.button6.setOnClickListener {
            val intent = Intent(requireContext(), MainActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }
}