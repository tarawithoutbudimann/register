package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.register.databinding.Homepage3Binding

class Homepage3Activity : AppCompatActivity() {
    private lateinit var binding: Homepage3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Homepage3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val name = intent.getStringExtra(login1.EXTRA_NAME)
        val email = intent.getStringExtra(MainActivity.EXTRA_EMAIL)
            val phone = intent.getStringExtra(MainActivity.EXTRA_PHONE)
            with(binding){
                usernameHome.text = "Welcome $name"
                emailHome.text = "Your $email has been activated"
                phoneHome.text = "Your $phone has been registered"
            }
    }
}