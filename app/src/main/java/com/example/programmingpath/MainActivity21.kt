package com.example.programmingpath

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.gms.ads.*


class MainActivity21 : AppCompatActivity() {
    companion object {
        var clicked = 0
    }
    private lateinit var mInterstitialAd: InterstitialAd
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main21)
        val cm= baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        MobileAds.initialize(this,
                "ca-app-pub-7757590907378676~5669556085")//sdk
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-7757590907378676/7279534119"//beny
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        if (networkInfo == null) {
            Toast.makeText(baseContext, "No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
    }

    fun buhtml(view: View) {
     //   startActivity(Intent(this@MainActivity21, web3::class.java))
     //   clicked = 10
        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo == null) {
            Toast.makeText(baseContext, "No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        mInterstitialAd.adListener = object: AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
                startActivity(Intent(this@MainActivity21,web3::class.java))
                clicked=10
            }
        }


        if (mInterstitialAd.isLoaded) {
            startActivity(Intent(this@MainActivity21,web3::class.java))
            mInterstitialAd.show()
        }
        else
        {
            startActivity(Intent(this@MainActivity21, web3::class.java))
            clicked=10
        }
        clicked=10
    }

    fun bucss(view: View) {
        // startActivity(Intent(this@MainActivity21, web3::class.java))
       // clicked = 12
        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo == null) {
            Toast.makeText(baseContext, "No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        mInterstitialAd.adListener = object: AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
                startActivity(Intent(this@MainActivity21,web3::class.java))
                clicked=12
            }
        }


        if (mInterstitialAd.isLoaded) {
            startActivity(Intent(this@MainActivity21,web3::class.java))
            mInterstitialAd.show()
        }
        else
        {
            startActivity(Intent(this@MainActivity21, web3::class.java))
            clicked=12
        }
        clicked=12
    }

    fun bujs(view: View) {

        //startActivity(Intent(this@MainActivity21, web3::class.java))
        //clicked = 4
        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo == null) {
            Toast.makeText(baseContext, "No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        mInterstitialAd.adListener = object: AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
                startActivity(Intent(this@MainActivity21,web3::class.java))
                clicked =4
            }
        }


        if (mInterstitialAd.isLoaded) {
            startActivity(Intent(this@MainActivity21,web3::class.java))
            mInterstitialAd.show()
        }
        else
        {
            startActivity(Intent(this@MainActivity21, web3::class.java))
            clicked =4
        }
        clicked =4
    }
    }