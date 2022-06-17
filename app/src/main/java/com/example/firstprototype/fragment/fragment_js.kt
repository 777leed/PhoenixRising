package com.example.firstprototype.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.example.firstprototype.R
import com.example.firstprototype.pdf.pdfActivity_c
import com.example.firstprototype.pdf.pdfActivity_js

class fragment_js : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_js, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pdflauncher = view.findViewById<ImageView>(R.id.Introjs)
        pdflauncher?.setOnClickListener {
            Toast.makeText(context,"WORKING777", Toast.LENGTH_LONG).show()
            activity?.let{
                val intent = Intent (it, pdfActivity_js::class.java)
                it.startActivity(intent)
            }
        }
    }


}