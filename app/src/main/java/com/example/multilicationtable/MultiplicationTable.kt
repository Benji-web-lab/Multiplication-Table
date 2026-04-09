package com.example.multilicationtable

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MultiplicationTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multiplication_table)

        // receiving data from the main activity
        val bundle: Bundle? = intent.extras
        val tableString = bundle?.getString("tableNumber")


        // convert the table number to an integer
        val tableNumber = tableString!!.toInt()

        // display the heading so we can see the value in action
        val multiplicationTable = findViewById<TextView>(R.id.textmultiply)
        multiplicationTable.text = "$tableNumber x table"

        var tabledisplay: String = "$tableNumber x tables \n\n"
        multiplicationTable.text = tabledisplay

        // declare the control variable
        var counter = 1
        while (counter <= 20) {  // check the control variable
            val answer = tableNumber * counter
            tabledisplay += "$tableNumber x $counter = ${answer}\n\n"
            counter++           // update the control variable
        }

        multiplicationTable.text = tabledisplay

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
