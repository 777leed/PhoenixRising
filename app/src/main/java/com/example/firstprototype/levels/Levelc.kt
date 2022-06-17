package com.example.firstprototype.levels

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.firstprototype.Cq.EasyC
import com.example.firstprototype.R
import com.example.firstprototype.cssq.EasyCss
import com.example.firstprototype.pythonq.EasyPython
import com.example.firstprototype.pythonq.HardPython
import com.example.firstprototype.pythonq.NormalPython


class Levelc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_levels)

        val lvl1 = findViewById<Button>(R.id.lvl1)
        val lvl2 = findViewById<Button>(R.id.lvl2)
        val lvl3 = findViewById<Button>(R.id.lvl3)
        lvl1.setOnClickListener{
            startActivity(Intent ( this@Levelc, EasyC::class.java))
        }
        lvl2.setOnClickListener{
            startActivity(Intent ( this@Levelc,  EasyC::class.java))
        }
        lvl3.setOnClickListener{
            startActivity(Intent ( this@Levelc, EasyC::class.java))
        }


    }
}