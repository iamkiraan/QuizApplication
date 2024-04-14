package com.example.myquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var nextTo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val check = sharedPref.getBoolean("flag", false)
        val editor = sharedPref.edit()

        nextTo = findViewById(R.id.Button)

        if (check) {
            val intent = Intent(this@MainActivity, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            nextTo.setOnClickListener {
                val name = binding.name.text.toString()
                val email = binding.email.text.toString()
                editor.apply {
                    putBoolean("flag", true)
                    putString("name", name)
                    putString("email",email)
                    apply()
                }

                    val intent = Intent(this@MainActivity, DashboardActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }
    }

