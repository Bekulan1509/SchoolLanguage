package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity implements MainAdapter.OnItemClickListener {
    RecyclerView recyclerView;
    private MainAdapter adapter;
    private ArrayList<ItemTitle>list;
    private String f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
f = "helloo";


        recyclerView  =findViewById(R.id.recyclerView);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        list = new ArrayList<>();
        list.add(new ItemTitle(f));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));
        list.add(new ItemTitle("helloo2"));
        list.add(new ItemTitle("helloo3"));
        list.add(new ItemTitle("helloo4"));
        list.add(new ItemTitle("helloo5"));


        adapter = new MainAdapter(list);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(MainActivity.this);
    }
    void openSecond(String text){
        Intent intent = new Intent(this,Razdel1Activity.class);
        intent.putExtra("key",text);
        startActivity(intent);

    }

    @Override
    public void onItemClick(int position) {
        switch (position){
            case 0:
                openSecond("i'm helllo");
                break;
            case 1:
            openSecond("i'm helllo2");
            break;

        }


    }
}

