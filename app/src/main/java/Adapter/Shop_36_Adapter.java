package Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import Model.Shop_36_Model;
import e.wolfsoft1.shop_36.R;

public class Shop_36_Adapter extends RecyclerView.Adapter<Shop_36_Adapter.MyViewHolder> {

    Context context;
    private ArrayList<Shop_36_Model> apple_jobs_list;

    int mypos = 0;


    public Shop_36_Adapter(Context context, ArrayList<Shop_36_Model> apple_jobs_list) {
        this.context = context;
        this.apple_jobs_list = apple_jobs_list;
    }

    @NonNull
    @Override
    public Shop_36_Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_36, viewGroup, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Shop_36_Adapter.MyViewHolder myViewHolder, int i) {

        Shop_36_Model movie = apple_jobs_list.get(i);

        myViewHolder.text.setText(movie.getText());

        if (i == 1) {
            myViewHolder.framelayout.setVisibility(View.VISIBLE);
            myViewHolder.viewline.setVisibility(View.GONE);

        } else {
            myViewHolder.framelayout.setVisibility(View.GONE);
        }

    }

    @Override
    public int getItemCount() {
        return apple_jobs_list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        View viewline;


        LinearLayout linear1;
        TextView text;

        FrameLayout framelayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            text = itemView.findViewById(R.id.text);
            framelayout = itemView.findViewById(R.id.framelayout);

            viewline = itemView.findViewById(R.id.viewline);


        }
    }
}
