package com.example.firstprototype.slide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import br.com.phs.tablayout.adapters.ViewPagerAdapter
import com.example.firstprototype.Achievements
import com.example.firstprototype.R
import com.example.firstprototype.fragment.fragment_cpp
import com.example.firstprototype.fytb.fytbcpp
import com.example.firstprototype.pdf.pdfActivity_cpp
import com.google.android.material.tabs.TabLayout

class cppslide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_cppslide)
        setUpTabs ()
    }
    private fun setUpTabs () {
        val viewPager=findViewById<ViewPager>(R.id.viewPagercpp)
//        val pdf=findViewById<ImageView>(R.id.Introcpp)
//        pdf.setOnClickListener {
//            startActivity(Intent ( this@cppslide, pdfActivity_cpp::class.java))
//        }
        val tabs=findViewById<TabLayout>(R.id.tabscpp)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment (fragment_cpp(),"library")
        adapter.addFragment (fytbcpp(),"Videos")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)!!.setIcon(R.drawable.online_library)
        tabs.getTabAt(1)!!.setIcon (R.drawable.video_marketing)
    }

}