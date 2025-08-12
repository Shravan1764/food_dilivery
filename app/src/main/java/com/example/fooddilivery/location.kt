package com.example.fooddilivery

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fooddilivery.databinding.ActivityLocationBinding

class location : AppCompatActivity() {
     private val binding : ActivityLocationBinding by lazy{
         ActivityLocationBinding.inflate(layoutInflater)
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val loclist = arrayOf("jaipur","jhansi","bundi","Bandra")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,loclist)
        val autoCompleteTextView = binding.listlocation
        autoCompleteTextView.setAdapter(adapter)

    }
}