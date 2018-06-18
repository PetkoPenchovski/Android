package com.async_task.asynctask.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.async_task.asynctask.R;
import com.async_task.asynctask.object.Car;
import com.async_task.asynctask.threads.LoadImageTask;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    private ArrayList<Car> carsList;
    private CarViewHolder.OnItemClickListener listener;

    public CarAdapter(ArrayList<Car> carsList, CarViewHolder.OnItemClickListener listener) {
        this.carsList = carsList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CarAdapter.CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_car, parent, false);

        return new CarViewHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapter.CarViewHolder holder, final int position) {

        LoadImageTask loadImageTask = new LoadImageTask(holder.imgCar);
        loadImageTask.execute(carsList.get(position).getPictureUrl());

        holder.txtCarModel.setText(carsList.get(position).getModel());
        holder.txtCarYear.setText(carsList.get(position).getYear());
        holder.allItems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(carsList.get(position).getCarInfo());
            }
        });

    }

    @Override
    public int getItemCount() {
        return carsList.size();
    }

    public static class CarViewHolder extends RecyclerView.ViewHolder {

        private TextView txtCarModel;
        private TextView txtCarYear;
        private ImageView imgCar;
        private LinearLayout allItems;

        public CarViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);

            txtCarModel = itemView.findViewById(R.id.txt_car_model);
            txtCarYear = itemView.findViewById(R.id.txt_car_year);
            imgCar = itemView.findViewById(R.id.img_car);
            allItems = itemView.findViewById(R.id.linear_layout_cars);

        }

        public interface OnItemClickListener {
            void onItemClick(String info);
        }
    }
}

