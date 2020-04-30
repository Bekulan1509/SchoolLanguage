package com.example.schoollanguage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

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
        list.add(new ItemTitle("СИНТАКСИС "));


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

    }void openSyntaksysActivity(){
        Intent intent = new Intent(this,SyntaksysActivity.class);
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
                break;
            case 3:
                openSyntaksysActivity();
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu,menu);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) item.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}

