package com.example.firstprototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import com.example.firstprototype.levels.Levelc


class Selectprog3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectprog3)
        supportActionBar?.hide()
        val gotolvlc = findViewById<RelativeLayout>(R.id.cq)
        gotolvlc.setOnClickListener{
            startActivity(Intent ( this, Levelc::class.java))
        }
    }
}