package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity15 : AppCompatActivity() {
    companion object {
        var clicked = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)
    }

    fun buhtml(view: View) {
        startActivity(Intent(this@MainActivity15, web3::class.java))
        clicked = 1
    }

    fun bucss(view: View) {
        startActivity(Intent(this@MainActivity15, web3::class.java))
        clicked = 2
    }

    fun bujs(view: View) {

        startActivity(Intent(this@MainActivity15, web3::class.java))
        clicked = 3
    }
}