package ders30_encapsulation;

public class C01_Encapsulations {

    public static void main(String[] args) {

        AEncapsuleClass personel1=new AEncapsuleClass();

        // personel1.hastaneIsmi ="Java Hastanesi"; hastaneIsmi privite oldugu icin gorulemez.

        // personel1.hastaUcreti = 10000;  hastaUcreti de privite oldugu icin kullanilmaz

        // personel1.hemsireAdresi= "Ankara"; private old. icin ulasilamaz
        // personel1.hemsireIsmi = "Yildiz Yildiz"; private old. icin ulasilamaz

        System.out.println(personel1.getHastaneIsmi());

        personel1.setHastaUcreti(500);

        // getter ve setter methodlari
        // bazen de erisimi sinirlandirmak icin degil
        // Kullanicilarin islevi iyi anlamasi icin kullanilir.

        System.out.println(personel1.getHemsireAdresi());
        personel1.setHemsireAdresi("Istanbul");
        System.out.println(personel1.getHemsireIsmi());

    }
}
