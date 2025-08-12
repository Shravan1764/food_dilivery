package com.example.fooddilivery.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddilivery.R
import com.example.fooddilivery.adapter.cartadapter
import com.example.fooddilivery.databinding.FragmentCartBinding
import com.example.fooddilivery.payoutact

class cartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater,container,false)

        val cartfood = listOf<String>("Burger","Momos","Chowmin","Pizza","sandwich","chilli Potato")
        val price = listOf<String>("$5","$10","$15","$20","$25","$30")
        val img = listOf<Int>(R.drawable.burger,R.drawable.banner2,R.drawable.banner3,R.drawable.banner1,R.drawable.poster2,R.drawable.poster3)

        val adapter = cartadapter(ArrayList(cartfood),ArrayList(price),ArrayList(img))
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

        binding.button.setOnClickListener {
            val intent = Intent(requireContext(), payoutact::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}