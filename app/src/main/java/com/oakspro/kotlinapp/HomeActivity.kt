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

    fun custom_list(view: android.view.View) {
        intent= Intent(this, CustomlistActivity::class.java)
        startActivity(intent)
    }

    fun gridview_click(view: android.view.View) {

        intent= Intent(this, GridActivity::class.java)
        startActivity(intent)
    }

    fun webview_click(view: android.view.View) {
        intent = Intent(this, WebActivity::class.java)
        startActivity(intent)
    }

    fun impl_click(view: android.view.View) {
        intent= Intent(this, ImplicitActivity::class.java)
        startActivity(intent)
    }

    fun misc_click(view: android.view.View) {
        intent= Intent(this, MiscActivity::class.java)
        startActivity(intent)
    }
}