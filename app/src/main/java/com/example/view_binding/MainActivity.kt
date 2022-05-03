package com.example.view_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   setContentView(R.layout.activity_main)

       binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.name.text="hi shruthi"
    }
}