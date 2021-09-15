package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity28 : AppCompatActivity() {
    companion object {
        var clicked=0
    }  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main28)
    }

    fun buintro2(view: View) {
        startActivity(Intent(this@MainActivity28,web6::class.java))
        clicked =5
    }
    fun bupyth4(view: View) {
        startActivity(Intent(this@MainActivity28,web6::class.java))
       clicked =6
    }
    fun bujs2(view: View) {
        startActivity(Intent(this@MainActivity28,web6::class.java))
        clicked =7
    }
    fun busql(view: View) {
        startActivity(Intent(this@MainActivity28,web6::class.java))
       clicked =8
    }
}