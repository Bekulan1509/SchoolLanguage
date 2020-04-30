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
import com.example.schoollanguage.SyntaksysActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class AdapterSyntaksys extends RecyclerView.Adapter<AdapterSyntaksys.ViewHolderSyntaksys> {

    List<ItemTitle> list;
    private AdapterSyntaksys.OnItemClickListener mClickListener;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(AdapterSyntaksys.OnItemClickListener listener) {
        mClickListener = listener;

    }


    public AdapterSyntaksys(ArrayList<ItemTitle> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolderSyntaksys onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_holder_syntaksys, parent, false);
        return new ViewHolderSyntaksys(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSyntaksys holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    TextView textView;
    CardView cardView;
    int position;

    public class ViewHolderSyntaksys extends RecyclerView.ViewHolder {
        public ViewHolderSyntaksys(@NonNull final View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_view_syntaksys);
             textView = itemView.findViewById(R.id.textView_syntaksys);

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
