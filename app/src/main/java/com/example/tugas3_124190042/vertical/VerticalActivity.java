package com.example.tugas3_124190042.vertical;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas3_124190042.DummyData;
import com.example.tugas3_124190042.R;
import com.example.tugas3_124190042.grid.GridAdapter;
import com.example.tugas3_124190042.horizontal.HorizontalAdapter;

public class VerticalActivity extends AppCompatActivity {
    RecyclerView rvVertical;
    VerticalAdapter verticalAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical);

        rvVertical = findViewById(R.id.rv_vertical);
        verticalAdapter = new VerticalAdapter(DummyData.generateData(), this);

        rvVertical.setHasFixedSize(true);
        rvVertical.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rvVertical.setAdapter(verticalAdapter);
    }
}