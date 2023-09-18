package com.example.register

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.text.Html
import android.widget.TextView
import com.example.register.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.register.login1.Companion.EXTRA_NAME
import com.example.register.login1.Companion.EXTRA_PASS

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var textView: TextView
    companion object{

        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            registerbutton.setOnClickListener{
                val resultIntent = Intent(this@MainActivity, Homepage3Activity::class.java)
                resultIntent.putExtra(EXTRA_NAME, username.text.toString())
                resultIntent.putExtra(EXTRA_EMAIL, email.text.toString())
                resultIntent.putExtra(EXTRA_PHONE, phone.text.toString())
                resultIntent.putExtra(EXTRA_PASS, password.text.toString())
                startActivity(resultIntent)
            }
            login10.setOnClickListener{
                val resultIntent =
                    Intent(this@MainActivity, login1::class.java)
                startActivity(resultIntent)
            }
        }

    }
}