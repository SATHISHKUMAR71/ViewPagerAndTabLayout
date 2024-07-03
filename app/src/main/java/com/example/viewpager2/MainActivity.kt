package com.example.viewpager2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager = findViewById<ViewPager2>(R.id.viewPager2)
        val images = mutableListOf<Int>()
        images.add(R.drawable.bunny)
        images.add(R.drawable.nice_img)
        images.add(R.drawable.tree)

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        TabLayoutMediator(findViewById(R.id.tabLayout),viewPager){tab,pos ->
            tab.text = "Image ${pos+1}"
        }.attach()
    }
}