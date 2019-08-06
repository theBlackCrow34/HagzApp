package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.fragment.MailFragment;

public class PresenterActivity extends AppCompatActivity {


    TextView contactMe,Name;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presenter);

        contactMe = (TextView) findViewById(R.id.contact_me_pres_activity);
        Name = (TextView) findViewById(R.id.name_pres_activity);
        imageView = (ImageView) findViewById(R.id.image_pres_activity);

        final Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final int image = intent.getIntExtra("image",3);

        Name.setText(name);
        imageView.setImageResource(image);

        contactMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(getApplicationContext(), ChatActivity.class);
                intent1.putExtra("name",name);
                intent1.putExtra("image",image);
                startActivity(intent1);
            }
        });
    }
}
