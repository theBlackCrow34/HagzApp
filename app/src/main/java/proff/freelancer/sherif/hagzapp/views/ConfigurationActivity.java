package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import proff.freelancer.sherif.hagzapp.R;

public class ConfigurationActivity extends AppCompatActivity {

    Button agree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuration);

        agree = (Button) findViewById(R.id.agree_review);
        agree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainAppBarActivity.class);
                startActivity(intent);
                finishAffinity();
            }
        });
    }
}
