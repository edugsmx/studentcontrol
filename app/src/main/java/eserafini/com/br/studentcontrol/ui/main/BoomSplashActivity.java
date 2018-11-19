package eserafini.com.br.studentcontrol.ui.main;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import eserafini.com.br.studentcontrol.R;

public class BoomSplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boom_splash);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                BoomSplashActivity.this.finish();
                System.exit(0);
            }
        }, 1000);
    }
}
