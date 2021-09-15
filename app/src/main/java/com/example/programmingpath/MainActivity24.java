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

public class MainActivity24 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
        MobileAds.initialize(this,
                "ca-app-pub-7757590907378676~5657421441") ;//sdk
        interstitialAd=new InterstitialAd(this);

        interstitialAd.setAdUnitId("ca-app-pub-7757590907378676/9620717185");
        interstitialAd.loadAd(new AdRequest.Builder().build());
    }

    public void buandroida(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob1);
        popup.show();
    }

    public void buiosa(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob2);
        popup.show();
    }

    public void bufluttera(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob3);
        popup.show();
    }

    public void burna(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob4);
        popup.show();
    }

    public void buxamarina(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob5);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent myintent32 = new Intent(this, MainActivity33.class);
                startActivity(myintent32);
                return true;
            case R.id.item2:
                Intent myintent50 = new Intent(this, MainActivity51.class);
                startActivity(myintent50);
                return true;
            case R.id.item4:
                Intent myintent33 = new Intent(this, MainActivity34.class);
                startActivity(myintent33);
                return true;
            case R.id.item5:
                Intent myintent54 = new Intent(this, MainActivity55.class);
                startActivity(myintent54);
                return true;
            case R.id.item7:
                Intent myintent34 = new Intent(this, MainActivity35.class);
                startActivity(myintent34);
                return true;
            case R.id.item8:

                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent55 = new Intent(MainActivity24.this, MainActivity56.class);
                        startActivity(myintent55);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent55 = new Intent(this, MainActivity56.class);
                    startActivity(myintent55);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent55 = new Intent(this, MainActivity56.class);
                    startActivity(myintent55);
                }
                return true;
            case R.id.item9:
                Intent myintent35 = new Intent(this, MainActivity36.class);
                startActivity(myintent35);
                return true;
            case R.id.item10:

                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent56 = new Intent(MainActivity24.this, MainActivity57.class);
                        startActivity(myintent56);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent56 = new Intent(this, MainActivity57.class);
                    startActivity(myintent56);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent56 = new Intent(this, MainActivity57.class);
                    startActivity(myintent56);
                }
                return true;

            case R.id.item11:
                Intent myintent36 = new Intent(this, MainActivity37.class);
                startActivity(myintent36);
                return true;
            case R.id.item12:

                interstitialAd.setAdListener(new AdListener()
                {
                    @Override
                    public void onAdClosed() {
                        Intent myintent57 = new Intent(MainActivity24.this, MainActivity58.class);
                        startActivity(myintent57);
                        interstitialAd.loadAd(new AdRequest.Builder().build());
                    }
                });




                if(interstitialAd.isLoaded())
                {
                    interstitialAd.show();
                    Intent myintent57 = new Intent(this, MainActivity58.class);
                    startActivity(myintent57);
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                    Intent myintent57 = new Intent(this, MainActivity58.class);
                    startActivity(myintent57);
                }
                return true;
            default:
                return false;
        }
    }
}