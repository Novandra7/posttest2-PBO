package com.bentuk;

import com.parent.parent_bentuk;
public final class balok extends parent_bentuk {
    private float tinggi,panjang,lebar;
    final int dua = 2;

    public balok(float tinggi, float panjang, float lebar) {
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    @Override
    public float hitungLuas() {
        return dua*((getPanjang()*getLebar())+(getPanjang()*getTinggi())+(getLebar()*getTinggi()));
    }

    @Override
    public float hitungVolume() {
        return getPanjang()*getLebar()*getTinggi();
    }
}
