package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.register.databinding.ActivityLogin1Binding

class login1 : AppCompatActivity() {

    private lateinit var binding: ActivityLogin1Binding
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PASS = "extra_pass"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            login.setOnClickListener {
                val intentToMainActivity =
                    Intent(this@login1, Homepage3Activity::class.java)
                intentToMainActivity.putExtra(EXTRA_NAME, usernamelogin.text.toString())
                intentToMainActivity.putExtra(EXTRA_PASS, passwordlogin.text.toString())
                startActivity(intentToMainActivity)
            }
            register1.setOnClickListener{
                val resultIntent =
                    Intent(this@login1, MainActivity::class.java)
                startActivity(resultIntent)
            }
        }
    }
}
