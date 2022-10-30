package ders10_stringManipulation;

public class C05_Soru {
    public static void main(String[] args) {

        /*
      mail kontrolu yapan bir program hazirlayin
      1- mail @ isareti icermiyorsa "gecersiz email"
      2- @gmail.com icermiyorsa "gmail adresi giriniz"
      3- @gmail.com ile bitmiyorsa "yazim hatasi"
      seklinde sonuc yazdirin

     */

        String email = "feyzabsr@gmail.com";

        if (!email.contains("@")){
            System.out.println("gecersiz email @ isareti kullanmaniz gerekiyor.");

        } else if (!email.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz ");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");

        }else {
            System.out.println("email basariyla kaydedildi");
        }


    }







}
