package com.example.schoollanguage;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ActivityTheme1Adapter extends RecyclerView.Adapter<ActivityTheme1Adapter.Theme1VewHolder> {


    @NonNull
    @Override
    public Theme1VewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Theme1VewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Theme1VewHolder extends RecyclerView.ViewHolder {
        public Theme1VewHolder(@NonNull View itemView) {
            super(itemView);


        }
    }
}
