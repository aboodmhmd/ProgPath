package com.example.programmingpath;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
    }

    public void bufront(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_web);
        popup.show();

    }

    public void buback(View view) {

        PopupMenu popup = new PopupMenu(this, view);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.menu_web2);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent myintent15 = new Intent(MainActivity9.this,MainActivity16.class);
                startActivity(myintent15);
                return true;
            case R.id.item2:
                Intent myintent20 = new Intent(MainActivity9.this,MainActivity21.class);
                startActivity(myintent20);
                return true;
            case R.id.item3:
                Intent myintent16 = new Intent(MainActivity9.this,MainActivity17.class);
                startActivity(myintent16);
                return true;
            case R.id.item4:
                Intent myintent43 = new Intent(MainActivity9.this,MainActivity44.class);
                startActivity(myintent43);
                return true;
            default:
             return false;

        }

        }






}
