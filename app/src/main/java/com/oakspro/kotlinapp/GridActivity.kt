package com.oakspro.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class GridActivity : AppCompatActivity() {

    lateinit var gridView: GridView
    var brands= arrayOf("Samsung", "Lg", "Xiaomi", "realme", "Oppo", "Oneplus", "Nokia", "Vivo", "Pixel", "Panasonic", "Sony")
    var imgs= arrayOf(R.drawable.samsung, R.drawable.lg, R.drawable.xiaomi, R.drawable.realme, R.drawable.oppo, R.drawable.oneplus, R.drawable.nokia, R.drawable.vivo, R.drawable.pixel, R.drawable.panasonic, R.drawable.sony)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
        //set ids

        gridView=findViewById(R.id.gridview)

        //custom Adapter
        val adapter=GridAdapter(this, brands, imgs)
        gridView.adapter=adapter


    }
}