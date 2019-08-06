package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import proff.freelancer.sherif.hagzapp.R;

public class MyBagActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    TextView Description,Salary,Title,Address,noData;
    RatingBar Rate;
    ImageView Image;
    public static int ens = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_bag);

        linearLayout = (LinearLayout) findViewById(R.id.linear_mybag_activity);
        Description = (TextView) findViewById(R.id.description_mybag_activity);
        Title = (TextView) findViewById(R.id.title_mybag_activity);
        Address = (TextView) findViewById(R.id.address_mybag_activity);
        Salary = (TextView) findViewById(R.id.salary_mybag_activity);
        noData = (TextView) findViewById(R.id.txt_mybag_acivity);
        Rate = (RatingBar) findViewById(R.id.rate_mybag_activity);
        Image = (ImageView) findViewById(R.id.image_mybag_activity);



        if (ens==1){
        final Intent intent = getIntent();
        final String title = intent.getStringExtra("title");
        final String description = intent.getStringExtra("description");
        final String address = intent.getStringExtra("address");
        final String salary = intent.getStringExtra("salary");
        final String name = intent.getStringExtra("name");
        final int image = intent.getIntExtra("image",1);
        final float ra = intent.getFloatExtra("rate",1.0f);

        Salary.setText(salary);
        Title.setText(title);
        Description.setText(description);
        Address.setText(address);
        Rate.setRating(ra);
        Image.setImageResource(image);

        ens=0;

            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(),ServiceActivity.class);
                    intent.putExtra("title",title);
                    intent.putExtra("description",description);
                    intent.putExtra("address",address);
                    intent.putExtra("salary",salary+"");
                    intent.putExtra("rate",ra);
                    intent.putExtra("image",image);
                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            });

        }else {
            linearLayout.setVisibility(View.GONE);
            noData.setVisibility(View.VISIBLE);
        }
    }
}
