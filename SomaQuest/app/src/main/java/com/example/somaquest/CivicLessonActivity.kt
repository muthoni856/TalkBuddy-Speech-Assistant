package com.example.somaquest // Change to your actual package name

import com.example.somaquest.Exercise1Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.mainpage.* // Ensure you're using synthetic imports if you want to access views directly

class CivicLessonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.civic_lesson) // Make sure this matches your XML file name

        // Set onClick listeners for buttons to navigate to other activities
        val knittingButton1=findViewById<Button>(R.id.civicButton1)
        knittingButton1.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this, CivicExerciseActivity::class.java)
            startActivity(intent)
        }



        // Add more click listeners as needed for other cards or buttons
    }
}
