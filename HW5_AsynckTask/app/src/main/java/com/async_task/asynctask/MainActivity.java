package com.async_task.asynctask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.async_task.asynctask.adapter.CarAdapter;
import com.async_task.asynctask.dataCars.FillCarArrayList;
import com.async_task.asynctask.object.Car;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements CarAdapter.CarViewHolder.OnItemClickListener {

    private RecyclerView recyclerView;
    private CarAdapter carAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FillCarArrayList.getFillList();
        FillCarArrayList.getFillCarList();

        ArrayList<Car> cars = FillCarArrayList.getCars();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        carAdapter = new CarAdapter(cars, this);
        recyclerView.setAdapter(carAdapter);

    }

    @Override
    public void onItemClick(String info) {
        Intent intent = new Intent(this, CarInformation.class);
        intent.putExtra("CAR_INFO", info);
        startActivity(intent);
    }

}
