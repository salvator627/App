package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.app.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button3.setOnClickListener(this)

        binding.imageView2.setOnClickListener {
            Toast.makeText(applicationContext, "Still in development", Toast.LENGTH_SHORT).show()
        }

        binding.imageView3.setOnClickListener {
            Toast.makeText(applicationContext, "This is google", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button3 ->{
                val moveintent = Intent(this@RegisterActivity,MainActivity::class.java)
                startActivity(moveintent)
            }
        }
    }
}