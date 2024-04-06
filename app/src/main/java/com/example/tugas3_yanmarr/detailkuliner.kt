package com.example.tugas3_yanmarr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detailkuliner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailkuliner)

        val gambar : ImageView = findViewById(R.id.iv_gambar)
        val nama   : TextView = findViewById(R.id.tv_detail)
        val detailkuliner : TextView = findViewById(R.id.tv_detail)


        val bundle: Bundle?= intent.extras
        val bName = bundle!!.getStringArrayList(    "idnama")
        val bGambar = bundle.getInt(    "idgambar")
        val bdetail =bundle.getString(  "detaillList")

        gambar.setImageResource(bGambar)
        nama.text= bName
        detailkuliner.text.=bdetail
    }
}