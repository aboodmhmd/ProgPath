package com.example.programmingpath;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main31);

    }

    public void buback2(View view) {
        finish();
    }

    int index = 0;
    int[] pics = new int[]{R.drawable.img_20200917_wa0019, R.drawable.img_20200917_wa0021, R.drawable.a1};

    public void bunext(View view) {
        ImageView mypics = (ImageView) findViewById(R.id.imageView37);
        mypics.setImageResource(pics[index]);
        index++;
        if (index > 2)
            index = 0;
    }
}