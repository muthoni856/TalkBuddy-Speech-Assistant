package com.example.somaquest // Change to your actual package name


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FormalEducationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.formal_education_module) // Make sure this matches your XML file name

        // Set onClick listeners for buttons to navigate to other activities
        val FormalEducationButton1=findViewById<Button>(R.id.FormalEducationButton1)
        FormalEducationButton1.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this,MathModule::class.java)
            startActivity(intent)
        }
        val FormalEducationButton2=findViewById<Button>(R.id.FormalEducationButton2)
        FormalEducationButton2.setOnClickListener {
            // Intent to navigate to the com.example.somaquest.InformalEducationActivity
            val intent = Intent(this, MathModule::class.java)
            startActivity(intent)
        }


        // Add more click listeners as needed for other cards or buttons
    }
}
