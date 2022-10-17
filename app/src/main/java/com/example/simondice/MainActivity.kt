package com.example.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val blueButton: Button = findViewById(R.id.btnAzul)
        blueButton.setOnClickListener(){
            enviarAzul()
        }

        val redButton: Button = findViewById(R.id.btnRojo)
        redButton.setOnClickListener(){
            enviarRojo()
        }

        val greenButton: Button = findViewById(R.id.btnVerde)
        greenButton.setOnClickListener(){
            enviarVerde()
        }

        val yellowButton: Button = findViewById(R.id.btnAmarillo)
        yellowButton.setOnClickListener(){
            enviarAmarillo()
        }

        val startButton: Button = findViewById(R.id.btnInicio)
        startButton.setOnClickListener(){
            generarSecuencia()
        }

    }


    fun enviarAzul(){

    }

    fun enviarRojo(){

    }

    fun enviarVerde(){

    }

    fun enviarAmarillo(){

    }

    fun generarSecuencia(){

    }

}