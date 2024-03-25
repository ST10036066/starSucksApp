package com.example.starsucksapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.starsucksapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), android.view.View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView2.setOnClickListener(this)
        binding.imageView3.setOnClickListener(this)
        binding.imageView4.setOnClickListener(this)
        binding.imageView5.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
      when(v?.id)
      {
          R.id.imageView2-> Toast.makeText(this@MainActivity, "MMM Soy Latte", Toast.LENGTH_SHORT).show()
          R.id.imageView3-> Toast.makeText(this@MainActivity, "MMM Choco frapp", Toast.LENGTH_SHORT).show()
          R.id.imageView4-> Toast.makeText(this@MainActivity, "Bottled Americano", Toast.LENGTH_SHORT).show()
          R.id.imageView5-> Toast.makeText(this@MainActivity, "Black forest Frapp", Toast.LENGTH_SHORT).show()
      }

    }
}


