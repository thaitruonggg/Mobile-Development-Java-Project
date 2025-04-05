package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FirstFragment extends Fragment {

    Button goToSecondBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // If return 1 fragment
        // Toast.makeText(getActivity(),"I am Fragment", Toast.LENGTH_SHORT).show();
        // return inflater.inflate(R.layout.fragment_first, container, false);

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        goToSecondBtn = view.findViewById(R.id.btnSecond);
        goToSecondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment secondFrag = new SecondFragment();
                FragmentTransaction fm = getActivity().getSupportFragmentManager().beginTransaction();
                fm.replace(R.id.container,secondFrag).commit();
            }
        });

        return view;

    }
}