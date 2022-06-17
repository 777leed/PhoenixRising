package com.example.firstprototype.choose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import com.example.firstprototype.*


class Categorie2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categorie2)
        supportActionBar?.hide()
        val relativeLayout1 = findViewById<RelativeLayout>(R.id.webq)
        relativeLayout1.setOnClickListener {
            startActivity(Intent(this@Categorie2, Selectprog2::class.java))
        }

        val relativeLayout2 = findViewById<RelativeLayout>(R.id.oopq)
        relativeLayout2.setOnClickListener {
            startActivity(Intent(this@Categorie2, Selectprog::class.java))
        }

        val relativeLayout3 = findViewById<RelativeLayout>(R.id.r3q)
        relativeLayout3.setOnClickListener {
            startActivity(Intent(this@Categorie2, Selectprog3::class.java))
        }

    }
}