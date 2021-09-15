package com.example.programmingpath;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

    }

    int index=0;
    int[] pics = new int[]{R.drawable.pii,R.drawable.pii2,R.drawable.pii3,R.drawable.pii4,R.drawable.pii5,R.drawable.pii6,R.drawable.pii7,R.drawable.pii8,R.drawable.pii9};
    public void bunext(View view) {
        ImageView mypics = (ImageView)findViewById(R.id.imageView41);
        mypics.setImageResource(pics[index]);
        index++;
        if (index>8)
            index=0;
    }

    public void buback2(View view) {
        finish();
    }
}