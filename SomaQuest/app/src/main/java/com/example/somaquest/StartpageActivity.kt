package com.example.somaquest // Change to your actual package name


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//import kotlinx.android.synthetic.main.mainpage.* // Ensure you're using synthetic imports if you want to access views directly

class StartpageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.startpage) // Make sure this matches your XML file name

        // Set onClick listeners for buttons to navigate to other activities
        val hub_instructor_button=findViewById<Button>(R.id.hub_instructor_button)
        hub_instructor_button.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this,TeacherRegistrationActivity::class.java)
            startActivity(intent)
        }

        val student_button=findViewById<Button>(R.id.student_button)
        student_button.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this,StudentRegistrationActivity::class.java)
            startActivity(intent)
        }

        // Add more click listeners as needed for other cards or buttons
    }
}
