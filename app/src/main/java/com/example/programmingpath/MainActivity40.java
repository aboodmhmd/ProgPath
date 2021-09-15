package com.example.programmingpath;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main40);
    }

    public void buback2(View view) {

        finish();
    }

    int index=0;
    int[] pics = new int[]{R.drawable.ar16,R.drawable.ar17,R.drawable.ar18};
    public void bunext(View view) {
        ImageView mypics = (ImageView)findViewById(R.id.imageView41);
        mypics.setImageResource(pics[index]);
        index++;
        if (index>2)
            index=0;
    }
}