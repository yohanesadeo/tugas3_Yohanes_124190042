package com.example.tugas3_124190042.model;

import android.os.Parcel;
import android.os.Parcelable;

public class MotorModel implements Parcelable {
    private int image;
    private String title;
    private String tipeMesin;
    private String volume;
    private String bahanBakar;
    private String diameter;
    private String daya;
    private String torsi;

    public MotorModel(int image, String title, String tipeMesin, String volume, String bahanBakar, String diameter, String daya, String torsi) {
        this.image = image;
        this.title = title;
        this.tipeMesin = tipeMesin;
        this.volume = volume;
        this.bahanBakar = bahanBakar;
        this.diameter = diameter;
        this.daya = daya;
        this.torsi = torsi;
    }

    protected MotorModel(Parcel in) {
        image = in.readInt();
        title = in.readString();
        tipeMesin = in.readString();
        volume = in.readString();
        bahanBakar = in.readString();
        diameter = in.readString();
        daya = in.readString();
        torsi = in.readString();
    }

    public static final Creator<MotorModel> CREATOR = new Creator<MotorModel>() {
        @Override
        public MotorModel createFromParcel(Parcel in) {
            return new MotorModel(in);
        }

        @Override
        public MotorModel[] newArray(int size) {
            return new MotorModel[size];
        }
    };

    public int getImage() {
        return image;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public String getVolume() {
        return volume;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public String getDiameter() {
        return diameter;
    }

    public String getDaya() {
        return daya;
    }

    public String getTorsi() {
        return torsi;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(tipeMesin);
        dest.writeString(volume);
        dest.writeString(bahanBakar);
        dest.writeString(diameter);
        dest.writeString(daya);
        dest.writeString(torsi);
    }
}
