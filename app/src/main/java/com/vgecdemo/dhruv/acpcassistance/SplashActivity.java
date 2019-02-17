package com.vgecdemo.dhruv.acpcassistance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        textView = (TextView) findViewById(R.id.tv1);
        imageView = (ImageView) findViewById(R.id.iv1);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        textView.startAnimation(myanim);
        imageView.startAnimation(myanim);
        final Intent i = new Intent(this,LoginActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(i);
                    finish();
                }
            }
        };
                timer.start();
    }
}
