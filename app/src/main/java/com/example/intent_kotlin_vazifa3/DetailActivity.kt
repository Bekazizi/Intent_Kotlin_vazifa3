package com.example.intent_kotlin_vazifa3

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.intent_kotlin_vazifa3.user.User

class DetailActivity: AppCompatActivity() {
    val TAG  = DetailActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initViews()
    }

    fun initViews(){
        var tv_detail = findViewById<TextView>(R.id.tv_detail)

        var user = intent.getParcelableExtra<User>("user")
        Log.d(TAG, user.toString())


        tv_detail.text = "Name: ${user?.name}, Age: ${user?.age}"
    }
}