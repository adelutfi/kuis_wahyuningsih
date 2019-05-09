package com.irvania.sayuran.penyakit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.irvania.sayuran.R;

public class Activity_splash extends Activity {
    private int waktu = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R .layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(Activity_splash.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        },waktu);
    }
}
