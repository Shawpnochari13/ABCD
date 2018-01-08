package com.techjany.abcd;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.ArrayList;


public class Abcd extends AppCompatActivity {

    TextView tvA, tvB, tvC, tvD, tvE, tvF, tvG, tvH, tvI, tvJ, tvK, tvL, tvM, tvN, tvO, tvP, tvQ, tvR, tvS, tvT, tvU, tvV, tvW, tvX, tvY, tvZ;


    private MediaPlayer mp;
    Animation animScale;
    private ArrayList<SoundObject> soundObjects;



//    int[] alphabet = {R.raw.a, R.raw.b, R.raw.c, R.raw.d, R.raw.e, R.raw.f, R.raw.g, R.raw.h, R.raw.i, R.raw.j, R.raw.k, R.raw.i, R.raw.m, R.raw.n,
//            R.raw.o, R.raw.p, R.raw.q, R.raw.r, R.raw.s, R.raw.t, R.raw.u, R.raw.v, R.raw.w, R.raw.x, R.raw.y, R.raw.z};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        tvA = (TextView) findViewById(R.id.tvA);
        tvB = (TextView) findViewById(R.id.tvB);
        tvC = (TextView) findViewById(R.id.tvC);
        tvD = (TextView) findViewById(R.id.tvD);
        tvE = (TextView) findViewById(R.id.tvE);
        tvF = (TextView) findViewById(R.id.tvF);
        tvG = (TextView) findViewById(R.id.tvG);
        tvH = (TextView) findViewById(R.id.tvH);
        tvI = (TextView) findViewById(R.id.tvI);
        tvJ = (TextView) findViewById(R.id.tvJ);
        tvK = (TextView) findViewById(R.id.tvK);
        tvL = (TextView) findViewById(R.id.tvL);
        tvM = (TextView) findViewById(R.id.tvM);
        tvN = (TextView) findViewById(R.id.tvN);
        tvO = (TextView) findViewById(R.id.tvO);
        tvP = (TextView) findViewById(R.id.tvP);
        tvQ = (TextView) findViewById(R.id.tvQ);
        tvR = (TextView) findViewById(R.id.tvR);
        tvS = (TextView) findViewById(R.id.tvS);
        tvT = (TextView) findViewById(R.id.tvT);

        animScale = AnimationUtils.loadAnimation(this, R.anim.anim_scale);





        tvA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //EventHandlerClass.startMediaPlayer(v, alphabet[]);
            }
        });



    }


    }



