package com.example.programmingpath;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);



    }
    public void buback2(View view) {
        finish();
    }

    int index = 0;
    int[] pics = new int[]{R.drawable.pic39, R.drawable.pic40};

    public void bunext(View view) {
        ImageView mypics = (ImageView) findViewById(R.id.imageView54);
        mypics.setImageResource(pics[index]);
        index++;
        if (index > 1)
            index = 0;
    }
}