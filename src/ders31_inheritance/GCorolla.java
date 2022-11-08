package ders31_inheritance;

public class GCorolla extends FToyota {

    String model = "Corolla";
    String uretimYeri = "Turkiye";


    GCorolla(){
        super(); // parent class'daki parametresiz cons. git
        System.out.println("Corolla cons. calisti");
    }

    public static void main(String[] args) {

        GCorolla corolla1 = new GCorolla();

        System.out.println(corolla1.marka); // parent'tan Toyata verisini alır.

        /*
        Bir child class'da obje olusturdugumuzda
        olusturulan obje sadece child class'a ait ozellikleri degil
         tum parent class'larindaki ozellikleri de tasir

         Bir objenin bir class'in ozelliklerini tasimasi icin
         o obje olusturulurken class'a ait  cons.'in calismis olmasi gerekir.
         Yani child class'indaki obje olusturulurken
         tum parent class'lardaki cons. 'lar da otomatik calisir.

         Java bu islem icin soyle bir mekanizma gelistirmistir.
         Bir class olusturdugumuzda biz cons. olusturmasak da
         java'nin o class'a default cons. koydugu gibi
         extends keyword kullanan bir class'da olusturulan her bir cons. 'in
         ilk satirina biz gormesek de super() cons. call koyar.
         */




    }
}
