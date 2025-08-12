package com.example.fooddilivery

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fooddilivery.databinding.ActivityPayoutactBinding
import com.example.fooddilivery.fragment.congratsbottom

class payoutact : AppCompatActivity() {

    private lateinit var binding : ActivityPayoutactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPayoutactBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.paynow.setOnClickListener {
            val bottomcongrats = congratsbottom()
            bottomcongrats.show(supportFragmentManager, "BottomSheetDialog")
        }

    }
}