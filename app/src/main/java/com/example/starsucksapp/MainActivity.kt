package com.example.starsucksapp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.starsucksapp.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity(), android.view.View.OnClickListener {
  public var  order= Order();

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
          R.id.imageView2-> order.productName = "MMM Soy Latte"
          R.id.imageView3->  order.productName = "MMM Choco Frappe"
          R.id.imageView4->  order.productName = "Bottled Americano"
          R.id.imageView5->  order.productName =  "Black forest Frappe"
      }
    Toast.makeText(this@MainActivity,"MMM"+ order.productName, Toast.LENGTH_SHORT).show()
            openIntent(this, order.productName, OrderDetailsActivity::class.java)

    }

    private fun openIntent(mainActivity: MainActivity, productName: String, java: Class<OrderDetailsActivity>)
    {
        val intent = Intent(mainActivity, java)
        intent.putExtra("productName", productName)
        mainActivity.startActivity(intent)
    }
}


