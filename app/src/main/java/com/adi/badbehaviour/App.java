package com.adi.badbehaviour;

import android.app.Application;

/**
 * Created by adi on 15/05/16.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        spam();
        spam();
        spam();
        spam();

        spam();
        spam();
        spam();
        spam();

    }

    private void spam() {
        new Thread() {
            @Override
            public void run() {
                while (true) ;
            }
        }.start();
    }

}
