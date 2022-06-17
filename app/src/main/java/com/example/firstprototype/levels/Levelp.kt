package com.example.firstprototype.levels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstprototype.R
import com.example.firstprototype.pythonq.EasyPython
import com.example.firstprototype.pythonq.HardPython
import com.example.firstprototype.pythonq.NormalPython


class Levelp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_levels)

        val lvl1 = findViewById<Button>(R.id.lvl1)
        val lvl2 = findViewById<Button>(R.id.lvl2)
        val lvl3 = findViewById<Button>(R.id.lvl3)
        lvl1.setOnClickListener{
            startActivity(Intent ( this@Levelp, EasyPython::class.java))
        }
        lvl2.setOnClickListener{
            startActivity(Intent ( this@Levelp, NormalPython::class.java))
        }
        lvl3.setOnClickListener{
            startActivity(Intent ( this@Levelp, HardPython::class.java))
        }


    }
}