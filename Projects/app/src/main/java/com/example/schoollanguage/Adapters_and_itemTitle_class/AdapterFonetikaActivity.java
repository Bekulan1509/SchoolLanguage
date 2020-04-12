package com.example.schoollanguage.Adapters_and_itemTitle_class;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.schoollanguage.R;

import java.util.ArrayList;

public class AdapterFonetikaActivity extends RecyclerView.Adapter<AdapterFonetikaActivity.FoneyikaViewHolder> {

    private ArrayList<ItemTitle> list;
    private AdapterFonetikaActivity.OnItemClickListener mClickListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public void setOnItemClickListener(AdapterFonetikaActivity.OnItemClickListener listener) {
        mClickListener = listener;

    }

    public AdapterFonetikaActivity(ArrayList<ItemTitle> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public FoneyikaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_fonetika, parent, false);
        return new FoneyikaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull FoneyikaViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    TextView textView;
    CardView cardView;
    int position;
    public class FoneyikaViewHolder extends RecyclerView.ViewHolder {
        public FoneyikaViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView_fonetika);
            cardView = itemView.findViewById(R.id.card_view_fonetika);
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
        }
    }
}
