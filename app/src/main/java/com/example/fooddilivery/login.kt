package com.example.fooddilivery

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fooddilivery.databinding.ActivityLoginBinding

class login : AppCompatActivity() {

    private  val binding: ActivityLoginBinding by lazy{
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginbtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        binding.noaccbtn.setOnClickListener{
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }
    }
}