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

public class MainActivity22 extends AppCompatActivity {
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        MobileAds.initialize(this,
                "ca-app-pub-7757590907378676~5657421441") ;//sdk
        interstitialAd=new InterstitialAd(this);

        interstitialAd.setAdUnitId("ca-app-pub-7757590907378676/9620717185");
        interstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void buweba(View view) {
        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent22 =new Intent(MainActivity22.this,MainActivity23.class);
                startActivity(myintent22);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent22 =new Intent(this,MainActivity23.class);
            startActivity(myintent22);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent22 =new Intent(this,MainActivity23.class);
            startActivity(myintent22);
        }
    }

    public void bumaa(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent23 =new Intent(MainActivity22.this,MainActivity24.class);
                startActivity(myintent23);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent23 =new Intent(this,MainActivity24.class);
            startActivity(myintent23);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent23 =new Intent(this,MainActivity24.class);
            startActivity(myintent23);
        }
    }

    public void buwaa(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent24 =new Intent(MainActivity22.this,MainActivity25.class);
                startActivity(myintent24);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent24 =new Intent(this,MainActivity25.class);
            startActivity(myintent24);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent24 =new Intent(this,MainActivity25.class);
            startActivity(myintent24);
        }
    }

    public void buaia(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent25 =new Intent(MainActivity22.this,MainActivity26.class);
                startActivity(myintent25);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent25 =new Intent(this,MainActivity26.class);
            startActivity(myintent25);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent25 =new Intent(this,MainActivity26.class);
            startActivity(myintent25);
        }
    }

    public void buita(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent26 =new Intent(MainActivity22.this,MainActivity27.class);
                startActivity(myintent26);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent26 =new Intent(this,MainActivity27.class);
            startActivity(myintent26);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent26 =new Intent(this,MainActivity27.class);
            startActivity(myintent26);
        }
    }

    public void budsa(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent27 =new Intent(MainActivity22.this,MainActivity28.class);
                startActivity(myintent27);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent27 =new Intent(this,MainActivity28.class);
            startActivity(myintent27);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent27 =new Intent(this,MainActivity28.class);
            startActivity(myintent27);
        }
    }

    public void budba(View view) {

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {
                Intent myintent28 =new Intent(MainActivity22.this,MainActivity29.class);
                startActivity(myintent28);
                interstitialAd.loadAd(new AdRequest.Builder().build());
            }
        });




        if(interstitialAd.isLoaded())
        {
            interstitialAd.show();
            Intent myintent28 =new Intent(this,MainActivity29.class);
            startActivity(myintent28);
        }
        else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
            Intent myintent28 =new Intent(this,MainActivity29.class);
            startActivity(myintent28);
        }
    }
  }