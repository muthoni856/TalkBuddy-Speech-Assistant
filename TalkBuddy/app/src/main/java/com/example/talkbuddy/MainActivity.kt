package com.example.talkbuddy

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.speech.RecognizerIntent
import android.speech.SpeechRecognizer
import android.widget.Toast
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale
import android.widget.ImageButton
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import android.Manifest

class MainActivity : AppCompatActivity() {

    private val RQ_SPEECH_REC = 102
    private val RQ_MIC_PERMISSION=101

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        //Checking for microphone permission
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.RECORD_AUDIO)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,arrayOf(Manifest.permission.RECORD_AUDIO),RQ_MIC_PERMISSION)
        }
//initialize the ImageButton and Textview
        val imageButton4=findViewById<ImageButton>(R.id.imageButton4)
        val tvText = findViewById<TextView>(R.id.tv_text)

        imageButton4.setOnClickListener {
                askSpeechInput()
            }
        }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode==RQ_SPEECH_REC && resultCode== Activity.RESULT_OK){
            val result: ArrayList<String>? = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
            val recognizedText=result?.get(0)?:"No speech recognized"
            findViewById<TextView>(R.id.tv_text).text=recognizedText
        }
    }
    private fun askSpeechInput(){
       if(!SpeechRecognizer.isRecognitionAvailable(this)) {
           Toast.makeText(this, "Speech recognition is not available", Toast.LENGTH_SHORT).show() //checks if the phone is capable of doing the voice recognition
           }else{
               val i= Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
           i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
           i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.ENGLISH)
           i.putExtra(RecognizerIntent.EXTRA_PROMPT,"Hello there! Say something")
           startActivityForResult(i,RQ_SPEECH_REC)
       }
    }

    }

