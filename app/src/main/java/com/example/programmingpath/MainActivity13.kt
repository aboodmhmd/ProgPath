package com.example.programmingpath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity13 : AppCompatActivity() {

    companion object {
        var clicked=0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)
    }

    fun busql(view: View) {
        startActivity(Intent(this@MainActivity13,web6::class.java))
        clicked =1
    }
    fun bujs2(view: View) {
        startActivity(Intent(this@MainActivity13,web6::class.java))
    clicked =2
    }
    fun bupyth4(view: View) {
        startActivity(Intent(this@MainActivity13,web6::class.java))
        clicked =3
    }

    fun buintro2(view: View) {
        startActivity(Intent(this@MainActivity13,web6::class.java))
     clicked =4
    }
}