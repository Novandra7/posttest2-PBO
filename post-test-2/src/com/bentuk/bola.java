package com.bentuk;

import com.parent.parent_bentuk;
public final class bola extends parent_bentuk{
    final float phi = 3.14F;
    private float jariJari,tinggi;

    public bola(float jariJari, float tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;

    }

    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public float hitungLuas() {
        return phi*(getJariJari()*getJariJari());
    }

    @Override
    public float hitungVolume() {
        return phi*getTinggi()*(getJariJari()*getJariJari());
    }
}
