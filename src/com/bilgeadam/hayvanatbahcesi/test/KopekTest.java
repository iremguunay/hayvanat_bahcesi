package com.bilgeadam.hayvanatbahcesi.test;

import com.bilgeadam.hayvanatbahcesi.Kopek;

public class KopekTest {

    public static void main(String[] args) {

        Kopek kopek1 = new Kopek();
        kopek1.sesCikar();

        kopek1.setKopekCins("Doberman");
        System.out.println(kopek1.getKopekCins());

        kopek1.setAd("Çomar");
        kopek1.setAgirlik(60);
        kopek1.setUzunluk(1.5);

        System.out.println(kopek1);
    }
}
