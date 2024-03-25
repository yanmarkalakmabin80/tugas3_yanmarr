package com.example.tugas3_yanmarr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.TextView

class home() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    private lateinit var txt1: TextView
    private lateinit var btn1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
    }

//implisit inten
starActivity(intenOpenWeb.data)

        override fun writeToParcel(parcel: Parcel, flags: Int) {

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
