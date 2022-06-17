package com.example.firstprototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import com.example.firstprototype.levels.Levelcss


class Selectprog2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectprog2)
        supportActionBar?.hide()
        val gotolvlj = findViewById<RelativeLayout>(R.id.cssq)
        gotolvlj.setOnClickListener{
            startActivity(Intent ( this, Levelcss::class.java))
        }
    }
}