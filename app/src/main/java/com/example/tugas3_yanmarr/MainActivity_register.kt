package com.example.tugas3_yanmarr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity_register : AppCompatActivity() {
private lateinit var user1 :TextView
    private lateinit var etpass2 :TextView
    private lateinit var buttonlgn :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_register)

user1 = findViewById(R.id.etuser1)
        etpass2 = findViewById(R.id.etpass2)
        buttonlgn = findViewById(R.id.buttonlgn1)


       //expilict inten
        buttonlgn.setOnClickListener {
//open login
            val intentDestination =Intent (this@MainActivity_register, LOGIN::class.java)
                startActivity(intentDestination)
        }
    }
}