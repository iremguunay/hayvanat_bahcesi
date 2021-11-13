package com.bilgeadam.hayvanatbahcesi;

//Hayvan classının objesinin oluşturulmasını istemiyorum
//abstract class yapacağız. - Class'ın objesi üretilemez
public abstract class Hayvan {

    private String ad;
    private double agirlik;
    private double uzunluk;

    public Hayvan() {
        ad = "";
        agirlik = 0;
        uzunluk = 0;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void sesCikar() {
        System.out.println("-------");
    }

}
