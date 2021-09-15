package com.example.programmingpath;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

    }

    public void buback2(View view) {
        finish();
    }

    int index = 0;
    int[] pics = new int[]{R.drawable.pic36, R.drawable.pic38};

    public void bunext(View view) {
        ImageView mypics = (ImageView) findViewById(R.id.imageView52);
        mypics.setImageResource(pics[index]);
        index++;
        if (index > 1)
            index = 0;
    }
}