package com.example.somaquest // Change to your actual package name


import com.example.somaquest.AdditionActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.somaquest.R
//import kotlinx.android.synthetic.main.mainpage.* // Ensure you're using synthetic imports if you want to access views directly

class EmergencyModuleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.emergencies_education_module) // Make sure this matches your XML file name

        // Set onClick listeners for buttons to navigate to other activities
        val EmergencyModuleButton1=findViewById<Button>(R.id.EmergencyModuleButton1)
        EmergencyModuleButton1.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this,FireLessonActivity::class.java)
            startActivity(intent)
        }



        // Add more click listeners as needed for other cards or buttons
    }
}
