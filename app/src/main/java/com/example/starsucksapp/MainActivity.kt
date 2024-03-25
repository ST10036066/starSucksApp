package com.example.starsucksapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.starsucksapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView2.setOnClickListener() {
            Toast.makeText(this@MainActivity, "MMM Choco frapp", Toast.LENGTH_SHORT).show()
        }

        binding.imageView3.setOnClickListener() {
            Toast.makeText(this@MainActivity, " MMM Bottled Americano", Toast.LENGTH_SHORT).show()
        }

        binding.imageView5.setOnClickListener() {
            Toast.makeText(this@MainActivity, "MMM Rainbow Frapp", Toast.LENGTH_SHORT).show()
        }
        binding.imageView6.setOnClickListener() {
            Toast.makeText(this@MainActivity, "MMM Black Forest Frapp", Toast.LENGTH_SHORT).show()
        }
    }
}


