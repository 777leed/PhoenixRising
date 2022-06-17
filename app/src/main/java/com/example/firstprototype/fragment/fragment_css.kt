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
import com.example.firstprototype.pdf.pdfActivity_css


class fragment_css : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_css, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pdflauncher = view.findViewById<ImageView>(R.id.Introcss)
        pdflauncher?.setOnClickListener {
            Toast.makeText(context,"WORKING777", Toast.LENGTH_LONG).show()
            activity?.let{
                val intent = Intent (it, pdfActivity_css::class.java)
                it.startActivity(intent)
            }
        }
    }
}