package com.example.programmingpath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView video5;
    MediaPlayer mMediaPlayer;
    int mCurrentVideoPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video5 = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.background3);
        video5.setVideoURI(uri);
        video5.start();
        video5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mMediaPlayer = mp;
                mMediaPlayer.setLooping(true);
                if (mCurrentVideoPosition != 0) {
                    mMediaPlayer.seekTo(mCurrentVideoPosition);
                    mMediaPlayer.start();
                }
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        mCurrentVideoPosition = mMediaPlayer.getCurrentPosition();

        video5.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();

        video5.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mMediaPlayer.release();
        mMediaPlayer = null;
    }



    public void buarabic(View view) {
        Intent myintent21 =new Intent(this,MainActivity22.class);
        startActivity(myintent21);
    }

    public void buenglish(View view) {
        Intent myintent = new Intent(this, MainActivity2.class);
        startActivity(myintent);
    }
}