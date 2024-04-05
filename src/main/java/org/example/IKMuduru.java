package org.example;

// IKMuduru sınıfı
public class IKMuduru extends Personel {
    public IKMuduru(String ad, String soyad, String pozisyon) {
        super(ad, soyad, pozisyon);
    }

    @Override
    public void bilgileriGoster() {
        System.out.println("Adı: " + getAd() + ", Soyadı: " + getSoyad() + ", Pozisyon: " + getPozisyon());
    }
}
