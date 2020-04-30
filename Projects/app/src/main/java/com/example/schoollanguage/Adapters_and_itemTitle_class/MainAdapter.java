package com.example.schoollanguage.Adapters_and_itemTitle_class;

import android.os.Build;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.schoollanguage.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> implements Filterable {
    private OnItemClickListener mClickListener;
     ArrayList<ItemTitle> list;
     ArrayList<ItemTitle> allList;




    public MainAdapter(ArrayList<ItemTitle> list) {
        this.list = list;
        this.allList = new ArrayList<>(list);
    }



    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<ItemTitle> filteredList = new ArrayList<>();
            if (constraint.toString().isEmpty()) {
                filteredList.addAll(allList);
            } else {
                for (ItemTitle item : allList) {
                    if (item.getTitle().toLowerCase().contains(constraint.toString().toLowerCase())) {
                        filteredList.add(item);
                    }
                }
            }
          FilterResults  filterResults = new FilterResults();
           filterResults.values = filteredList;

            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            list.clear();
            list.addAll((Collection<? extends ItemTitle>) results.values);
            notifyDataSetChanged();


        }
    };

    public interface OnItemClickListener {
        void onItemClick(int position);
    }


    public void setOnItemClickListener(OnItemClickListener listener) {
        mClickListener = listener;

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
            switch (getAdapterPosition()) {
                case 0:

                    break;
            }
        }
    }

}

