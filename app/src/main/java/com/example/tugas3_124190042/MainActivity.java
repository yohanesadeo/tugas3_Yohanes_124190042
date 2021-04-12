package com.example.tugas3_124190042;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tugas3_124190042.grid.GridActivity;
import com.example.tugas3_124190042.horizontal.HorizontalActivity;
import com.example.tugas3_124190042.vertical.VerticalActivity;

public class MainActivity extends AppCompatActivity {

    Button btnGrid, btnHorizontal, btnVertical;
    ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGrid = findViewById(R.id.btn_grid);
        btnVertical = findViewById(R.id.btn_vertical);
        btnHorizontal = findViewById(R.id.btn_horizontal);
        ivLogo = findViewById(R.id.iv_logo);

        btnGrid.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, GridActivity.class);
            startActivity(intent);
        });
        btnVertical.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, VerticalActivity.class);
            startActivity(intent);
        });
        btnHorizontal.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HorizontalActivity.class);
            startActivity(intent);
        });
        Glide.with(this)
                .load(R.drawable.honda)
                .into(ivLogo);
    }
}