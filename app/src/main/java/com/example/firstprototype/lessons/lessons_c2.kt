package com.example.firstprototype.lessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import com.example.firstprototype.*
import com.example.firstprototype.slide.cssslide
import com.example.firstprototype.slide.htmlslide
import com.example.firstprototype.slide.jsslide
import com.example.firstprototype.slide.phpslide


class lessons_c2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons_c2)
        val relativeLayout = findViewById<RelativeLayout>(R.id.js)
        val php = findViewById<RelativeLayout>(R.id.php)
        val css = findViewById<RelativeLayout>(R.id.css)
        val html = findViewById<RelativeLayout>(R.id.html)
        relativeLayout.setOnClickListener{
            startActivity(Intent ( this@lessons_c2, jsslide::class.java))
        }
        php.setOnClickListener{
            startActivity(Intent ( this@lessons_c2, phpslide::class.java))
        }
        css.setOnClickListener{
            startActivity(Intent ( this@lessons_c2, cssslide::class.java))
        }
        html.setOnClickListener{
            startActivity(Intent ( this@lessons_c2, htmlslide::class.java))
        }

    }
}