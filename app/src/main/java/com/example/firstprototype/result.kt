package com.example.firstprototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.getValue

class result : AppCompatActivity() {

    private lateinit var tv_name:TextView
    private lateinit var tv_score:TextView
    private lateinit var tv_congratulations:TextView
    private lateinit var btn_finish:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar?.hide()
        tv_name = findViewById(R.id.tv_name)
        tv_score = findViewById(R.id.tv_score)
        btn_finish = findViewById(R.id.btn_finish)
        tv_congratulations = findViewById(R.id.tv_congratulations)


        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = userName

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        val auth = FirebaseAuth.getInstance()
        val user = auth.currentUser
        if (user != null) {
            FirebaseDatabase.getInstance().reference.child("phx").child(user.displayName!!).get().addOnSuccessListener {
                val p = it.getValue<PhxUser>()
                if (p != null) {
                        p.XP= correctAnswers + p.XP
                        p.Username= user.displayName!!
                }
                FirebaseDatabase.getInstance().reference.child("phx").child(user.displayName!!).setValue(p)

                Log.i("firebase", "Got value ${it.value}")
            }.addOnFailureListener{
                Log.e("firebase", "Error getting data", it)
            }


        }


        if(correctAnswers >= 5){
            tv_congratulations.text = "Good Job!"
            tv_score.text = "You ansewred $correctAnswers Correct answers out of $totalQuestions"
        }
        if(correctAnswers < 5){
            tv_congratulations.text = "Good luck Next Time"
            tv_score.text = "You ansewred $correctAnswers Correct answers out of $totalQuestions"
        }


        btn_finish.setOnClickListener {
            startActivity(Intent(this@result,home::class.java))
        }

    }
}