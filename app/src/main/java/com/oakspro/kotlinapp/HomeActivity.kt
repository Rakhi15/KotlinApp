package com.oakspro.kotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun open_listview(view: android.view.View) {
        intent= Intent(this, ListActivity::class.java)
        startActivity(intent)
    }
}