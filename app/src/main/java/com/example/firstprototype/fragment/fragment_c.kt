package com.example.firstprototype.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.firstprototype.R
import com.example.firstprototype.home
import com.example.firstprototype.pdf.pdfActivity_c


class fragment_c : Fragment() {

    lateinit var pdflauncher:ImageView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_c, container, false)



    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val pdflauncher = view.findViewById<ImageView>(R.id.Introc)
        pdflauncher?.setOnClickListener {
            Toast.makeText(context,"WORKING777", Toast.LENGTH_LONG).show()
            activity?.let{
                val intent = Intent (it, pdfActivity_c::class.java)
                it.startActivity(intent)
            }
        }
    }


}