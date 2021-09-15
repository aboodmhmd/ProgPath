package com.example.programmingpath;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
    }
public void buback2(View view)
{
    finish();
}
    int index=0;
    int[] pics = new int[]{R.drawable.img_20200917_wa0029,R.drawable.img_20200917_wa0039,R.drawable.img_20200917_wa0031,R.drawable.img_20200917_wa0028,R.drawable.img_20200917_wa0023};
    public void bunext(View view) {
        ImageView mypics = (ImageView) findViewById(R.id.imageView49);
        mypics.setImageResource(pics[index]);
        index++;
        if (index > 4)
            index = 0;
    }
}