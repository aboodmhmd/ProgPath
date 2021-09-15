package com.example.programmingpath;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity23 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
    }

    public void bufronta(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_web);
        popup.show();

    }

    public void bubacka(View view) {

        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_web2);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent myintent30 = new Intent(this,MainActivity31.class);
                startActivity(myintent30);
                return true;
            case R.id.item2:
                Intent myintent14 = new Intent(this,MainActivity15.class);
                startActivity(myintent14);
                return true;
            case R.id.item3:
                Intent myintent32= new Intent(this,MainActivity32.class);
                startActivity(myintent32);
                return true;
            case R.id.item4:
                Intent myintent48 = new Intent(this,MainActivity49.class);
                startActivity(myintent48);
                return true;
            default:
                return false;

        }

    }






}
