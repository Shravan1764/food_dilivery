package com.example.fooddilivery

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fooddilivery.adapter.notificationadapter
import com.example.fooddilivery.databinding.FragmentNotifivationBottonBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class notifivation_fragment_botton : BottomSheetDialogFragment() {

    private lateinit var binding: FragmentNotifivationBottonBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentNotifivationBottonBinding.inflate(inflater, container, false)
        val notifivation = listOf("Your order has been canceled successfully",
            "Order has been taken by he driver"
            ,"Congrats your order has been placed successfully")
        val notifivationimg = listOf(R.drawable.reaction,R.drawable.deliver,R.drawable.done)
        val adapter = notificationadapter(ArrayList(notifivation),
                                    ArrayList(notifivationimg))
        Log.d("check", "bind: adapter")
        binding.recyclernotification.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclernotification.adapter = adapter
        Log.d("check", "bind: adapter1")
        binding.imageView6.setOnClickListener {
            dismiss()
        }
        Log.d("check", "bind: adapter2")
        return binding.root
    }
}