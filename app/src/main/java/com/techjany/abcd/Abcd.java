package com.techjany.abcd;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Abcd extends AppCompatActivity implements View.OnClickListener {

    TextView tvA, tvB, tvC, tvD, tvE, tvF, tvG, tvH, tvI, tvJ, tvK, tvL, tvM, tvN, tvO, tvP, tvQ, tvR, tvS, tvT, tvU, tvV, tvW, tvX, tvY, tvZ;

    private int voiceEN[] = {R.raw.a, R.raw.b, R.raw.c, R.raw.d, R.raw.e,
            R.raw.f, R.raw.g, R.raw.h, R.raw.i, R.raw.j, R.raw.k,
            R.raw.l, R.raw.m, R.raw.n, R.raw.o, R.raw.p, R.raw.q, R.raw.r,
            R.raw.s, R.raw.t, R.raw.u, R.raw.v, R.raw.w, R.raw.x, R.raw.y, R.raw.z};

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abcd);

        View decorView = getWindow().getDecorView();
        // Hide the status bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);


        tvA = (TextView) findViewById(R.id.tvA);
        tvA.setOnClickListener(this);

        tvB = (TextView) findViewById(R.id.tvB);
        tvB.setOnClickListener(this);

        tvC = (TextView) findViewById(R.id.tvC);
        tvC.setOnClickListener(this);

        tvD = (TextView) findViewById(R.id.tvD);
        tvD.setOnClickListener(this);

        tvE = (TextView) findViewById(R.id.tvE);
        tvE.setOnClickListener(this);

        tvF = (TextView) findViewById(R.id.tvF);
        tvF.setOnClickListener(this);

        tvG = (TextView) findViewById(R.id.tvG);
        tvG.setOnClickListener(this);

        tvH = (TextView) findViewById(R.id.tvH);
        tvH.setOnClickListener(this);

        tvI = (TextView) findViewById(R.id.tvI);
        tvI.setOnClickListener(this);

        tvJ = (TextView) findViewById(R.id.tvJ);
        tvJ.setOnClickListener(this);

        tvK = (TextView) findViewById(R.id.tvK);
        tvK.setOnClickListener(this);

        tvL = (TextView) findViewById(R.id.tvL);
        tvL.setOnClickListener(this);

        tvM = (TextView) findViewById(R.id.tvM);
        tvM.setOnClickListener(this);

        tvN = (TextView) findViewById(R.id.tvN);
        tvN.setOnClickListener(this);

        tvO = (TextView) findViewById(R.id.tvO);
        tvO.setOnClickListener(this);

        tvP = (TextView) findViewById(R.id.tvP);
        tvP.setOnClickListener(this);

        tvQ = (TextView) findViewById(R.id.tvQ);
        tvQ.setOnClickListener(this);

        tvR = (TextView) findViewById(R.id.tvR);
        tvR.setOnClickListener(this);

        tvS = (TextView) findViewById(R.id.tvS);
        tvS.setOnClickListener(this);

        tvT = (TextView) findViewById(R.id.tvT);
        tvT.setOnClickListener(this);

        tvU = (TextView) findViewById(R.id.tvU);
        tvU.setOnClickListener(this);

        tvV = (TextView) findViewById(R.id.tvV);
        tvV.setOnClickListener(this);

        tvW = (TextView) findViewById(R.id.tvW);
        tvW.setOnClickListener(this);

        tvX = (TextView) findViewById(R.id.tvX);
        tvX.setOnClickListener(this);

        tvY = (TextView) findViewById(R.id.tvY);
        tvY.setOnClickListener(this);

        tvZ = (TextView) findViewById(R.id.tvZ);
        tvZ.setOnClickListener(this);


    }



    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.tvA:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(this, voiceEN[0]);
                mp.setLooping(false);
                mp.start();

                break;

            case R.id.tvB:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[1]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvC:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[2]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvD:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[3]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvE:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[4]);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.tvF:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[5]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvG:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[6]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvH:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[7]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvI:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[8]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvJ:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[9]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvK:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[10]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvL:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[11]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvM:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[12]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvN:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[13]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvO:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[14]);
                mp.setLooping(false);
                mp.start();

                break;

            case R.id.tvP:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[15]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvQ:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[16]);
                mp.setLooping(false);
                mp.start();

                break;
            case R.id.tvR:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[17]);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.tvS:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[18]);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.tvT:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[19]);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.tvU:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[20]);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.tvV:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[21]);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.tvW:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[22]);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.tvX:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[23]);
                mp.setLooping(false);
                mp.start();
                break;

            case R.id.tvY:

                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[24]);
                mp.setLooping(false);
                mp.start();
                break;
            case R.id.tvZ:
                try {
                    if (mp.isPlaying()) {
                        mp.stop();
                        mp.release();
                    }
                }catch (Exception e){}
                mp = MediaPlayer.create(Abcd.this, voiceEN[25]);
                mp.setLooping(false);
                mp.start();
                break;
            }



    }
}



