package ders33_inheritenceDataTypeKullanimi_overriding;

public class FAvciKuslar extends EKuslar {

    public void hareket( ) {
        System.out.println("Avci kuslar ucarlar");
    }
    public void beslenme( ) {
        System.out.println("Avci kuslar et yerler");
    }
    public void pence( ) {
        System.out.println("Avci kuslar pencelidir");
    }
    public void gaga( ) {
        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {

        FAvciKuslar avci1 = new FAvciKuslar();

        /*
        Bir obje olusturulurken
        constructor ve data turu ayni ise
        hangi method'un gecerli oldugunu bulmak icin
        o class'a gider varsa kullaniriz.
        yoksa sirasi ile parent'lara gider ilk buldugumuzu kullaniriz
         */

        avci1.beslenme(); // FAvcikuslar Class'indan
        avci1.gaga(); // FAvcikuslar Class'indan
        avci1.pence(); // FAvcikuslar Class'indan
        avci1.hareket(); // FAvcikuslar Class'indan
        avci1.cogalma(); // EKuslar Class'indan
        avci1.kanat(); // EKuslar Class'indan
        avci1.omur(); // DHayvanlar Class'indan
        avci1.solunum(); // EKuslar Class'indan


        EKuslar avci2 = new FAvciKuslar();
        /*
          Bir obje olusturulurken
          data turu ile constructor farkli ise
          hangi METHOD'un gecerli olacagini bulmak icin
          ** Once data turunun oldugu class ve parent'larina bakarak
          o method'u buluruz
          bulamazsak CTE verir
          bulursak HEMEN CALISTIRMAYIZ
          calistirmadan once o method override edilmis mi diye kontrol ederiz
          override edilmisse override eden method'u calistiririz
         */

        avci2.beslenme(); // Avci Kuslar
        avci2.gaga(); // Avci Kuslar
        // avci2.pence(); // CTE
        avci2.hareket(); // Avci Kuslar
        avci2.cogalma(); // Kuslar
        avci2.kanat(); // Kuslar
        avci2.omur(); // Hayvanlar
        avci2.solunum(); // Kuslar


        DHayvanlar avci3= new FAvciKuslar();
        avci3.beslenme(); // Avci Kuslar
        // avci3.gaga(); // CTE
        // avci3.pence(); // CTE
        avci3.hareket(); // Avci Kuslar
        avci3.cogalma(); // Kuslar
        // avci3.kanat(); // CTE
        avci3.omur(); // Hayvanlar
        avci3.solunum(); // Kuslar


        EKuslar kus1 = new EKuslar();
        kus1.cogalma();// Kuslar
        kus1.gaga(); // Kuslar
        kus1.kanat(); // Kuslar
        kus1.hareket(); // Hayvanlar
        kus1.solunum(); // Kuslar
        kus1.beslenme(); // Hayvanlar
        kus1.omur(); // Hayvanlar


        /*
          - Method'larla belirlenen ozellikler
          en guncel bilgiyi bulurken
          - variable ile belirlenen ozellikler
          ilk buldugu degeri kullanir
          - bunun icin method'lara dinamik ozellik, variable'a statik ozellik denir
         */

        DHayvanlar kus2= new EKuslar();
        kus2.cogalma();// Kuslar
        //kus2.gaga(); // CTE
        //kus2.kanat(); // CTE
        kus2.hareket(); // Hayvanlar
        kus2.solunum(); // Kuslar
        kus2.beslenme(); // Hayvanlar
        kus2.omur(); // Hayvanlar



    }




}
