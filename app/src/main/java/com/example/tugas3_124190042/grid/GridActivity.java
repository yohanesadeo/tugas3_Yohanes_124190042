package com.example.tugas3_124190042.grid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugas3_124190042.DummyData;
import com.example.tugas3_124190042.MainActivity;
import com.example.tugas3_124190042.R;

public class GridActivity extends AppCompatActivity{

    RecyclerView rvGrid;
    GridAdapter gridAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        rvGrid = findViewById(R.id.rv_grid);
        gridAdapter = new GridAdapter(DummyData.generateData(), this);

        rvGrid.setHasFixedSize(true);
        rvGrid.setLayoutManager(new GridLayoutManager(this, 2));
        rvGrid.setAdapter(gridAdapter);
    }
}