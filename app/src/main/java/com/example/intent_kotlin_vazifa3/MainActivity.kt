package com.example.intent_kotlin_vazifa3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.intent_kotlin_vazifa3.user.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews(){
        var b_open_detail = findViewById<Button>(R.id.b_open_detail);
        b_open_detail.setOnClickListener {
            var user = User(name = "Azizbek", age = 20)
            openDetailActivity(user)
        }
    }

    fun openDetailActivity(user: User){
        var intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("user", user)

        startActivity(intent)
    }
}