package org.example;

import java.util.ArrayList;
import java.util.List;

// IK sınıfı
public class IK {
    private String departmanAdi;
    private List<Personel> personelListesi;

    public IK(String departmanAdi) {
        this.departmanAdi = departmanAdi;
        personelListesi = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public List<Personel> getPersonelListesi() {
        return personelListesi;
    }

    public void personelleriListele() {
        System.out.println("Departmandaki Personeller:");
        for (Personel personel : personelListesi) {
            personel.bilgileriGoster();
        }
    }
}
