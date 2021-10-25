package com.oakspro.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText

class WebActivity : AppCompatActivity() {

    lateinit var urlBox:EditText
    lateinit var goBtn:Button
    lateinit var webView:WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        urlBox=findViewById(R.id.url_ed)
        goBtn=findViewById(R.id.go_btn)
        webView=findViewById(R.id.webView)


        webView.loadUrl("https://google.com")
        webView.webViewClient= WebViewClient()
        webView.settings.javaScriptEnabled=true

        goBtn.setOnClickListener {
            var url:String=urlBox.text.toString()

            webView.loadUrl(url)
        }

    }
}