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

import static com.example.laptop_acer.cityinfo.constants.Constants.SOZOPOL_INFO;
import static com.example.laptop_acer.cityinfo.constants.Constants.SOZOPOL_URL;

public class SozopolFragment extends Fragment {

    private ImageView imageViewSozopol;
    private TextView textViewSozopol;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragment_sozopol, container, false);

        imageViewSozopol = view.findViewById(R.id.img_city_sozopol);
        textViewSozopol = view.findViewById(R.id.txt_sozopol);

        Picasso.get().load(SOZOPOL_URL).into(imageViewSozopol);
       textViewSozopol.setText(SOZOPOL_INFO);

        return view;
    }

}
