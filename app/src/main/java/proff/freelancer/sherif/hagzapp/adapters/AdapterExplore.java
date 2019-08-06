package proff.freelancer.sherif.hagzapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Rating;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;


import java.util.List;

import proff.freelancer.sherif.hagzapp.R;
import proff.freelancer.sherif.hagzapp.models.ModelExplore;
import proff.freelancer.sherif.hagzapp.views.PaymentActivity;
import proff.freelancer.sherif.hagzapp.views.ServiceActivity;

public class AdapterExplore extends RecyclerView.Adapter<AdapterExplore.MyHolder>{


    Context context;
    List<ModelExplore> list;

    public AdapterExplore(Context context, List<ModelExplore> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_explore,viewGroup,false);
        return new AdapterExplore.MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {

        final String title = list.get(i).getTitle();
        String prsId = list.get(i).getPresId();
        final String description = list.get(i).getDescription();
        final String address = list.get(i).getAddress();
        final int salary = list.get(i).getSalary();
        final float rate = list.get(i).getRate();
        final int image = list.get(i).getImg();
        final String name = list.get(i).getNamePres();

        myHolder.Rate.setRating(rate);
        myHolder.Salary.setText(salary+"");
        myHolder.Description.setText(description);
        myHolder.Title.setText(title);
        myHolder.Address.setText(address);
        myHolder.imageView.setImageResource(image);
        myHolder.Buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,PaymentActivity.class);
                intent.putExtra("title",title);
                intent.putExtra("description",description);
                intent.putExtra("address",address);
                intent.putExtra("salary",salary+"");
                intent.putExtra("rate",rate);
                intent.putExtra("image",image);
                intent.putExtra("name",name);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });



        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,ServiceActivity.class);
                intent.putExtra("title",title);
                intent.putExtra("description",description);
                intent.putExtra("address",address);
                intent.putExtra("salary",salary+"");
                intent.putExtra("rate",rate);
                intent.putExtra("image",image);
                intent.putExtra("name",name);
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

        TextView Address,Title,Description,Salary;
        RatingBar Rate;
        ImageView imageView,Buy;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            Address = itemView.findViewById(R.id.address_item_explore);
            Title = itemView.findViewById(R.id.title_item_explore);
            Description = itemView.findViewById(R.id.description_item_explore);
            Salary = itemView.findViewById(R.id.salary_item_explore);
            Rate = itemView.findViewById(R.id.rate_item_explore);
            imageView = itemView.findViewById(R.id.image_item_explore);
            Buy = itemView.findViewById(R.id.buy_item_explore);
        }
    }
}
