package com.example.schoollanguage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRazdel1 extends RecyclerView.Adapter<AdapterRazdel1.Razdel1ViewHolder> {

    private AdapterRazdel1.OnItemClickListener mClickListener;
    private ArrayList<ItemTitle> list;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }
    public AdapterRazdel1(ArrayList<ItemTitle>list){
        this.list = list;
    }



    public void setOnItemClickListener(AdapterRazdel1.OnItemClickListener listener) {
        mClickListener = listener;

    }
    @NonNull
    @Override
    public Razdel1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_razdel1, parent, false);
       Razdel1ViewHolder razdel1ViewHolder = new Razdel1ViewHolder(view);
        return razdel1ViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Razdel1ViewHolder holder, int position) {
        holder.bind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    TextView textView;
    CardView cardView;
    int position;
    public class Razdel1ViewHolder extends RecyclerView.ViewHolder {
       public Razdel1ViewHolder(@NonNull View itemView) {
           super(itemView);
           textView = itemView.findViewById(R.id.textView_razdel1);
           cardView = itemView.findViewById(R.id.card_view_razdel1);
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
