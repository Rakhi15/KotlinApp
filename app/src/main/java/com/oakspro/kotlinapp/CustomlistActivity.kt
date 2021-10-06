package com.oakspro.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CustomlistActivity : AppCompatActivity() {

    lateinit var custom_listview:ListView
    var brands= arrayOf("Samsung", "Lg", "Xiaomi", "realme", "Oppo", "Oneplus", "Nokia", "Vivo", "Pixel", "Panasonic", "Sony")
    var imgs= arrayOf(R.drawable.samsung, R.drawable.lg, R.drawable.xiaomi, R.drawable.realme, R.drawable.oppo, R.drawable.oneplus, R.drawable.nokia, R.drawable.vivo, R.drawable.pixel, R.drawable.panasonic, R.drawable.sony)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customlist)
        //set ids

        custom_listview=findViewById(R.id.custom_listview)

        val customAdapter=CustomAdapter(this, brands, imgs)

        custom_listview.adapter=customAdapter

    }
}