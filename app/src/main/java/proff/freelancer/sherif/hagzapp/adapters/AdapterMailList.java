package proff.freelancer.sherif.hagzapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.models.ModelMail;
import proff.freelancer.sherif.hagzapp.views.ChatActivity;
import proff.freelancer.sherif.hagzapp.views.ServiceActivity;

public class AdapterMailList extends RecyclerView.Adapter<AdapterMailList.MyHolder>{


    Context context;
    List<ModelMail> list;

    public AdapterMailList(Context context, List<ModelMail> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_mail,viewGroup,false);
        return new AdapterMailList.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {


        final String namePre = list.get(i).getPresName();
        String prsId = list.get(i).getPresId();
        String message = list.get(i).getMessage();
        String time = list.get(i).getTime();
        final int image = list.get(i).getImg();


        myHolder.Time.setText(time);
        myHolder.Message.setText(message);
        myHolder.NamePres.setText(namePre);
        myHolder.imageView.setImageResource(image);

        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,ChatActivity.class);
                intent.putExtra("name",namePre);
                intent.putExtra("image",image);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView Message,Time,NamePres;
        ImageView imageView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            Message = itemView.findViewById(R.id.item_mail_list_message);
            Time = itemView.findViewById(R.id.item_mail_list_time);
            NamePres = itemView.findViewById(R.id.item_mail_list_name);
            imageView = itemView.findViewById(R.id.item_mail_list_image);
        }
    }
}
