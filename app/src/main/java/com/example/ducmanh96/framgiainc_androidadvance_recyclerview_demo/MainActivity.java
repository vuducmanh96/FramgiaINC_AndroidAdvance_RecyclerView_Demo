package com.example.ducmanh96.framgiainc_androidadvance_recyclerview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MyAdapter myAdapter;
    private List<item> myDataset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.my_recyclerView);

        mRecyclerView.setHasFixedSize(true);

        addDataset();
        myAdapter = new MyAdapter(myDataset);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setAdapter(myAdapter);


    }

    public void addDataset() {

        myDataset = new ArrayList<>();
        myDataset.add(new item(R.drawable.batman, "Batman"));
        myDataset.add(new item(R.drawable.ironman, "Ironman"));
        myDataset.add(new item(R.drawable.wonder_wommen, "Wonder Wommen"));
    }
}
