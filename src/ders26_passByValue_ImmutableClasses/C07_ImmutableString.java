package ders26_passByValue_ImmutableClasses;

public class C07_ImmutableString {

    public static void main(String[] args) {

        String str = "Java Candir";

       str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        /*
        Immutable class'lardan olusturulan bir objenin degeri degistirilemez.
        Eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje olusturur.
        ve bu yeni objeye yeni atadiginiz degeri atar.

        eski obje bosa cikar ve garbage (cöpcü) collector tarafindan silinmeyi bekler.
         */

    }
}
