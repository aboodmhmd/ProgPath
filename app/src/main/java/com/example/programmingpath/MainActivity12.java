package com.example.programmingpath;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity12 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        MobileAds.initialize(this,
                "ca-app-pub-7757590907378676~5657421441") ;//sdk
        interstitialAd=new InterstitialAd(this);

        interstitialAd.setAdUnitId("ca-app-pub-7757590907378676/9620717185");
        interstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void buit1(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_it1);
        popup.show();
    }

    public void buit2(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_it2);
        popup.show();
    }

    public void buit3(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_it3);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item5:
                Intent myintent17 = new Intent(this, MainActivity18.class);
                startActivity(myintent17);
                return true;
            case R.id.item6:
                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent44 = new Intent(MainActivity12.this, MainActivity45.class);
                        startActivity(myintent44);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent44 = new Intent(this, MainActivity45.class);
                    startActivity(myintent44);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent44 = new Intent(this, MainActivity45.class);
                    startActivity(myintent44);
                }

                return true;
            case R.id.item7:
                Intent myintent18 = new Intent(this, MainActivity19.class);
                startActivity(myintent18);
                return true;
            case R.id.item8:

                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent42 = new Intent(MainActivity12.this, MainActivity43.class);
                        startActivity(myintent42);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent42 = new Intent(this, MainActivity43.class);
                    startActivity(myintent42);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent42 = new Intent(this, MainActivity43.class);
                    startActivity(myintent42);
                }
                return true;
            case R.id.item9:
                Intent myintent19 = new Intent(this, MainActivity20.class);
                startActivity(myintent19);
                return true;
            case R.id.item10:

                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent45 = new Intent(MainActivity12.this, MainActivity46.class);
                        startActivity(myintent45);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent45 = new Intent(this, MainActivity46.class);
                    startActivity(myintent45);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent45 = new Intent(this, MainActivity46.class);
                    startActivity(myintent45);
                }
                return true;
            default:
                return false;
        }
    }
}