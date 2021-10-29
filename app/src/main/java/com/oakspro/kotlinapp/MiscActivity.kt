package com.oakspro.kotlinapp

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog

class MiscActivity : AppCompatActivity() {

    lateinit var spinner:Spinner
    lateinit var mobiles:TextView
    lateinit var autoTv:AutoCompleteTextView
    val brands= arrayOf("Samsung", "Sony", "Xiaomi", "Nokia", "OnePlus", "Oppo", "Realme","Lenovo", "LG", "Apple")
    val names= arrayOf("Arunachal Pradesh", "Andhra Pradesh", "Bombay", "Bay of Bengal", "Bengolure", "Telangana", "Tamilnadu", "Kerala", "Kochi", "Kolkata")

    lateinit var messageTv:TextView
    lateinit var deleteBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_misc)
        //set ids

        spinner=findViewById(R.id.spinner)
        mobiles=findViewById(R.id.mobiles_text)
        autoTv=findViewById(R.id.ac_tv)
        messageTv=findViewById(R.id.message_tv)
        deleteBtn=findViewById(R.id.delet_btn)
        mobiles.text=""


        val adapter= ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, brands)
        spinner.adapter=adapter

        spinner?.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                var position:Int=p2
                when(position){
                    0-> mobiles.text="Samsung M30\n Samsung S12"
                    1->mobiles.text="No Mobiles available"
                    2->mobiles.text="Redmi Note 9 pro Max\n Redmi Note 10\n Redmi Note 10 Pro\n Redmi 10 LITE"
                    else->{
                        mobiles.text="OUT OF STOCK"
                    }

                }

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


        //autocomplete
        val adapter2= ArrayAdapter(this, android.R.layout.simple_list_item_1, names)
        autoTv.setAdapter(adapter2)

        //delete button
        deleteBtn.setOnClickListener {

            //alert dialog
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Delete Message")
            builder.setMessage("Do you want to delete this mesage?")
            builder.setCancelable(false)
            builder.setNegativeButton("Cancel"){dialog:DialogInterface, i:Int->
                dialog.dismiss()
            }
            builder.setPositiveButton("Yes"){dialog:DialogInterface, i:Int->
                messageTv.visibility=View.GONE
            }
            val alertDialog:AlertDialog=builder.create()
            alertDialog.show()
        }
    }
}