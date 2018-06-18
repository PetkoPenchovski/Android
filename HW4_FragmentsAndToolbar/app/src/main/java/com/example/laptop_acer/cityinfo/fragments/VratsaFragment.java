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

import static com.example.laptop_acer.cityinfo.constants.Constants.VRATSA_URL;
import static com.example.laptop_acer.cityinfo.constants.Constants.VRATSA_INFO;

public class VratsaFragment extends Fragment{

    private ImageView imageViewVratsa;
    private TextView textViewVratsa;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragment_vratsa, container, false);

        imageViewVratsa = view.findViewById(R.id.img_city_vratsa);
        textViewVratsa = view.findViewById(R.id.txt_vratsa);

        Picasso.get().load(VRATSA_URL).into(imageViewVratsa);
        textViewVratsa.setText(VRATSA_INFO);

        return view;
    }
}
