package com.example.firstprototype


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog

class Achievements : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_achievements)
        supportActionBar?.hide()
        val button = findViewById<ImageView>(R.id.imagelevel1)
        val button1 = findViewById<ImageView>(R.id.gamer)
        val back = findViewById<ImageView>(R.id.back_arrowa)
        back.setOnClickListener {
            this.finish()
        }
        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle("Level 1")
            //set message for alert dialog
            builder.setMessage("you have achieved your first goal")
            builder.setIcon(R.drawable.level1)
            // Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.show()

        }
        button1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //set title for alert dialog
            builder.setTitle("Level 1")
            //set message for alert dialog
            builder.setMessage("You are Steadly Leveling up good job!")
            builder.setIcon(R.drawable.gamer)
            // Create the AlertDialog
            val alertDialog: AlertDialog = builder.create()
            // Set other dialog properties
            alertDialog.show()

        }
    }
}