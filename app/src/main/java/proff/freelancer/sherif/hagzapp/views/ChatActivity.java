package proff.freelancer.sherif.hagzapp.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.adapters.AdapterChat;
import proff.freelancer.sherif.hagzapp.adapters.AdapterMailList;
import proff.freelancer.sherif.hagzapp.models.ModelChat;
import proff.freelancer.sherif.hagzapp.models.ModelMail;

public class ChatActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterChat adapterChat;
    List<ModelChat> list;
    TextView Name;
    EditText enterMesaage;
    ImageView Image,sendMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        int  image = intent.getIntExtra("image",3);

        Image = (ImageView) findViewById(R.id.image_chat_activity);
        Name = (TextView) findViewById(R.id.name_chat_activity);
        sendMessage = (ImageView) findViewById(R.id.send_message);
        enterMesaage = (EditText) findViewById(R.id.enter_message);

        Name.setText(name);
        Image.setImageResource(image);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_chat_activity);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        list = new ArrayList<>();

        sendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = enterMesaage.getText().toString();
                if (!TextUtils.isEmpty(text))
                {
                    list.add(new ModelChat(text,"username",name,"4 Nov ,12:30"));
                    adapterChat.notifyDataSetChanged();
                    enterMesaage.setText("");
                }
            }
        });

        addData();
    }
    private void addData() {


        list.add(new ModelChat("hello man","mohamed salah","sherif mohamed","4 Nov ,12:30"));
        list.add(new ModelChat("hello","sherif mohamed","mohamed salah","4 Nov ,12:35"));
        list.add(new ModelChat("how are you ?","mohamed salah","sherif mohamed","4 Nov ,12:42"));
        adapterChat = new AdapterChat(getApplicationContext(),list);
        adapterChat.notifyDataSetChanged();
        recyclerView.setAdapter(adapterChat);
    }
}
