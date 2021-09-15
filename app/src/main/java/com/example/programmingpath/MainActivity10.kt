package com.example.programmingpath

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.programmingpath.MainActivity10.Companion.clicked
import com.google.android.gms.ads.*

class MainActivity10 : AppCompatActivity() {
    companion object {
        var clicked = 0
    }

    private lateinit var mInterstitialAd: InterstitialAd
    lateinit var mAdView: AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
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

    fun bucshar2(view: View) {
        // startActivity(Intent(this@MainActivity10, web1::class.java))
        //  clicked=1
        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo == null) {
            Toast.makeText(baseContext, "No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
                startActivity(Intent(this@MainActivity10, web1::class.java))
                clicked = 1
            }
        }


        if (mInterstitialAd.isLoaded) {
            startActivity(Intent(this@MainActivity10, web1::class.java))
            mInterstitialAd.show()
        } else {
            startActivity(Intent(this@MainActivity10, web1::class.java))
            clicked = 1
        }
        clicked = 1
    }



    fun buvb(view: View) {
     //  startActivity(Intent(this@MainActivity10, web1::class.java))
      // clicked=2
        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo == null) {
            Toast.makeText(baseContext, "No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
                startActivity(Intent(this@MainActivity10, web1::class.java))
                clicked = 2
            }
        }


        if (mInterstitialAd.isLoaded) {
            startActivity(Intent(this@MainActivity10, web1::class.java))
            mInterstitialAd.show()
        } else {
            startActivity(Intent(this@MainActivity10, web1::class.java))
            clicked = 2
        }
        clicked = 2
    }





    fun buc(view: View) {
   //     startActivity(Intent(this@MainActivity10, web1::class.java))
      //  clicked=3
        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo == null) {
            Toast.makeText(baseContext, "No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
                startActivity(Intent(this@MainActivity10, web1::class.java))
                clicked = 3
            }
        }


        if (mInterstitialAd.isLoaded) {
            startActivity(Intent(this@MainActivity10, web1::class.java))
            mInterstitialAd.show()
        } else {
            startActivity(Intent(this@MainActivity10, web1::class.java))
            clicked = 3
        }
        clicked = 3
    }




    fun buccc(view: View) {
       // startActivity(Intent(this@MainActivity10, web1::class.java))
      //  clicked=4
        val cm = baseContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = cm.activeNetworkInfo
        if (networkInfo == null) {
            Toast.makeText(baseContext, "No internet Connection", Toast.LENGTH_LONG).show()
            this.finish()
        }
        mInterstitialAd.adListener = object : AdListener() {
            override fun onAdClosed() {
                mInterstitialAd.loadAd(AdRequest.Builder().build())
                startActivity(Intent(this@MainActivity10, web1::class.java))
                clicked = 4
            }
        }


        if (mInterstitialAd.isLoaded) {
            startActivity(Intent(this@MainActivity10, web1::class.java))
            mInterstitialAd.show()
        } else {
            startActivity(Intent(this@MainActivity10, web1::class.java))
            clicked = 4
        }
        clicked = 4
    }
}