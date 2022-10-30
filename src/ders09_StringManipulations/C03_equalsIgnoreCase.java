package ders09_StringManipulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1= "Ali";
        String str2= "ali";
        String str3= "ALI";

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equalsIgnoreCase("Ali Can")); // false

        /*
        equalsIgnoreCase ayni metni buyuk kucuk harf kullanilarak olusturulan
        farkli yaazimlari birbirine esit olarak kabul eder.

        yani equalsIgnoreCase icin ali, ALİ, Ali, Alİ,alı birbirine esittir.

        a li ile ali birbirine esit degildir.
        ali ile Alı. birbirine esit degildir.
         */

    }
}
