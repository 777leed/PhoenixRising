package com.example.firstprototype

import android.content.ContentValues
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firstprototype.adapters.leaderAdapter
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import com.google.firebase.database.ktx.getValue

class LeaderBoard : AppCompatActivity() {
    lateinit var mAuth: FirebaseAuth
    lateinit var recyclerView: RecyclerView
    lateinit var database: DatabaseReference
    var list: ArrayList<PhxUser> = ArrayList<PhxUser>()
    var myAdapter: leaderAdapter = leaderAdapter(this, list)
    private val firebaseAuth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leader_board)
        supportActionBar?.hide()
        val arrowback = findViewById<ImageView>(R.id.back_arrowl)
        arrowback.setOnClickListener {
            this.finish()
        }
        recyclerView = findViewById<RecyclerView>(R.id.recyclerr)
        mAuth = FirebaseAuth.getInstance()
        val usernameinfirebase = mAuth!!.currentUser!!


        database = FirebaseDatabase.getInstance().reference.child("phx")
        recyclerView.hasFixedSize()
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        recyclerView.adapter= myAdapter


        database.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                for (ds in snapshot.children) {

                    val product = ds.getValue<PhxUser>()
                    if (product != null) {
                        list.add(product)
                        print(list + 777)
                    }
                }
                myAdapter.notifyDataSetChanged()
            }

            override fun onCancelled(error: DatabaseError) {
                Log.w(ContentValues.TAG, "Failed to read value.", error.toException())
            }
        })


    }
}