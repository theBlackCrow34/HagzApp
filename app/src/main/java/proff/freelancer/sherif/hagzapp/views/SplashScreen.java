package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import proff.freelancer.sherif.hagzapp.DrawerActivity;
import proff.freelancer.sherif.hagzapp.R;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),MainOptionLogin.class);
                // animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fad_out);
                startActivity(intent);
                // linearLayout.startAnimation(animation);
                finish();
            }
        },SPLASH_DISPLAY_LENGHT);
    }
}
