package com.example.fooddilivery.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddilivery.databinding.PrevbuyitemsBinding

class buyagainadapter(private val buyagainfoodname : ArrayList<String>,private val buyagainprice : ArrayList<String>
            ,private val buyagainimg : ArrayList<Int>) : RecyclerView.Adapter<buyagainadapter.buyagainViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): buyagainadapter.buyagainViewHolder {
        val binding = PrevbuyitemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return buyagainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: buyagainadapter.buyagainViewHolder, position: Int) {
        holder.bind(buyagainfoodname[position],buyagainprice[position],buyagainimg[position])

    }

    override fun getItemCount(): Int  = buyagainfoodname.size

    class buyagainViewHolder(private val binding : PrevbuyitemsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(fname: String, fprice: String, imgint: Int) {
            binding.textView23.text = fname
            binding.textView24.text = fprice
            binding.imageView8.setImageResource(imgint)
        }

    }


}