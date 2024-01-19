package com.example.composeiniciov2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.composeiniciov2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button0.setOnClickListener {
            val intent = Intent(this,MainActivityEj1Tabla::class.java)
            startActivity(intent)
        }

        binding.button1.setOnClickListener {
            val intent = Intent(this,MainActivityEj2Column::class.java)
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this,MainActivityEj3Column::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            val intent = Intent(this,MainActivityEj4Row::class.java)
            startActivity(intent)
        }
        binding.button4.setOnClickListener {
            val intent = Intent(this,MainActivityEj5Column::class.java)
            startActivity(intent)
        }
        binding.button5.setOnClickListener {
            val intent = Intent(this,MainActivityEj6Mix::class.java)
            startActivity(intent)
        }
    }
}