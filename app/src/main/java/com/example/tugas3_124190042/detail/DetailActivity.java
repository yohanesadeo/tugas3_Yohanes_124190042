package com.example.tugas3_124190042.detail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.tugas3_124190042.R;
import com.example.tugas3_124190042.model.MotorModel;

public class DetailActivity extends AppCompatActivity {

    ImageView ivDetail;
    TextView tvDetailTitle, tvTipeMesin, tvVolume, tvBahanBakar, tvDiameter, tvDaya, tvTorsi;
    MotorModel motorModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        motorModel = getIntent().getParcelableExtra("EXTRA_MOTOR");

        ivDetail = findViewById(R.id.iv_detail);
        tvDetailTitle = findViewById(R.id.tv_detail_title);
        tvTipeMesin = findViewById(R.id.tv_detail_value_1);
        tvVolume = findViewById(R.id.tv_detail_value_2);
        tvBahanBakar = findViewById(R.id.tv_detail_value_3);
        tvDiameter = findViewById(R.id.tv_detail_value_4);
        tvDaya = findViewById(R.id.tv_detail_value_5);
        tvTorsi = findViewById(R.id.tv_detail_value_6);

        Glide.with(this)
                .load(motorModel.getImage())
                .into(ivDetail);
        tvDetailTitle.setText(motorModel.getTitle());
        tvTipeMesin.setText(motorModel.getTipeMesin());
        tvVolume.setText(motorModel.getVolume());
        tvBahanBakar.setText(motorModel.getBahanBakar());
        tvDiameter.setText(motorModel.getDiameter());
        tvDaya.setText(motorModel.getDaya());
        tvTorsi.setText(motorModel.getTorsi());
    }
}