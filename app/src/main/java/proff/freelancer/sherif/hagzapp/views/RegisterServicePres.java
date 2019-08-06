package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import proff.freelancer.sherif.hagzapp.R;

public class RegisterServicePres extends AppCompatActivity {

    Button loginPres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_service_pres);

        loginPres = (Button) findViewById(R.id.btn_create_pres);
        loginPres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainAppBarPresActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });
    }
}
