package org.example;

// IKAsistani sınıfı
public class IKAsistani extends Personel {
    public IKAsistani(String ad, String soyad, String pozisyon) {
        super(ad, soyad, pozisyon);
    }

    @Override
    public void bilgileriGoster() {
        System.out.println("Adı: " + getAd() + ", Soyadı: " + getSoyad() + ", Pozisyon: " + getPozisyon());
    }
}
