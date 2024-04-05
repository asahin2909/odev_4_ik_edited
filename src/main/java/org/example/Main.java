package org.example;

// Ana sınıf
public class Main {
    public static void main(String[] args) {
        // Örnek bir IK departmanı oluşturulması
        IK insanKaynaklari = new IK("İnsan Kaynakları");

        // Personellerin oluşturulması ve IK departmanına eklenmesi
        Personel personel1 = new IKUzmani("Alperen", "Şahin", "IK Uzmani");
        Personel personel2 = new IKAsistani("Merve", "Şahin", "IK Asistani");
        Personel personel3 = new IKMuduru("Gökçe", "Şahin", "IK Muduru");

        insanKaynaklari.personelEkle(personel1);
        insanKaynaklari.personelEkle(personel2);
        insanKaynaklari.personelEkle(personel3);

        // Departmandaki personellerin listelenmesi
        insanKaynaklari.personelleriListele();
    }
}
