package com.example.box

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etMessage: EditText = findViewById(R.id.etMessage)
        val btDisplay: Button = findViewById(R.id.btDisplay)

        btDisplay.setOnClickListener{
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("MAD LAB")
                .setMessage(etMessage.text.toString())
                .setPositiveButton("OK") {dialog, which ->

                }
                .create()
            alertDialog.show()

        }

    }
}