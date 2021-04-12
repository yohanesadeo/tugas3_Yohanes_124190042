package com.example.tugas3_124190042.horizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas3_124190042.DummyData;
import com.example.tugas3_124190042.R;
import com.example.tugas3_124190042.grid.GridAdapter;

public class HorizontalActivity extends AppCompatActivity {

    RecyclerView rvHorizontal;
    HorizontalAdapter horizontalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal);

        rvHorizontal = findViewById(R.id.rv_horizontal);
        horizontalAdapter = new HorizontalAdapter(DummyData.generateData(), this);

        rvHorizontal.setHasFixedSize(true);
        rvHorizontal.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        rvHorizontal.setAdapter(horizontalAdapter);
    }
}