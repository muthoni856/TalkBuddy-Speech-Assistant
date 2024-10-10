package com.example.somaquest // Change to your actual package name



import com.example.somaquest.CongratulationsActivity
import com.example.somaquest.InformalEducationActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.somaquest.R
//import kotlinx.android.synthetic.main.mainpage.* // Ensure you're using synthetic imports if you want to access views directly

class TeacherRegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.teacher_registration) // Make sure this matches your XML file name

        // Set onClick listeners for buttons to navigate to other activities
        val continue_button=findViewById<Button>(R.id.continue_button)
        continue_button.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this,MainPageActivity::class.java)
            startActivity(intent)
        }
        val LoginTeacher=findViewById<TextView>(R.id.login_link)
        LoginTeacher.setOnClickListener {
            // Intent to navigate to the FormalEducationActivity
            val intent = Intent(this,TeacherLoginActivity::class.java)
            startActivity(intent)
        }


        // Add more click listeners as needed for other cards or buttons
    }
}
