package com.example.schoollanguage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter <MainAdapter.MainViewHolder> {
ArrayList <String> list;
String razdel1 ="Раздел 1";

    public MainAdapter(){
    list = new ArrayList<>();
    list.add(razdel1);
    list.add("Раздел 2");
    list.add("Раздел 3");
    list.add("Раздел 4");
    list.add("Раздел 5");


}
IOnclickListener listener;
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view =  inflater.inflate(R.layout.view_holder,parent,false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        mainViewHolder.listener=listener;
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.textView.setText(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {
        IOnclickListener listener;
        TextView textView;
        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClick(textView.getText().toString());
                }
            });
        }


    }
}
