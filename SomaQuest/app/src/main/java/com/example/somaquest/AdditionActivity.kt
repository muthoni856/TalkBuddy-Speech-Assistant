package com.example.somaquest // Change to your actual package name

import com.example.somaquest.Exercise1Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.mainpage.* // Ensure you're using synthetic imports if you want to access views directly

class AdditionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.addition) // Make sure this matches your XML file name

        // Set onClick listeners for buttons to navigate to other activities
        val additionButton1=findViewById<Button>(R.id.additionButton1)
        additionButton1.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this, Exercise1Activity::class.java)
            startActivity(intent)
        }


        // Add more click listeners as needed for other cards or buttons
    }
}
