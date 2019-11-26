package com.nicootech.test333;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    List<MessageData> ms = new ArrayList<>();
    public Activity activity;
    public MyAdapter(List<MessageData> msList, Activity activity){
        ms.addAll(msList);
        this.activity=activity;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = activity.getLayoutInflater().inflate(R.layout.item_message, parent, false);
        MyViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        MessageData data = ms.get(position);
        holder.text1.setText(data.topText);
        holder.text2.setText(data.buttonText);
        holder.imageBank.setImageDrawable(data.imageBank);
        holder.imageChev.setImageDrawable(data.imageChev);

    }

    @Override
    public int getItemCount() {
        return ms.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageBank;
        public ImageView imageChev;
        public TextView text1;
        public TextView text2;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageBank = itemView.findViewById(R.id.image_bank);
            imageChev = itemView.findViewById(R.id.image_chev);
            text1 = itemView.findViewById(R.id.txt_1);
            text2 = itemView.findViewById(R.id.txt_2);
        }
    }
}
