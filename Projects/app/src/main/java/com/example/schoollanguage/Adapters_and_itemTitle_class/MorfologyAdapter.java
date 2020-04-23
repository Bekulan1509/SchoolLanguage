package com.example.schoollanguage.Adapters_and_itemTitle_class;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoollanguage.MorfologyActivity;
import com.example.schoollanguage.R;

import java.util.ArrayList;

public class MorfologyAdapter extends RecyclerView.Adapter<MorfologyAdapter.MorfologyViewHolder> {
    private OnItemClickListener mClickListener;
    private ArrayList<ItemTitle> list;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        mClickListener = listener;

    }

    public MorfologyAdapter(ArrayList<ItemTitle> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public MorfologyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.morfology_view_holder,parent,false);
        return new MorfologyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MorfologyViewHolder holder, int position) {
holder.band(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MorfologyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        CardView cardView;
        public MorfologyViewHolder(@NonNull final View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView_morfology);
            cardView = itemView.findViewById(R.id.card_view_morfology);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    mClickListener.onItemClick(position);
                    new CountDownTimer(15, 20) {
                        @Override
                        public void onTick(long millisUntilFinished) {

                            itemView.setEnabled(false);
                        }

                        @Override
                        public void onFinish() {
                            itemView.setEnabled(true);
                        }
                    }.start();
                }
            });
                }


        public void band(ItemTitle itemTitle) {
            textView.setText(itemTitle.getTitle());
        }
    }
}
