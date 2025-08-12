package com.example.fooddilivery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddilivery.adapter.menuadapter
import com.example.fooddilivery.databinding.FragmentBottomsheetfragBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class bottomsheetfrag : BottomSheetDialogFragment() {

    private lateinit var binding : FragmentBottomsheetfragBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentBottomsheetfragBinding.inflate(inflater, container, false)
//        binding.backbutton.setOnClickListener {
//            dismiss()
//        }
        val menuitem = listOf("Burger","Momos","Chowmin","Chilli Potato","Shushi","Maggi")
        val menuprice = listOf("$5","$10","$15","$20","$25","$30")
        val menuimg = listOf(R.drawable.burger,R.drawable.banner2,R.drawable.banner3,R.drawable.banner2,R.drawable.banner3,R.drawable.burger)
        val adapter = menuadapter(
            menuitem as MutableList<String>,
            menuprice as MutableList<String>,
            menuimg as MutableList<Int>,
            requireContext()
        )
        binding.recyclermenu.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclermenu.adapter = adapter
        return binding.root
    }

}