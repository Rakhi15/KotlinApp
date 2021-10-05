package com.oakspro.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListActivity : AppCompatActivity() {

    val brands= arrayOf("Samsung", "Sony", "Xiaomi", "Nokia", "OnePlus", "Oppo", "Realme","Lenovo", "LG", "Apple")

    lateinit var listView:ListView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        //set ids

        listView=findViewById(R.id.listview);

        //arrayadapter
        val adapter= ArrayAdapter(this, android.R.layout.simple_list_item_1, brands)
        listView.adapter=adapter

    }
}