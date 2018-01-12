package com.techjany.abcd;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;



public class Abcd extends AppCompatActivity implements View.OnClickListener {

    TextView tvA, tvB, tvC, tvD, tvE, tvF, tvG, tvH, tvI, tvJ, tvK, tvL, tvM, tvN, tvO, tvP, tvQ, tvR, tvS, tvT, tvU, tvV, tvW, tvX, tvY, tvZ;


    MediaPlayer a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,vi,w,x,y,z;

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
        switch (v.getId())
        {
            case R.id.tvA:

                a = MediaPlayer.create(Abcd.this,R.raw.a);
                a.start();
                break;
            case R.id.tvB:
                b = MediaPlayer.create(Abcd.this,R.raw.b);
                b.start();

                break;
            case R.id.tvC:
                c = MediaPlayer.create(Abcd.this,R.raw.c);
                c.start();

                break;
            case R.id.tvD:
                d = MediaPlayer.create(Abcd.this,R.raw.d);
                d.start();

                break;
            case R.id.tvE:
                e = MediaPlayer.create(Abcd.this,R.raw.e);
                e.start();

                break;
            case R.id.tvF:
                f = MediaPlayer.create(Abcd.this,R.raw.f);
                f.start();

                break;
            case R.id.tvG:
                g = MediaPlayer.create(Abcd.this,R.raw.g);
                g.start();

                break;
            case R.id.tvH:
                h = MediaPlayer.create(Abcd.this,R.raw.h);
                h.start();

                break;
            case R.id.tvI:
                i = MediaPlayer.create(Abcd.this,R.raw.i);
                i.start();

                break;
            case R.id.tvJ:
                j = MediaPlayer.create(Abcd.this,R.raw.j);
                j.start();

                break;
            case R.id.tvK:
                k = MediaPlayer.create(Abcd.this,R.raw.k);
                k.start();

                break;
            case R.id.tvL:
                l = MediaPlayer.create(Abcd.this,R.raw.l);
                l.start();

                break;
            case R.id.tvM:
                m = MediaPlayer.create(Abcd.this,R.raw.m);
                m.start();

                break;
            case R.id.tvN:
                n = MediaPlayer.create(Abcd.this,R.raw.n);
                n.start();

                break;
            case R.id.tvO:
                o = MediaPlayer.create(Abcd.this,R.raw.o);
                o.start();

                break;

            case R.id.tvP:
                p = MediaPlayer.create(Abcd.this,R.raw.p);
                p.start();

                break;
            case R.id.tvQ:
                q = MediaPlayer.create(Abcd.this,R.raw.q);
                q.start();

                break;
            case R.id.tvR:
                r = MediaPlayer.create(Abcd.this,R.raw.r);
                r.start();
                break;

            case R.id.tvS:
                s = MediaPlayer.create(Abcd.this,R.raw.s);
                s.start();
                break;
            case R.id.tvT:
                t = MediaPlayer.create(Abcd.this,R.raw.t);
                t.start();
                break;
            case R.id.tvU:
                u = MediaPlayer.create(Abcd.this,R.raw.u);
                u.start();
                break;

            case R.id.tvV:
                vi = MediaPlayer.create(Abcd.this,R.raw.v);
                vi.start();
                break;

            case R.id.tvW:
                w = MediaPlayer.create(Abcd.this,R.raw.w);
                w.start();
                break;
            case R.id.tvX:
                x = MediaPlayer.create(Abcd.this,R.raw.x);
                x.start();
                break;

            case R.id.tvY:
                y = MediaPlayer.create(Abcd.this,R.raw.y);
                y.start();
                break;
            case R.id.tvZ:
                z = MediaPlayer.create(Abcd.this,R.raw.z);
                z.start();
                break;

        }
    }


}



