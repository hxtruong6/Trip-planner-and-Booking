package com.example.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.vacationtourapp.adapter.RecentsAdapter;
import com.example.vacationtourapp.model.RecentsData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recentRecycler;
    RecentsAdapter recentsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        create dumpy data
        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("AM Lake", "India", "Only $200", R.drawable._2c4d03e40da1a068e5f30b6a24d9575));
        recentsDataList.add(new RecentsData("Bank", "VB", "From $300", R.drawable._927f976b17065d627f94c0e125ac79c));
        recentsDataList.add(new RecentsData("Pool", "China", "From $6500", R.drawable._369709ab5772883c9d3bbc849837808));
        recentsDataList.add(new RecentsData("Riverrrr", "American", "Only $260", R.drawable.c82af9c8a818d8dba545fb896b8a6b2c));
        recentsDataList.add(new RecentsData("Occeans", "Lao", "Max $8600", R.drawable._369709ab5772883c9d3bbc849837808));

        setRecentRecycler(recentsDataList);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList) {
        recentRecycler = findViewById(R.id.recentsList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
}