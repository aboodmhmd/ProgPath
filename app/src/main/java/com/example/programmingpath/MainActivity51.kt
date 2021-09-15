package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity51 : AppCompatActivity() {
    companion object {
        var clicked = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main51)
    }

    fun bukot(view: View) {
        startActivity(Intent(this@MainActivity51,web2::class.java))
        clicked =4
    }

    fun bupyth(view: View) {
        startActivity(Intent(this@MainActivity51,web2::class.java))
   clicked =6
    }

    fun bucplus(view: View) {
        startActivity(Intent(this@MainActivity51,web2::class.java))
       clicked =8
    }

    fun bucshar(view: View) {
        startActivity(Intent(this@MainActivity51,web2::class.java))
        clicked =9
    }

    fun bujava(view: View) {
        startActivity(Intent(this@MainActivity51,web2::class.java))
        clicked =10
    }

}