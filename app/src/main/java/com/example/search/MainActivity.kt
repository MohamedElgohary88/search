package com.example.search

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var btn1:Button
    lateinit var edittext :EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        intliaz()
        search()

    }
    fun intliaz(){
        btn1  = findViewById(R.id.btn1)
        edittext = findViewById(R.id.edittext)
    }
    fun search(){
        btn1.setOnClickListener {
            val page = edittext.text.toString()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data  = Uri.parse("http://$page.com")
            startActivity(intent)}
    }

}