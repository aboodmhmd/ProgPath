package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity55 : AppCompatActivity() {
    companion object {
        var clicked=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main55)
    }

    fun buswift(view: View) {
        startActivity(Intent(this@MainActivity55, web3::class.java))
        clicked = 5
    }
    fun buobj(view: View) {
        startActivity(Intent(this@MainActivity55, web3::class.java))
       clicked = 6
    }
}