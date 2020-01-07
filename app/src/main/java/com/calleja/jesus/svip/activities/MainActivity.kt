package com.calleja.jesus.svip.activities

import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.MenuItem
import com.calleja.jesus.mylibrary.interfaces.ToolbarActivity
import com.calleja.jesus.svip.R
import com.calleja.jesus.svip.fragments.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : ToolbarActivity() {

    private var prevBottomSelected: MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViewPager(getPagerAdapter())
        setUpBottomNavigationBar()

    }

    private fun getPagerAdapter(): PagerAdapter {
        val adapter = com.calleja.jesus.svip.adapters.PagerAdapter(supportFragmentManager)
        adapter.addFragment(ReasonOneFragment())
        adapter.addFragment(ReasonTwoFragment())
        adapter.addFragment(ReasonThreeFragment())
        adapter.addFragment(ReasonFourFragment())
        adapter.addFragment(ReasonFiveFragment())
        return adapter
    }

    private fun setUpViewPager(adapter: PagerAdapter) {
        viewPager.adapter = adapter
        viewPager.offscreenPageLimit = adapter.count //Máx number of tabs in memory
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(p0: Int) {}
            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {}
            override fun onPageSelected(position: Int) {
                if (prevBottomSelected == null) {
                    bottomNavigation.menu.getItem(0).isChecked = false
                } else {
                    prevBottomSelected!!.isChecked = false
                }
                bottomNavigation.menu.getItem(position).isChecked = true
                prevBottomSelected = bottomNavigation.menu.getItem(position)
            }
        })
    }

    private fun setUpBottomNavigationBar() {
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_nav_reason_one -> {
                    viewPager.currentItem = 0
                    true
                }
                R.id.bottom_nav_reason_two -> {
                    viewPager.currentItem = 1
                    true
                }
                R.id.bottom_nav_reason_three -> {
                    viewPager.currentItem = 2
                    true
                }

                R.id.bottom_nav_reason_four -> {
                    viewPager.currentItem = 3
                    true
                }

                R.id.bottom_nav_reason_five -> {
                    viewPager.currentItem = 4
                    true
                }
                else -> false
            }
        }
    }
}


