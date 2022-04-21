package com.example.basiclayout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)
        settingButtons()
    }
    @SuppressLint("CutPasteId")
    fun settingButtons() {
        val redButton = findViewById<Button>(R.id.button_red_fragment)
        val blueButton = findViewById<Button>(R.id.button_blue_fragment)

        redButton.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentFrame, RedFragment())
            fragmentTransaction.commit()
        }

        blueButton.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentFrame, BlueFragment())
            fragmentTransaction.commit()
        }
    }
}