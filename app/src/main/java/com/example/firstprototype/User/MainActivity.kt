package com.example.firstprototype.User

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstprototype.*
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        auth = Firebase.auth
        val textView = findViewById<TextView>(R.id.create_acc)
        val fpass = findViewById<TextView>(R.id.fpass)
        val btn_login = findViewById<Button>(R.id.btnSignin)

        textView.setOnClickListener{
            startActivity(Intent ( this@MainActivity, Signup::class.java))
        }
        fpass.setOnClickListener{
            startActivity(Intent ( this@MainActivity, forgotPassword::class.java))
        }
        btn_login.setOnClickListener {
            doLogin()
        }
//
//
    }

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        updateUI(currentUser)
    }


    private fun doLogin() {
        val username_s = findViewById<EditText>(R.id.username_s)
        val password_s = findViewById<TextInputLayout>(R.id.password_s)
        if (username_s.text.toString().isEmpty()) {
            username_s.error = "Please enter username_s"
            username_s.requestFocus()
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(username_s.text.toString()).matches()) {
            username_s.error = "Please enter valid username_s"
            username_s.requestFocus()
            return
        }

        if (password_s.editText?.text.toString().isEmpty()) {
            password_s.error = "Please enter password"
            password_s.requestFocus()
            return
        }

        auth.signInWithEmailAndPassword(username_s.text.toString(),password_s.editText?.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    updateUI(user)
                } else {

                    updateUI(null)
                }
            }
    }

    private fun updateUI(currentUser: FirebaseUser?) {

        if (currentUser != null) {
            if(currentUser.isEmailVerified) {
                startActivity(Intent(this, home::class.java))
                finish()

            }else{
                Toast.makeText(
                    baseContext, "Please verify your email address.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        } else {
            Toast.makeText(
                baseContext, "Login failed.",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}