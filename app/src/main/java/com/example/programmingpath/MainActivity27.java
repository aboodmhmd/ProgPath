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

public class MainActivity27 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main27);
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
                Intent myintent37 = new Intent(this, MainActivity38.class);
                startActivity(myintent37);
                return true;
            case R.id.item6:

                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent58 = new Intent(MainActivity27.this, MainActivity59.class);
                        startActivity(myintent58);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent58 = new Intent(this, MainActivity59.class);
                    startActivity(myintent58);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent58 = new Intent(this, MainActivity59.class);
                    startActivity(myintent58);
                }
                return true;
            case R.id.item7:
                Intent myintent38 = new Intent(this, MainActivity39.class);
                startActivity(myintent38);
                return true;
            case R.id.item8:

                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent59 = new Intent(MainActivity27.this, MainActivity60.class);
                        startActivity(myintent59);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent59 = new Intent(this, MainActivity60.class);
                    startActivity(myintent59);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent59 = new Intent(this, MainActivity60.class);
                    startActivity(myintent59);
                }
                return true;
            case R.id.item9:
                Intent myintent39 = new Intent(this, MainActivity40.class);
                startActivity(myintent39);
                return true;
            case R.id.item10:

                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent60 = new Intent(MainActivity27.this, MainActivity61.class);
                        startActivity(myintent60);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent60 = new Intent(this, MainActivity61.class);
                    startActivity(myintent60);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent60 = new Intent(this, MainActivity61.class);
                    startActivity(myintent60);
                }
                return true;
            default:
                return false;
        }
    }
}