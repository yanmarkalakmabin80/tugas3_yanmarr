package com.example.tugas3_yanmarr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.text.ParsePosition
import java.util.jar.Attributes.Name

class home() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }
    private lateinit var kulinerRecyclerView: RecyclerView
    private lateinit var  kulinerAdapter:MyAdapter
    private lateinit var  listkuliner: ArrayList<datakuliner>
    private lateinit var detailkuliner: detailkuliner
    private lateinit var gambar :Array<Int>
    private lateinit var nama :Array<String>
    private lateinit var detail :Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        gambar  = arrayOf(
            R.drawable.papeda,
            R.drawable.papedabungkus,
            R.drawable.ulatsagu,
            R.drawable.sagubakar,
            R.drawable.keladi_tumbuk,
            R.drawable.ikanbakr,
            R.drawable.nasibambu,
            R.drawable.nasibambu,
            R.drawable.bakarbatu,
        )

        nama = arrayOf(
            "papeda","papeda bungkus","ulat sagu","sagu bakar","keladi tumbuk","Mujair Bakar","nasi bambu","Bakar batu"


        )
detail = arrayOf(
    getString(R.string.papeda),
    getString(R.string.papedabungkus),
    getString(R.string.ulatsagu),
    getString(R.string.sagubakar),
    getString(R.string.keladitumbuk),
    getString(R.string.Mujairbakar),
    getString(R.string.nasibambu),
    getString(R.string.bakarbatu),
)

        Private fun getDataUser (){
            for (i in   gambar.indices){
                val datakuliner = datakuliner(nama[i],gambar[i])
                listkuliner.add(datakuliner)


                var adapter = MyAdapter(listkuliner)
                listkulinerRecyclcerview = adapter
                adapter.setOnItemClickListener(object : MyAdapter.onItemClickListener{

                    override fun onItemClick(position: int){
                        intent = Intent(this@home,detailkuliner::class.java)
                        intent = putExtra(Name: "idgambar",listkuliner[position].gambar)
                        intent = putExtra(Name :"idnama",listkuliner[position].Nama)
                        intent = putExtra(Name"idDetailKuliner",listkuliner[position])







                    }
                })
            }
        }




        kulinerRecyclerView = findViewById(R.id.kuliner)
        listkuliner = ArrayList()

        listkuliner.add(datakuliner(R.drawable.papeda, Nama = "Papeda"))
        listkuliner.add(datakuliner(R.drawable.papedabungkus, Nama = "papeda Bungkus"))
        listkuliner.add(datakuliner(R.drawable.ulatsagu, Nama = "ulatsagu"))
        listkuliner.add(datakuliner(R.drawable.sagubakar, Nama = "sagu bakar"))
        listkuliner.add(datakuliner(R.drawable.keladi_tumbuk, Nama = "keladi tumbuk"))
        listkuliner.add(datakuliner(R.drawable.ikanbakr, Nama = "mujair bakar"))
        listkuliner.add(datakuliner(R.drawable.nasibambu, Nama = "nasi bambu"))
        listkuliner.add(datakuliner(R.drawable.bakarbatu, Nama = "bakar batu"))






        kulinerRecyclerView.layoutManager =LinearLayoutManager(this)
        kulinerRecyclerView.setHasFixedSize(true)
        kulinerAdapter = MyAdapter(listkuliner)
        kulinerRecyclerView.adapter= kulinerAdapter

    }


        override fun writeToParcel(parcel: Parcel , flags: Int) {

        }

        override fun describeContents(): Int {
            return 0
        }

        companion object CREATOR : Parcelable.Creator<home> {
            override fun createFromParcel(parcel: Parcel): home {
                return home(parcel)
            }


            override fun newArray(size: Int): Array<home?> {
                return arrayOfNulls(size)
            }
        }
    }
