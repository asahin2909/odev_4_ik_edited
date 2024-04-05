package org.example;

// IKUzmani sınıfı
public class IKUzmani extends Personel {
    public IKUzmani(String ad, String soyad, String pozisyon) {
        super(ad, soyad, pozisyon);
    }

    @Override
    public void bilgileriGoster() {
        System.out.println("Adı: " + getAd() + ", Soyadı: " + getSoyad() + ", Pozisyon: " + getPozisyon());
    }
}
