package com.example.exam11e3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btnStart).setOnClickListener{
            MyCustomView(this).iv.setImageResource(R.drawable.ic_action_name)
            MyCustomView(this).text.setText("Loading ...")
        }
        findViewById<Button>(R.id.btnStop).setOnClickListener{

            MyCustomView(this).iv.setImageResource(0)
            MyCustomView(this).text.setText("Loading stop.")
        }
    }
}