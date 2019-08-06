package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import proff.freelancer.sherif.hagzapp.R;

public class PaymentActivity extends AppCompatActivity {

    Button pay;
    TextView Salary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        pay = (Button) findViewById(R.id.pay_payment_activity);
        Salary = (TextView) findViewById(R.id.salary_payment_activity);


        final Intent intent = getIntent();
        final String title = intent.getStringExtra("title");
        final String description = intent.getStringExtra("description");
        final String address = intent.getStringExtra("address");
        final String salary = intent.getStringExtra("salary");
        final String name = intent.getStringExtra("name");
        final int image = intent.getIntExtra("image",1);
        final float ra = intent.getFloatExtra("rate",1.0f);

        Salary.setText(salary);


        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MyBagActivity.ens=1;
                Intent intent = new Intent(getApplicationContext(),MyBagActivity.class);
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
    }
}
