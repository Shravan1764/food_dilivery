package com.example.fooddilivery.fragment

import android.R.attr.query
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddilivery.R
import com.example.fooddilivery.adapter.menuadapter
import com.example.fooddilivery.databinding.FragmentSearchBinding


class searchFragment : Fragment() {

    private lateinit var binding : FragmentSearchBinding
    private lateinit var adapter : menuadapter

    val menuitems = listOf("Burger","Momos","Chowmin","Chilli Potato","Shushi","Maggi")
    val menuprices = listOf("$5","$10","$15","$20","$25","$30")
    val menuimgs = listOf(R.drawable.burger,R.drawable.banner2,R.drawable.banner3,R.drawable.banner2,R.drawable.banner3,R.drawable.burger)

    private val filteredmenuitems = mutableListOf<String>()
    private val filteredmenuprices = mutableListOf<String>()
    private val filteredmenuimgs = mutableListOf<Int>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        adapter = menuadapter(filteredmenuitems,filteredmenuprices,filteredmenuimgs,requireContext())
        binding.recyclersearch.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclersearch.adapter = adapter

        setupforsearch()
        showallmenu()
        return binding.root
    }

    private fun showallmenu() {
        filteredmenuitems.clear()
        filteredmenuprices.clear()
        filteredmenuimgs.clear()

        filteredmenuitems.addAll(menuitems)
        filteredmenuprices.addAll(menuprices)
        filteredmenuimgs.addAll(menuimgs)

        adapter.notifyDataSetChanged()

    }

    private fun setupforsearch() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{

            override fun onQueryTextSubmit(query: String): Boolean {
                filtermenuitems(query)
                return true
            }

            override fun onQueryTextChange(p0: String): Boolean {
                filtermenuitems(p0)
                return true
            }

        })
    }
    private fun filtermenuitems(query: String) {
        filteredmenuitems.clear()
        filteredmenuprices.clear()
        filteredmenuimgs.clear()

        menuitems.forEachIndexed { index, foodname ->
            if (foodname.contains(query, ignoreCase = true)) {
                filteredmenuitems.add(foodname)
                filteredmenuprices.add(menuprices[index])
                filteredmenuimgs.add(menuimgs[index])
            }

        }
        adapter.notifyDataSetChanged()
    }


}