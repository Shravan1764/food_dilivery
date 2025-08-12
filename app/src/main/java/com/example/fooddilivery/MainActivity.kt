package com.example.fooddilivery

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.fooddilivery.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var navctrl = findNavController(R.id.fragmentContainerView6)
        var btmnav = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        btmnav.setupWithNavController(navctrl)

        binding.imageView4.setOnClickListener {
            val bottomdialog = notifivation_fragment_botton()
            bottomdialog.show(supportFragmentManager, "BottomSheetDialog")
        }
    }
}