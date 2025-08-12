package com.example.fooddilivery

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fooddilivery.databinding.ActivityDetailsfoodBinding

class detailsfood : AppCompatActivity() {
    private lateinit var  binding : ActivityDetailsfoodBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsfoodBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodname = intent.getStringExtra("MenuItemName")
        val foodimg = intent.getIntExtra("MenuItemImage",0)
        binding.textView35.text = foodname
        binding.imageView13.setImageResource(foodimg)

        binding.imageView12.setOnClickListener {
            finish()
        }
    }
}