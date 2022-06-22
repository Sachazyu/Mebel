package com.example.mebel;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

    CardView mejaBtn, kursiBtn, lemariBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        mejaBtn = view.findViewById(R.id.mejaBtn);
        kursiBtn = view.findViewById(R.id.kursiBtn);
        lemariBtn = view.findViewById(R.id.lemariBtn);

        mejaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(getActivity(), MejaActivity.class);
                startActivity(backHome);
            }
        });

        kursiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(getActivity(), KursiActivity.class);
                startActivity(backHome);
            }
        });

        lemariBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backHome = new Intent(getActivity(), LemariActivity.class);
                startActivity(backHome);
            }
        });

        return view;
    }
}