package com.example.laptop_acer.cityinfo.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.laptop_acer.cityinfo.R;
import com.squareup.picasso.Picasso;

import static com.example.laptop_acer.cityinfo.constants.Constants.BURGAS_INFO;
import static com.example.laptop_acer.cityinfo.constants.Constants.BURGAS_URL;

public class BurgasFragment extends Fragment {

    private ImageView imageViewBurgas;
    private TextView textViewBurgas;

    public BurgasFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragment_burgas, container, false);

        imageViewBurgas = view.findViewById(R.id.img_city_burgas);
        textViewBurgas = view.findViewById(R.id.txt_burgas);

        Picasso.get().load(BURGAS_URL).into(imageViewBurgas);
        textViewBurgas.setText(BURGAS_INFO);

        return view;
    }
}
