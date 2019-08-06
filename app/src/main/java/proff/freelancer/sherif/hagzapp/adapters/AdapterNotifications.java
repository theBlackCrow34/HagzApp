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
import proff.freelancer.sherif.hagzapp.models.ModelNotification;

public class AdapterNotifications extends RecyclerView.Adapter<AdapterNotifications.MyHolder>{

    Context context;
    List<ModelNotification> list;

    public AdapterNotifications(Context context, List<ModelNotification> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_notification,viewGroup,false);
        return new AdapterNotifications.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        String message = list.get(i).getMessage();
        int image = list.get(i).getImage();
        String presId = list.get(i).getPresId();

        myHolder.Message.setText(message);
        myHolder.imageView.setImageResource(image);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder{

        TextView Message;
        ImageView imageView;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            Message = itemView.findViewById(R.id.item_notification_message);
            imageView = itemView.findViewById(R.id.item_notification_image);
        }
    }
}
