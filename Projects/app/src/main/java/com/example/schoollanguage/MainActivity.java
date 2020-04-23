package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;

import com.example.schoollanguage.Adapters_and_itemTitle_class.ItemTitle;
import com.example.schoollanguage.Adapters_and_itemTitle_class.MainAdapter;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity implements MainAdapter.OnItemClickListener {
    RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<ItemTitle>list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView  =findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);

        list = new ArrayList<>();
        list.add(new ItemTitle("ЛЕКСИКОЛОГИЯ"));
        list.add(new ItemTitle("ФОНЕТИКА"));
        list.add(new ItemTitle("МОРФОЛОГИЯ "));


        adapter = new MainAdapter(list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(MainActivity.this);
    }
    void openSecond(){
        Intent intent = new Intent(this,Razdel1Activity.class);
        startActivity(intent);

    } void openFonetikaRazdel(){
        Intent intent = new Intent(this,RazdelFonetikaActivity.class);
        startActivity(intent);

    }void openMorfologyActivity(){
        Intent intent = new Intent(this,MorfologyActivity.class);
        startActivity(intent);

    }


    @Override
    public void onItemClick(int position) {
        switch (position){
            case 0:
                openSecond();
                break;
            case 1:
                openFonetikaRazdel();
                break;
            case 2:
                openMorfologyActivity();

        }
    }
}

