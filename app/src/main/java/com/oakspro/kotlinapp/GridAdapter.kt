package com.oakspro.kotlinapp

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class GridAdapter(private val context: Activity, private val brands:Array<String>, private val imgs:Array<Int>)
    :ArrayAdapter<String>(context, R.layout.grid_item, brands) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater=context.layoutInflater
        val View=inflater.inflate(R.layout.grid_item, null, true)

        val brandName=View.findViewById<TextView>(R.id.name)
        val brandImg=View.findViewById<ImageView>(R.id.img)

        brandName.text=brands[position]
        brandImg.setImageResource(imgs[position])

        return View;
    }
}