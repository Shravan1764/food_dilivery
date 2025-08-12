package com.example.fooddilivery.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddilivery.databinding.CartItemBinding

class cartadapter(
    private val cartItemsList: MutableList<String>, // Renamed for clarity
    private val pricesList: MutableList<String>,    // Renamed for clarity
    private val cartImagesList: MutableList<Int>    // Renamed for clarity
) : RecyclerView.Adapter<cartadapter.CartViewHolder>() { // Renamed ViewHolder for convention

    private val itemCountList = IntArray(cartItemsList.size) { 1 } // Renamed for clarity

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {

        holder.bind(
            cartItemsList[position],
            pricesList[position],
            cartImagesList[position],
            itemCountList[position],
            position
        )
    }

    override fun getItemCount(): Int {
        return cartItemsList.size
    }

    // Consider making it an 'inner class' if you need access to other cartadapter members,
    // but for this specific problem, passing data to bind is cleaner.
    inner class CartViewHolder(private val binding: CartItemBinding) : RecyclerView.ViewHolder(binding.root) {
        // Modify bind to accept the data it needs
        fun bind(itemName: String, itemPrice: String, itemImageResId: Int, itemCount: Int, position: Int) {
            binding.apply {
                textView14.text = itemName
                textView18.text = itemPrice
                imageView5.setImageResource(itemImageResId)
                textView19.text = itemCount.toString()

                button2.setOnClickListener {
                    decreasequantity(position)
                }
                button5.setOnClickListener {
                    incereasequantity(position)
                }
                imageButton.setOnClickListener {
                    val itemPosition = adapterPosition
                    if (itemPosition != RecyclerView.NO_POSITION) {
                        deleteitem(position)
                    }
                }

            }

        }
        private fun incereasequantity(position: Int){
            if (itemCountList[position] < 10){
                itemCountList[position]++
                binding.textView19.text = itemCountList[position].toString()

        }
        }
        private fun decreasequantity(position: Int){
            if (itemCountList[position] > 1){
                itemCountList[position]--
                binding.textView19.text = itemCountList[position].toString()
            }
        }
        private fun deleteitem(position: Int){
            cartItemsList.removeAt(position)
            pricesList.removeAt(position)
            cartImagesList.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, cartItemsList.size)
        }
    }
}