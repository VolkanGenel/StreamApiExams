package com.volkan;

public class Urun {
    String marka;
    String ad;

    public Urun() {
    }

    public Urun(String marka, String ad) {
        this.marka = marka;
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "marka='" + marka + '\'' +
                ", ad='" + ad + '\'' +
                '}';
    }
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
}
