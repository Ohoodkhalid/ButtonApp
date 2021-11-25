package com.example.buttonapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mytext :TextView
    lateinit var increaseButton :Button
    lateinit var decreaseButton:Button
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         mytext = findViewById(R.id.tView)
        increaseButton = findViewById(R.id.increaseButton)
        decreaseButton = findViewById(R.id.decreaseButton)

        increaseButton.setOnClickListener { increase() }
        decreaseButton.setOnClickListener { decrease() }


    }

    fun increase(){
      count++
        when {
            count==0 -> {
                mytext.setText(""+ count)
                mytext.setTextColor(Color.BLACK)
            }
            count<0 -> {
                mytext.setText(""+ count)
                mytext.setTextColor(Color.RED)
            }
            else -> {
                mytext.setText(""+ count)
                mytext.setTextColor(Color.GREEN)
            }
        }

    }
    fun decrease(){
      count--
        if(count==0){
            mytext.setText(""+ count)
            mytext.setTextColor(Color.BLACK)
        }
        else if(count<0){
            mytext.setText(""+ count)
            mytext.setTextColor(Color.RED)
        }
        else {
            mytext.setText(""+ count)
            mytext.setTextColor(Color.GREEN)
        }
    }
}