package com.example.fooddilivery

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddilivery.databinding.ActivitySignupBinding
import com.example.fooddilivery.databinding.ActivityStartBinding

class signup : AppCompatActivity() {
    private  val binding: ActivitySignupBinding by lazy{
        ActivitySignupBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.alrdacc.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        binding.signupbtn.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}