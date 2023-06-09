package com.example.basicquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.basicquizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonHome.setOnClickListener{
           val  intent = Intent(this@MainActivity,PlayActivity::class.java)
            startActivity(intent)
        }
    }
}