package com.bentuk;

import com.parent.parent_bentuk;
public final class prisma_segitiga extends parent_bentuk {
    private float luasAlas,luasSelimut,tinggi;
    final int dua = 2;

    public prisma_segitiga(float luasAlas, float luasSelimut, float tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelimut = luasSelimut;
        this.tinggi = tinggi;
    }

    public float getLuasAlas() {
        return luasAlas;
    }

    public void setLuasAlas(float luasAlas) {
        this.luasAlas = luasAlas;
    }

    public float getLuasSelimut() {
        return luasSelimut;
    }

    public void setLuasSelimut(float luasSelimut) {
        this.luasSelimut = luasSelimut;
    }

    public final float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public float hitungLuas() {
        return (dua*getLuasAlas())+getLuasSelimut();
    }

    @Override
    public float hitungVolume() {
        return getLuasAlas()*getTinggi();
    }
}
