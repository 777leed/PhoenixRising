package com.example.firstprototype.slide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import br.com.phs.tablayout.adapters.ViewPagerAdapter
import com.example.firstprototype.R
import com.example.firstprototype.fragment.fragment_css
import com.example.firstprototype.fytb.fytbcss
import com.google.android.material.tabs.TabLayout

class cssslide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_cssslide)
        setUpTabs ()
    }
    private fun setUpTabs () {
        val viewPager=findViewById<ViewPager>(R.id.viewPagercss)
        val tabs=findViewById<TabLayout>(R.id.tabscss)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment (fragment_css(),"library")
        adapter.addFragment (fytbcss(),"Videos")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)!!.setIcon(R.drawable.online_library)
        tabs.getTabAt(1)!!.setIcon (R.drawable.video_marketing)
    }
}