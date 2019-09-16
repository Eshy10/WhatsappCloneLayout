package com.example.whatsapp

import android.app.LauncherActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        actionBar.apply {
            title = "Whatsapp"

            val adapter = ViewPagerAdapter(supportFragmentManager)
            adapter.addFragment(ChatFragment(), "CHATS")
            adapter.addFragment(StatusFragment(), "STATUS")
            adapter.addFragment(CallFragment(), "CALLS")
            viewPager.adapter = adapter
            tabs.setupWithViewPager(viewPager)




        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
