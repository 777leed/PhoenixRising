package com.example.firstprototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import com.example.firstprototype.levels.Levelj
import com.example.firstprototype.levels.Levelp
import com.example.firstprototype.levels.Levelsharp

class Selectprog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectprog)
        supportActionBar?.hide()
        val gotolvlp = findViewById<RelativeLayout>(R.id.pythontolvl)
        gotolvlp.setOnClickListener{
            startActivity(Intent ( this, Levelp::class.java))
        }
            val gotolvlsharp = findViewById<RelativeLayout>(R.id.cPlustolvl)
            gotolvlsharp.setOnClickListener{
                startActivity(Intent ( this, Levelsharp::class.java))
            }
            val gotolvlj = findViewById<RelativeLayout>(R.id.javaRtolvl)
            gotolvlj.setOnClickListener{
                startActivity(Intent ( this, Levelj::class.java))
            }
    }
}