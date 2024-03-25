package com.example.tugas3_yanmarr

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LOGIN : AppCompatActivity() {


    private lateinit var user1: TextView
    private lateinit var lp1: TextView
    private lateinit var pass1: TextView
    private lateinit var buttonlgn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        user1 = findViewById(R.id.user1)
        pass1 = findViewById(R.id.pass1)
        buttonlgn = findViewById(R.id.buttonlgn)
        lp1 = findViewById(R.id.lp1)


        //expilict inten
        buttonlgn.setOnClickListener {
//open login
            val intentDestination = Intent(this@LOGIN, home::class.java)
            startActivity(intentDestination)

            lp1.setOnClickListener {
//open lupapassword
                val intentDestination = Intent(this@LOGIN, lupapassword::class.java)
                startActivity(intentDestination)
            }
        }
    }
}

