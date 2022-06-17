package com.example.firstprototype.levels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstprototype.R
import com.example.firstprototype.pythonq.EasyPython
import com.example.firstprototype.pythonq.HardPython
import com.example.firstprototype.pythonq.NormalPython


class Levelsharp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_levels)

        val lvl1 = findViewById<Button>(R.id.lvl1)
        val lvl2 = findViewById<Button>(R.id.lvl2)
        val lvl3 = findViewById<Button>(R.id.lvl3)
        lvl1.setOnClickListener{
            startActivity(Intent ( this@Levelsharp, EasyPython::class.java))
        }
        lvl2.setOnClickListener{
            startActivity(Intent ( this@Levelsharp, NormalPython::class.java))
        }
        lvl3.setOnClickListener{
            startActivity(Intent ( this@Levelsharp, HardPython::class.java))
        }


    }
}