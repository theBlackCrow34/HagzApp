package proff.freelancer.sherif.hagzapp.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.models.ModelChat;
import proff.freelancer.sherif.hagzapp.models.ModelNotification;

public class AdapterChat extends RecyclerView.Adapter<AdapterChat.MyHolder>{

    Context context;
    List<ModelChat> list;

    public AdapterChat(Context context, List<ModelChat> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_chat,viewGroup,false);
        return new AdapterChat.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        String message = list.get(i).getMessage();
        String receiver = list.get(i).getReceiver();
        String sender = list.get(i).getSend();
        String time = list.get(i).getTime();

        myHolder.Message.setText(message);
        myHolder.Time.setText(time);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView Message,Time;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            Message = itemView.findViewById(R.id.item_chat_message);
            Time = itemView.findViewById(R.id.item_chat_time);
        }
    }
}
