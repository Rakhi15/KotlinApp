package com.oakspro.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var mobileEd:EditText
    lateinit var passwordEd: EditText
    lateinit var errorMsg:TextView
    lateinit var loginBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mobileEd=findViewById<EditText>(R.id.mobile_ed)
        passwordEd=findViewById(R.id.password_ed)
        errorMsg=findViewById(R.id.error_msg)
        loginBtn=findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {

            errorMsg.visibility= View.INVISIBLE

            val user_mobile=mobileEd?.text.toString()
            val user_pass=passwordEd?.text.toString()

            if (!TextUtils.isEmpty(user_mobile) && !TextUtils.isEmpty(user_pass)){
                if (user_mobile.length==10){


                    if (user_mobile.equals("7801006150")){
                        if (user_pass.equals("112233")){
                            Toast.makeText(this, "Welcome to Kotlin App", Toast.LENGTH_SHORT).show()
                        }else{
                            errorMsg.text="Invalid Password"
                            errorMsg.visibility= View.VISIBLE
                        }
                    }else{
                        errorMsg.text="Invalid 10 Digit Mobile Number"
                        errorMsg.visibility= View.VISIBLE
                    }


                }else{
                    Toast.makeText(this, "Please Enter 10 Digit Valid Mobile",Toast.LENGTH_SHORT).show()
                    errorMsg.text="Invalid 10 Digit Mobile Number"
                    errorMsg.visibility= View.VISIBLE
                }
            }else{
                Toast.makeText(this, "Please Enter Mobile and Password",Toast.LENGTH_SHORT).show()
                errorMsg.text="Enter Password and Mobile"
                errorMsg.visibility= View.VISIBLE

                //comment

            }

        }

    }
}