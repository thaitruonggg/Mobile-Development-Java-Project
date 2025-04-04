package com.example.recyclerview.design;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.model.recyclerViewArrayList;

import java.util.ArrayList;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.MyHolderView> {

    private final Context context;
    private final ArrayList<recyclerViewArrayList> recyclerViewArrayLists;
    private final LayoutInflater inflater;

    public recyclerViewAdapter(Context context, ArrayList<recyclerViewArrayList> recyclerViewArrayLists) {
        this.context = context;
        this.recyclerViewArrayLists = recyclerViewArrayLists;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyHolderView onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recyclerview_item,parent,false);
        return new MyHolderView(view);
    }

    @Override
    public void onBindViewHolder(MyHolderView holder, int position) {
        recyclerViewArrayList item = recyclerViewArrayLists.get(position);
        holder.imageView.setImageResource(item.getImage());
        holder.textView.setText(item.getName());
        holder.setListener(position);
    }

    @Override
    public int getItemCount() {
        return recyclerViewArrayLists.size();
    }

    public class MyHolderView extends RecyclerView.ViewHolder {

        private final ImageView imageView;
        private final TextView textView;

        public MyHolderView(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }

        public void setListener(int position) {
            recyclerViewArrayList item = recyclerViewArrayLists.get(position);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recyclerViewArrayList item = recyclerViewArrayLists.get(position);
                    Toast.makeText(context, "Flower name is: "+item.getName(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
