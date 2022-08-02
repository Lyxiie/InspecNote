package com.ridhamad.inspecnote.intro;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.ridhamad.inspecnote.R;

import java.util.Objects;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Objects.requireNonNull(getSupportActionBar()).hide();

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(this, IntroActivity.class);
            startActivity(intent);
            finish();
        }, 2000);
    }
}