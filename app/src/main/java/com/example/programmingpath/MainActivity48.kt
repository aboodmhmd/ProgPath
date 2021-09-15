package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View



class MainActivity48 : AppCompatActivity() {
    companion object {
        var clicked=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main48)
    }

    fun bujava(view: View) {
        startActivity(Intent(this@MainActivity48,web2::class.java))
        clicked =3
    }

    fun bukot(view: View) {
        startActivity(Intent(this@MainActivity48,web2 ::class.java))
        clicked=7
    }

    fun bupyth(view: View) {

        startActivity(Intent(this@MainActivity48,web2 ::class.java))
        clicked =5
    }

    fun bucplus(view: View) {
        startActivity(Intent(this@MainActivity48,web2::class.java))
        clicked =1
    }

    fun bucshar(view: View) {
        startActivity(Intent(this@MainActivity48, web2::class.java))
        clicked = 2
    }

    fun buccc(view: View) {}
}
