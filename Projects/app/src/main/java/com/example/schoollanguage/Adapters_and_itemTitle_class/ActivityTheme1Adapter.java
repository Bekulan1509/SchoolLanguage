package com.example.schoollanguage.Adapters_and_itemTitle_class;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoollanguage.R;

import java.util.ArrayList;

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

    public static class AdapterRazdel1 extends RecyclerView.Adapter<AdapterRazdel1.Razdel1ViewHolder> {

        private OnItemClickListener mClickListener;
        private ArrayList<ItemTitle> list;

        public interface OnItemClickListener {
            void onItemClick(int position);
        }
        public AdapterRazdel1(ArrayList<ItemTitle>list){
            this.list = list;
        }



        public void setOnItemClickListener(OnItemClickListener listener) {
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
           public Razdel1ViewHolder(@NonNull final View itemView) {
               super(itemView);
               textView = itemView.findViewById(R.id.textView_razdel1);
               cardView = itemView.findViewById(R.id.card_view_razdel1);
               itemView.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       position = getAdapterPosition();
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

            public void bind(ItemTitle itemTitle) {
             textView.setText(itemTitle.getTitle());
            }
        }
    }
}
