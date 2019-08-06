package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import proff.freelancer.sherif.hagzapp.R;

public class ServiceActivity extends AppCompatActivity {

    TextView Salary,Address,Title,Description,Name;
    RatingBar Rate;
    ImageView Image;
    Button Review,ConSer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Salary = (TextView) findViewById(R.id.salary_service_activity);
        Address = (TextView) findViewById(R.id.address_srvice_activity);
        Description = (TextView) findViewById(R.id.description_service_Activity);
        Title = (TextView) findViewById(R.id.title_service_activity);
        Rate = (RatingBar) findViewById(R.id.rate_service_activity);
        Name = (TextView) findViewById(R.id.name_pres_service_activity);
        Image = (ImageView) findViewById(R.id.image_service_activity);
        Review = (Button) findViewById(R.id.review_service_activity);
        ConSer = (Button) findViewById(R.id.contact_service);

        ConSer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),ChatActivity.class);
                startActivity(intent);
            }
        });

        Review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ReviewActivity.class);
                startActivity(intent);
            }
        });

        final Intent intent = getIntent();
        final String title = intent.getStringExtra("title");
        final String description = intent.getStringExtra("description");
        final String address = intent.getStringExtra("address");
        final String salary = intent.getStringExtra("salary");
        final String name = intent.getStringExtra("name");
        final int image = intent.getIntExtra("image",1);
        float ra = intent.getFloatExtra("rate",1.0f);

        Salary.setText(salary);
        Title.setText(title);
        Description.setText(description);
        Address.setText(address);
        Rate.setRating(ra);
        Image.setImageResource(image);
        Name.setText(name);
        Name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(getApplicationContext(),PresenterActivity.class);
                intent1.putExtra("name",name);
                intent1.putExtra("image",image);
                startActivity(intent1);
            }
        });
    }
}
