package com.example.tugas3_124190042;

import com.example.tugas3_124190042.model.MotorModel;

import java.util.ArrayList;

public class DummyData {
    private static int images[] = {
            R.drawable.beat,
            R.drawable.beat_street,
            R.drawable.genio,
            R.drawable.scoopy,
            R.drawable.vario_125,
            R.drawable.vario_150,
            R.drawable.pcx_2021,
            R.drawable.adv_150,
            R.drawable.sh150i,
            R.drawable.pcx,
            R.drawable.forza
    };
    private static String[] names = {
            "BeAT",
            "BeAT Street",
            "Genio",
            "Scoopy",
            "Vario 125",
            "Vario 150",
            "PCX",
            "ADV 150",
            "SH150i",
            "PCX e:HEV",
            "Forza"
    };
    public static ArrayList<MotorModel> generateData(){
        ArrayList<MotorModel> motors = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            motors.add(new MotorModel(
                    images[i],
                    names[i],
                    "4 – Langkah, SOHC, eSP",
                    "109.5cc",
                    "Injeksi (PGM-FI)",
                    "47.0 x 63.1 mm",
                    "6.6 kW (9.0 PS)/7.500 rpm",
                    "9.3 N.m (0.95 kgf.m)/ 5.500 rpm"
            ));
        }
        return motors;
    }
}
