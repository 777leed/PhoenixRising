package com.example.firstprototype.slide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import br.com.phs.tablayout.adapters.ViewPagerAdapter
import com.example.firstprototype.R
import com.example.firstprototype.fragment.fragment_java
import com.example.firstprototype.fytb.fytbjava
import com.google.android.material.tabs.TabLayout

class javaslide : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_javaslide)
        setUpTabs ()
    }
    private fun setUpTabs () {
        val viewPager=findViewById<ViewPager>(R.id.viewPagerjava)
        val tabs=findViewById<TabLayout>(R.id.tabsjava)
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment (fragment_java(),"library")
        adapter.addFragment (fytbjava(),"Videos")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)!!.setIcon(R.drawable.online_library)
        tabs.getTabAt(1)!!.setIcon (R.drawable.video_marketing)
    }
}