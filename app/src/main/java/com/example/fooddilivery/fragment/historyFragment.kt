package com.example.fooddilivery.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddilivery.R
import com.example.fooddilivery.adapter.buyagainadapter
import com.example.fooddilivery.databinding.FragmentHistoryBinding

class historyFragment : Fragment() {

    private lateinit var binding: FragmentHistoryBinding
    private lateinit var buyagainadapter: buyagainadapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        binding = FragmentHistoryBinding.inflate(layoutInflater, container, false)
        setupRecyclerView()
        return binding.root
    }

    private fun setupRecyclerView() {
         val buyagainfoodname = arrayListOf("Food1","Food2","Food3","Food4","Food5","Food6")
        val buyagainprice = arrayListOf("$100","$200","$300","$400","$500","$600")
        val buyagainimg = arrayListOf(R.drawable.banner2,R.drawable.banner3,R.drawable.burger,R.drawable.banner2,R.drawable.banner3
            ,R.drawable.burger)
        buyagainadapter = buyagainadapter(buyagainfoodname,buyagainprice,buyagainimg)
        binding.recyclerbuyagain.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerbuyagain.adapter = buyagainadapter
    }

}