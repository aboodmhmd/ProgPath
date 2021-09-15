package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity11 : AppCompatActivity() {
    companion object {
        var clicked=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
    }

    fun buintro(view: View) {
        startActivity(Intent(this@MainActivity11,web5::class.java))
      clicked =1
    }
    fun bupyth3(view: View) {
        startActivity(Intent(this@MainActivity11,web5::class.java))
      clicked =2
    }
    fun buccc2(view: View) {
        startActivity(Intent(this@MainActivity11,web5::class.java))
     clicked =3
    }
    fun bujava2(view: View) {
        startActivity(Intent(this@MainActivity11,web5::class.java))
        clicked =4
    }
}