package com.oakspro.kotlinapp

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView

class ImplicitActivity : AppCompatActivity() {

    lateinit var cameraBtn:Button
    lateinit var imageView: ImageView
    private var REQ_CODE:Int=123


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)
        //set ids

        cameraBtn=findViewById(R.id.camera_btn)
        imageView=findViewById(R.id.captured_img)


        cameraBtn.setOnClickListener {

            //implicit intent
            val intent:Intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, REQ_CODE)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==REQ_CODE){
            var photo:Bitmap= data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(photo)
        }
    }

}