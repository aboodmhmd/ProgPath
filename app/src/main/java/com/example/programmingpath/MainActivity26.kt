package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity26 : AppCompatActivity() {
    companion object {
        var clicked=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main26)
    }

    fun buintro(view: View) {
        startActivity(Intent(this@MainActivity26,web8::class.java))
        clicked =5
    }
    fun bupyth3(view: View) {
        startActivity(Intent(this@MainActivity26,web8::class.java))
        clicked =6
    }
    fun buccc2(view: View) {
        startActivity(Intent(this@MainActivity26,web8::class.java))
        clicked =7
    }
    fun bujava2(view: View) {
        startActivity(Intent(this@MainActivity26,web8::class.java))
        clicked =8
    }
}