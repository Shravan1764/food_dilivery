package com.example.fooddilivery.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddilivery.databinding.NotificationlayoutBinding

class notificationadapter(private var notification : ArrayList<String>,private var notificationimg : ArrayList<Int>):
    RecyclerView.Adapter<notificationadapter.notifyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): notifyViewHolder {
        val binding = NotificationlayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return notifyViewHolder(binding)
        Log.d("check", "bind: adapter3")
    }
    override fun onBindViewHolder(holder: notifyViewHolder, position: Int) {
       holder.bind(position)
        Log.d("check", "bind: adapter4")
    }

    override fun getItemCount(): Int {
        return notification.size
        Log.d("check","${notification.size}")
    }

    inner class notifyViewHolder(private val binding: NotificationlayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(i: Int) {
            binding.apply {
                textView30.text = notification[i]
                imageView11.setImageResource(notificationimg[i])
                Log.d("check", "bind: adapter5")
            }
        }

    }
}