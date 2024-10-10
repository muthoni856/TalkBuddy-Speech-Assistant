package com.example.somaquest // Change to your actual package name


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CivicEducationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.civic_education_module) // Make sure this matches your XML file name

        // Set onClick listeners for buttons to navigate to other activities
        val CivicEducationButton1=findViewById<Button>(R.id.CivicEducationButton1)
        CivicEducationButton1.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this,CivicLessonActivity::class.java)
            startActivity(intent)
        }


        // Add more click listeners as needed for other cards or buttons
    }
}
