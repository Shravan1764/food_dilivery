package com.example.fooddilivery.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddilivery.databinding.MenuItemBinding
import com.example.fooddilivery.detailsfood

class menuadapter(private val menuitems : MutableList<String>, private val menuprices : MutableList<String>,
                  private val menuimgs :
                  MutableList<Int>,private val requiercontect : Context):
                  RecyclerView.Adapter<menuadapter.menuviewholder>() {

       private val itemClickListener: OnClickListner? = null

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): menuviewholder {
            val binding = MenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return menuviewholder(binding)
        }

        override fun onBindViewHolder(holder: menuviewholder, position: Int) {
           holder.bind(position)
        }

        override fun getItemCount(): Int {
            return menuitems.size
        }

    inner class menuviewholder(private val binding : MenuItemBinding) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    itemClickListener?.onItemclick(position)
                }
                val intent = Intent(requiercontect, detailsfood::class.java)
                intent.putExtra("MenuItemName", menuitems.get(position))
                intent.putExtra("MenuItemImage", menuimgs.get(position))
                requiercontect.startActivity(intent)
            }
        }

        fun bind(position: Int) {
            binding.apply {
                textView17.text = menuitems[position]
                foodprice.text = menuprices[position]
                sampleimg.setImageResource(menuimgs[position])

            }
        }

    }
    interface OnClickListner {
        fun onItemclick(position: Int)
    }
}


