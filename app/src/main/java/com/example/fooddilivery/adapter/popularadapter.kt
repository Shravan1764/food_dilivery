package com.example.fooddilivery.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddilivery.databinding.PopularBinding
import com.example.fooddilivery.detailsfood

class popularadapter(private val itemname :List<String>,private val price : List<String>,private val imglist :
                                        List<Int>,private val requiercontext : Context) : RecyclerView.Adapter<popularadapter.popularviewholder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): popularadapter.popularviewholder {
        return popularviewholder(PopularBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: popularadapter.popularviewholder, position: Int) {
        val item = itemname[position]
        val img = imglist[position]
        val price = price[position]
        holder.bind(item,img,price)

        holder.itemView.setOnClickListener{
            val intent = Intent(requiercontext, detailsfood::class.java)
            intent.putExtra("MenuItemName", item)
            intent.putExtra("MenuItemImage", img)
            requiercontext.startActivity(intent)

        }

    }
    override fun getItemCount(): Int {
        return itemname.size
    }
    class popularviewholder(private val binding : PopularBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item: String, img: Int, price: String) {
            binding.textView17.text = item
            binding.textView16.text = price
            binding.imageView7.setImageResource(img)
        }


    }
}