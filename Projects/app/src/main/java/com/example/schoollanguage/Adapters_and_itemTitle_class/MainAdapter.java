package com.example.schoollanguage.Adapters_and_itemTitle_class;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoollanguage.R;

import java.util.ArrayList;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private OnItemClickListener mClickListener;
    private ArrayList<ItemTitle> list;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        mClickListener = listener;

    }

    public MainAdapter(ArrayList<ItemTitle> list) {
        this.list = list;
    }


    @RequiresApi(api = Build.VERSION_CODES.M)
    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder, parent, false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);

        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder {


        TextView textView;
        CardView cardView;
        int position;

        @RequiresApi(api = Build.VERSION_CODES.M)
        public MainViewHolder(@NonNull final View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            cardView = itemView.findViewById(R.id.card_view);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                       position = getAdapterPosition();
                            mClickListener.onItemClick(position);
                }
            });
        }

        public void bind(ItemTitle itemTitle) {
            textView.setText(itemTitle.getTitle());
            switch (getAdapterPosition()) {
                case 0:

                    break;
            }
        }
    }

}

