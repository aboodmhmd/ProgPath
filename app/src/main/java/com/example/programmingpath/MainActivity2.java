package com.example.programmingpath;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity2 extends AppCompatActivity {
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MobileAds.initialize(this,
                "ca-app-pub-7757590907378676~5657421441") ;//sdk
        interstitialAd=new InterstitialAd(this);

        interstitialAd.setAdUnitId("ca-app-pub-7757590907378676/9620717185");
        interstitialAd.loadAd(new AdRequest.Builder().build());

    }

    public void buma(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent2 =new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(myintent2);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent2 =new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(myintent2);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent2 =new Intent(this,MainActivity3.class);
            startActivity(myintent2);
        }
    }

    public void buweb(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent8 =new Intent(MainActivity2.this,MainActivity9.class);
                startActivity(myintent8);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent8 =new Intent(this,MainActivity9.class);
            startActivity(myintent8);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent8 =new Intent(this,MainActivity9.class);
            startActivity(myintent8);
        }
    }

    public void buwa(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent9 =new Intent(MainActivity2.this,MainActivity10.class);
                startActivity(myintent9);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent9 =new Intent(this,MainActivity10.class);
            startActivity(myintent9);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent9 =new Intent(this,MainActivity10.class);
            startActivity(myintent9);
        }
    }

    public void buai(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent10 =new Intent(MainActivity2.this,MainActivity11.class);
                startActivity(myintent10);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent10 =new Intent(this,MainActivity11.class);
            startActivity(myintent10);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent10 =new Intent(this,MainActivity11.class);
            startActivity(myintent10);
        }
    }

    public void buit(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent11 =new Intent(MainActivity2.this,MainActivity12.class);
                startActivity(myintent11);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent11 =new Intent(this,MainActivity12.class);
            startActivity(myintent11);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent11 =new Intent(this,MainActivity12.class);
            startActivity(myintent11);
        }
    }

    public void buds(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent12 =new Intent(MainActivity2.this,MainActivity13.class);
                startActivity(myintent12);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent12 =new Intent(this,MainActivity13.class);
            startActivity(myintent12);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent12 =new Intent(this,MainActivity13.class);
            startActivity(myintent12);
        }
    }

    public void budb(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent13 =new Intent(MainActivity2.this,MainActivity14.class);
                startActivity(myintent13);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent13 =new Intent(this,MainActivity14.class);
            startActivity(myintent13);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent13 =new Intent(this,MainActivity14.class);
            startActivity(myintent13);
        }
    }
}