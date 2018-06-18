package com.async_task.asynctask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CarInformation extends AppCompatActivity implements View.OnClickListener {

    private TextView carInfo;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_information);

        initViews();
        getAndSetTextOnTextView();
    }

    private void initViews() {
        carInfo = findViewById(R.id.txt_info);
        btnBack = findViewById(R.id.btn_info_back);
        btnBack.setOnClickListener(this);
    }

    private void getAndSetTextOnTextView() {
        Intent intent = this.getIntent();
        String intentValue = intent.getStringExtra("CAR_INFO");
        carInfo.setText(intentValue);
    }

    public void onClick(View v) {
        if (v.getId() == btnBack.getId()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
