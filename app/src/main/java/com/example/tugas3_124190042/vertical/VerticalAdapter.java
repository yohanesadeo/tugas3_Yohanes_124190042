package com.example.tugas3_124190042.vertical;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tugas3_124190042.detail.DetailActivity;
import com.example.tugas3_124190042.model.MotorModel;
import com.example.tugas3_124190042.R;

import java.util.ArrayList;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.ViewHolder> {

    ArrayList<MotorModel> motorList;
    Context context;

    public VerticalAdapter(ArrayList<MotorModel> motorList, Context context) {
        this.motorList = motorList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.vertical_item, parent, false);
        return new ViewHolder(view);    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return motorList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivMotor;
        TextView tvMotor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMotor = itemView.findViewById(R.id.iv_vertical_item_image);
            tvMotor = itemView.findViewById(R.id.tv_vertical_item_title);
        }

        public void bind(int position) {
            Glide.with(context)
                    .load(motorList.get(position).getImage())
                    .into(ivMotor);
            tvMotor.setText(motorList.get(position).getTitle());
            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(context, DetailActivity.class).putExtra("EXTRA_MOTOR", motorList.get(position));
                context.startActivity(intent);
            });
        }
    }
}
