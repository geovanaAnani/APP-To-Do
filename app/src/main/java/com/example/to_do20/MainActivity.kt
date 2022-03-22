package com.example.to_do20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.to_do20.adapter.TarefaAdpt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startbutton = findViewById<Button>(R.id.startbutton)
        val intstart = Intent (this,TarefaAdpt::class.java)

        startbutton.setOnClickListener {
            startActivity(intstart)
        }


    }
}