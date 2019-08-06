package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import proff.freelancer.sherif.hagzapp.R;

public class ReviewActivity extends AppCompatActivity {

    Button ConfReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        ConfReview = (Button) findViewById(R.id.conf_review);

        ConfReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),ConfigurationActivity.class);
                startActivity(intent);
            }
        });
    }
}
