package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity14 : AppCompatActivity() {

    companion object {
        var clicked=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main14)
    }

    fun buproj(view: View) {
        startActivity(Intent(this@MainActivity14,web7::class.java))
       clicked =1
    }
    fun bumsql(view: View) {
startActivity(Intent(this@MainActivity14,web7::class.java))
       clicked =2
    }
    fun busql2(view: View) {
        startActivity(Intent(this@MainActivity14,web7::class.java))
      clicked =3
    }
    fun buintro3(view: View) {
        startActivity(Intent(this@MainActivity14,web7::class.java))
       clicked =4
    }
}