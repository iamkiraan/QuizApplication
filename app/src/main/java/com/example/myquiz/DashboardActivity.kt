package com.example.myquiz

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.myquiz.databinding.ActivityDashboardBinding
import com.example.myquiz.databinding.ActivityMainBinding

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    private lateinit var ImageDrawer : ImageButton
    private lateinit var drawerLayout: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = binding.textView.text.toString()
        val email = binding.textView.text.toString()
        val mail = binding.textView.text.toString()
        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPref.edit()
        val check = sharedPref.getBoolean("flag", true)
        val Username = sharedPref.getString("name", name)
        val emails = sharedPref.getString("email",email)



        ImageDrawer = findViewById(R.id.navigationdrawer)
        drawerLayout = findViewById(R.id.drawerLayout)
        ImageDrawer.setOnClickListener {
            drawerLayout.open()

        }

        binding.textView.text = "$Username"
//        emai.setText("$emails")
//        user.setText("$user")

    }

}


