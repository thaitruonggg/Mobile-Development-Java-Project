package com.example.gridview.design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;

import com.example.gridview.R;
import com.example.gridview.model.flowerModel;

import java.util.ArrayList;

public class gridViewAdapter extends ArrayAdapter<flowerModel> {
    public gridViewAdapter(Context context, ArrayList<flowerModel> flowerModels) {
        super(context, 0, flowerModels);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HolderView holderView;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.gridview_item_list,parent,false);
            holderView = new HolderView(convertView);
            convertView.setTag(holderView);
        }
        else {
            holderView = (HolderView) convertView.getTag();
        }

        flowerModel model = getItem(position);
        holderView.icons.setImageResource(model.getIconId());
        holderView.tv.setText(model.getText());

        return convertView;
    }

    private static class HolderView {
        private final ImageView icons;
        private final TextView tv;

        public HolderView(View view) {
            icons = view.findViewById(R.id.icon_id);
            tv = view.findViewById(R.id.text_id);
        }
    }
}
