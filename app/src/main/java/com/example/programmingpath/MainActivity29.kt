package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity29 : AppCompatActivity() {

    companion object {
        var clicked=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main29)
    }

    fun buproj(view: View) {
        startActivity(Intent(this@MainActivity29,web7::class.java))
        clicked =5
    }
    fun bumsql(view: View) {
        startActivity(Intent(this@MainActivity29,web7::class.java))
        clicked =6
    }
    fun busql2(view: View) {
        startActivity(Intent(this@MainActivity29,web7::class.java))
        clicked =7
    }
    fun buintro3(view: View) {
        startActivity(Intent(this@MainActivity29,web7::class.java))
        clicked =8
    }
}