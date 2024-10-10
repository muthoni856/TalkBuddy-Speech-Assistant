package com.example.somaquest // Change to your actual package name


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class InformalEducationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.informal_module) // Make sure this matches your XML file name

        // Set onClick listeners for buttons to navigate to other activities
        val InformalEducationButton1=findViewById<Button>(R.id.informalmoduleButton1)
        InformalEducationButton1.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this,KnittingActivity::class.java)
            startActivity(intent)
        }

        }

        }


        // Add more click listeners as needed for other cards or buttons


