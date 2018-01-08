package com.techjany.abcd;

import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;

/**
 * Created by Star Gazer on 10/4/2017.
 */

public class EventHandlerClass {

    private static final String LOG_TAG = "EVENTHANDLER";

    private static MediaPlayer mp;

    public static void startMediaPlayer(View view, int[] alphabet){

        try{
            if(alphabet != null){
                if(mp != null)

                mp.reset();
                mp = MediaPlayer.create(view.getContext(), alphabet[0]);
                mp.start();
            }
        }catch (Exception e){
            Log.e(LOG_TAG,"failed to initialize media palyer:"+e.getMessage());
        }
    }

    public static void releasedMediaPlayer(View view, int soundID){


                if(mp != null){

                    mp.release();
                    mp = null;
                }

    }
}
