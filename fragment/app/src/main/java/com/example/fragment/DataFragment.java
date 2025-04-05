package com.example.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DataFragment extends Fragment {

    TextView details;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        details = view.findViewById(R.id.details);

        Bundle bundle = this.getArguments();
        details.setText("Name: " + bundle.getString("username") +
                "\nMobile: " + bundle.getString("usermobile"));

        return view;
    }
}