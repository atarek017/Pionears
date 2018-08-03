package com.example.ahmed.pionears;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScrean extends AppCompatActivity {
    ImageView imageView;
    Animation anime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screan);

        imageView = (ImageView) findViewById(R.id.imageView);
        anime = AnimationUtils.loadAnimation(this, R.anim.rotate);
        imageView.setAnimation(anime);

        Thread thread = new Thread() {

            @Override
            public void run() {
                try {
                    sleep(6000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread.start();

    }
}
