package com.example.multilicationtable

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //added variable to hold the multiplication button
       val Multiplybbutton = findViewById<Button>(R.id.MultiplyButton)
        //added variable to hold the user's input
        val NumInput = findViewById<EditText>(R.id.NumText)

        // added a listener to listen for when the button is clicked
        Multiplybbutton.setOnClickListener {
              // created a variable to hold the switch between pages/screens
            val Intent = Intent(this, Multiplybbutton::class.java)
                /*When this is called, the current/home page is closed and the multiply
                 page is opened */
            startActivity(Intent)

        }


        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}