package com.example.programmingpath;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);



    }

    int index = 0;
    int[] pics = new int[]{R.drawable.pic35, R.drawable.pic34};

    public void bunext(View view) {
        ImageView mypics = (ImageView) findViewById(R.id.imageView51);
        mypics.setImageResource(pics[index]);
        index++;
        if (index > 1)
            index = 0;
    }

    public void buback2(View view)
    {

        finish();
    }
}