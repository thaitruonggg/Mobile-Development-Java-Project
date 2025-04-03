package com.example.lab2.Controller;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.lab2.Model.Country;
import com.example.lab2.R;

public class CountryAdapter extends ArrayAdapter<Country> {
    Context context;
    Country[] countries;

    public CountryAdapter(@NonNull Context context, int resource, @NonNull Country[] objects) {
        super(context, resource, objects);
        this.context = context;
        this.countries = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = ((Activity) context).getLayoutInflater();
        View row = layoutInflater.inflate(R.layout.custom_item, null);

        ImageView imageView_country = (ImageView) row.findViewById(R.id.row_imageView);
        TextView textView_country = (TextView) row.findViewById(R.id.row_textView_country);
        TextView textView_currency = (TextView) row.findViewById(R.id.row_textView_currency);

        textView_country.setText(countries[position].getName());
        textView_currency.setText("Currency: " + countries[position].getCurrency());
        imageView_country.setImageResource(R.drawable.albania);
        return row;

        //return super.getView(position, convertView, parent);
    }
}
