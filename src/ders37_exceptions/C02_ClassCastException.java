package ders37_exceptions;

public class C02_ClassCastException {
    public static void main(String[] args) {

        short sayi1 = 23;
        int sayi2 = sayi1;   // oto-widining

        Short sayi3=24;
        // Integer sayi4 = sayi3;  Integer ve Short arasinda parent-child iliskisi olmadigindan
        //                         birbirine atama yapamazsiniz


        // Aralarind parent-child iliskisi olan class'lardan olusan objeler icin
        // auto-widining veya explicit narrowing mumkundur.

        Object obj =sayi3;  // object tum class'larin parent'i
        System.out.println("Short'tan objeye cast edince: " + obj); // 24

        Integer sayi5 = (Integer) obj;   // Aralarinda parent-child ilskisi var ama boyut olarak

        System.out.println("Short datayi obje uzerinden Integer'a cevirme: " + sayi5);
        // ClassCastException
    }
}
