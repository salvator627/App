package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding : ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button4.setOnClickListener (this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.button4 ->{
                val moveIntent = Intent(this@HomeActivity, SecretActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}