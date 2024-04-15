package com.example.myquiz


import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.NestedScrollView
import androidx.drawerlayout.widget.DrawerLayout
import com.example.myquiz.databinding.ActivityDashboardBinding
import com.google.android.material.navigation.NavigationView

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDashboardBinding
    private lateinit var ImageDrawer : ImageButton
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var scrollView : NestedScrollView
    private lateinit var framelayout : FrameLayout
    private lateinit var toggle : ActionBarDrawerToggle
    private val api = "https://the-trivia-api.com/v2/"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        scrollView = findViewById(R.id.scrollView)
        framelayout = findViewById(R.id.FrameLayout)
//        val name = binding.textView.text.toString()
//        val email = binding.textView.text.toString()
        val sharedPref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPref.edit()
        val check = sharedPref.getBoolean("flag", true)
//        val Username = sharedPref.getString("name", name)
//        val emails = sharedPref.getString("email",email)
//        val navView = findViewById<NavigationView>(R.id.navigationView)
//val logout = findViewById<TextView>(R.id.logout)
//        logout.setOnClickListener {
//            editor.clear()
//            val intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//           editor.apply()
//
//        }
        ImageDrawer = findViewById(R.id.navigationdrawer)
        drawerLayout = findViewById(R.id.drawerLayout)
        ImageDrawer.setOnClickListener {
            drawerLayout.open()

        }
//        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.Open,R.string.Close)
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        binding.textView.text = "$Username"


//
//     navView.setNavigationItemSelectedListener {
//         val username = findViewById<TextView>(R.id.Username)
//         val email = findViewById<TextView>(R.id.Email)
//         username.text = "$Username"
//         email.text ="$emails"
//         when(it.itemId){
//             R.id.maAccount-> Toast.makeText(applicationContext,"clicked my account",Toast.LENGTH_SHORT).show()
//         }
//         true
//
//     }
    }


}




