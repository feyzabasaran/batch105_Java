package ders17_scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
        // bir methodun icerisinde olusturulan variable'ın scope'u
        // icinde olusturulduklari method'dur.
        // o method'un disindan ulasilamazlar.

        int sayi=10;
        String isim = "Ramazan";

        for (int i = 0; i < 10; i++) {
            String adres="Ankara";
        // bir loop icerisinde olusturulan variabler sadece o loop icerisinde gecerlidir.
        }
         // System.out.println(adres);

        double pi;
        // System.out.println(pi);
        // local variablelear deger atamadan olusturulabilir. ancak KULLANILAMAZ
        // kullanmadan once deger atanmis OLMALIDIR.
    }

    public static void method1(){

        // System.out.println(sayi);
        // isim="tugay";

        boolean dogruMu=true;


    }
}
