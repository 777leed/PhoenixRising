package com.example.firstprototype.pdf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstprototype.R
import com.github.barteksc.pdfviewer.PDFView
class pdfActivity_js : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)
        supportActionBar?.hide()
        val pdfView = findViewById<PDFView>(R.id.pdfView)

        val src = "wsu-js-cheat-sheet.pdf"
        pdfView.fromAsset(src).load()
    }
}