package com.example.programmingpath;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
    }


    public void buback22(View view) {
        finish();
    }

    int index=0;
    int[] pics = new int[]{R.drawable.img_20200917_wa0024,R.drawable.img_20200917_wa0036,R.drawable.img_20200917_wa0025};
    public void bunext2(View view) {
        ImageView mypics = (ImageView)findViewById(R.id.imageView40);
        mypics.setImageResource(pics[index]);
        index++;
        if (index>2)
            index=0;
    }
}