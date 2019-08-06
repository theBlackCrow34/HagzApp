package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import proff.freelancer.sherif.hagzapp.R;

public class MainOptionLogin extends AppCompatActivity {

    TextView login;
    Button loginAsPres,loginAsUser,noLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_option_login);

        login = (TextView) findViewById(R.id.login);
        noLogin = (Button) findViewById(R.id.no_login);
        loginAsPres = (Button) findViewById(R.id.login_as_presenter);
        loginAsUser = (Button) findViewById(R.id.login_as_user);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
        loginAsUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),RegisterUser.class);
                startActivity(intent);

            }
        });
        loginAsPres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterServicePres.class);
                startActivity(intent);
            }
        });
        noLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainAppBarActivity.class);
                startActivity(intent);
            }
        });
    }
}
