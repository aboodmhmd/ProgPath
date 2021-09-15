package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity25 : AppCompatActivity() {
    companion object {
        var clicked=0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main25)

    }
    fun bucshar2(view: View) {
        startActivity(Intent(this@MainActivity25,web8::class.java))
        clicked=1
    }
    fun buvb(view: View) {
        startActivity(Intent(this@MainActivity25,web8::class.java))
        clicked=2
    }
    fun buc(view: View) {
        startActivity(Intent(this@MainActivity25,web8::class.java))
        clicked=3
    }
    fun buccc(view: View) {
        startActivity(Intent(this@MainActivity25,web8::class.java))
        clicked=4
    }
}