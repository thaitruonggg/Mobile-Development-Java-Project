package com.example.listview.design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview.R;
import com.example.listview.model.flowerModel;

import java.util.ArrayList;

public class listViewAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<flowerModel> flowerModels;

    public listViewAdapter(Context context, ArrayList<flowerModel> flowerModels) {
        this.context = context;
        this.flowerModels = flowerModels;
    }

    @Override
    public int getCount() {
        return flowerModels.size();
    }

    @Override
    public Object getItem(int position) {
        return flowerModels.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        HolderView holderView;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_item_list, parent, false);
            holderView = new HolderView(convertView);
            convertView.setTag(holderView);
        }
        else {
            holderView = (HolderView) convertView.getTag();
        }

        flowerModel model = flowerModels.get(position);
        holderView.icon.setImageResource(model.getIconId());
        holderView.name.setText(model.getFlowerName());

        return convertView;
    }

    private static class HolderView {
        private final ImageView icon;
        private final TextView name;

        public HolderView(View view) {
            icon = view.findViewById(R.id.icon_imageView);
            name = view.findViewById(R.id.name_textView);
        }
    }

}
