package com.example.programmingpath;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void buandroid(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob1);
        popup.show();
    }

    public void buios(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob2);
        popup.show();
    }

    public void buflutter(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob3);
        popup.show();
    }

    public void burn(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob4);
        popup.show();
    }

    public void buxamarin(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_mob5);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent myintent3 = new Intent(this, MainActivity4.class);
                startActivity(myintent3);
                return true;
            case R.id.item2:
                Intent myintent47 = new Intent(this, MainActivity48.class);
                startActivity(myintent47);
                return true;
            case R.id.item4:
                Intent myintent4 = new Intent(this, MainActivity5.class);
                startActivity(myintent4);
                return true;
            case R.id.item5:
                Intent myintent49 = new Intent(this, MainActivity50.class);
                startActivity(myintent49);
                return true;
            case R.id.item7:
                Intent myintent5 = new Intent(this, MainActivity6.class);
                startActivity(myintent5);
                return true;
            case R.id.item8:
                Intent myintent51 = new Intent(this, MainActivity52.class);
                startActivity(myintent51);
                return true;
            case R.id.item9:
                Intent myintent6 = new Intent(this, MainActivity7.class);
                startActivity(myintent6);
                return true;
            case R.id.item10:
                Intent myintent52 = new Intent(this, MainActivity53.class);
                startActivity(myintent52);
                return true;
            case R.id.item11:
                Intent myintent7 = new Intent(this, MainActivity8.class);
                startActivity(myintent7);
                return true;
            case R.id.item12:
                Intent myintent53 = new Intent(this, MainActivity54.class);
                startActivity(myintent53);
                return true;
            default:
                return false;
        }
    }
}