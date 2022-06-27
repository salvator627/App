package com.example.app


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.app.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity(), View.OnClickListener {

   private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener(this)
        binding.button.setOnClickListener (this)

    }

     override fun onClick(v: View?) {
         when (v?.id){
             R.id.button2 -> {
                 val moveIntent = Intent(this@MainActivity, RegisterActivity::class.java)
                 startActivity(moveIntent)
             }

             R.id.button -> {
                 val moveIntent = Intent(this@MainActivity, HomeActivity::class.java)
                 startActivity(moveIntent)
             }
         }
     }

 }