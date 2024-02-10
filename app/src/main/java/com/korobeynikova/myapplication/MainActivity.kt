package com.korobeynikova.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    lateinit var no2free: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        no2free = findViewById(R.id.no2free)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            when (checkedId) {
                R.id.free -> {
                    no2free.visibility = View.GONE
                }
                R.id.nofreeee -> {
                    no2free.visibility = View.VISIBLE
                }
            }
        }
    }
}