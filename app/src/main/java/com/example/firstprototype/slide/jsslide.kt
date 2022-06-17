package com.example.firstprototype.slide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import br.com.phs.tablayout.adapters.ViewPagerAdapter
import com.example.firstprototype.R
import com.example.firstprototype.fragment.fragment_js
import com.example.firstprototype.fytb.fytbjs
import com.google.android.material.tabs.TabLayout

class jsslide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_jsslide)
        setUpTabs ()
    }
    private fun setUpTabs () {
        val viewPager=findViewById<ViewPager>(R.id.viewPagerjs)
        val tabs=findViewById<TabLayout>(R.id.tabsjs)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment (fragment_js(),"library")
        adapter.addFragment (fytbjs(),"Videos")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)!!.setIcon(R.drawable.online_library)
        tabs.getTabAt(1)!!.setIcon (R.drawable.video_marketing)
    }
}