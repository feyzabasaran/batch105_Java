package ders29_stringBuilder_accessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");

        System.out.println(sb1.reverse()); // ridnaC avaJ

        System.out.println("Tersini yazdirdiktan sonra sb1: " + sb1); // ridnaC avaJ

        System.out.println(sb1.insert(0, ".")); // .ridnaC avaJ

        System.out.println(sb1); // .ridnaC avaJ

        System.out.println(sb1.reverse()); // Java Candir.

        StringBuilder sb2 = new StringBuilder("Java Candir.");
        String str ="Java Candir.";

        System.out.println(sb1==sb2); // false  sb2 yeni olusturulmus bir variable oldugu icin false veriyor
        System.out.println(sb1==sb1); // true  sadece bir sb kendisi ile karsilastirilirsa true verir.
        // System.out.println(sb1==str); bunu hic kabul etmez iki farkli data turu karsilastirilamaz.

        System.out.println(sb1.equals(sb2)); // icerik ayni olsa bile false verir
        System.out.println(sb1.equals(sb1)); // sadece bir sb kendisi ile karsilastirilirsa true verir.
        System.out.println(sb1.equals(str)); // CTE vermez ama sonuc her zaman false doner.

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3=new StringBuilder("Java Kandir");

        System.out.println(sb1.compareTo(sb3)); // -8
        // sb1 i aliyor once "Java Candir"   sonra sb3 u aliyor "Java Kandir" C, K'den 8 geride oldugu icin
        // -8 sonucunu veriyor

        /*
        CompareTo sadece tamamen ayni mi yoksa farkli mi sorusunun cevabini verir
        tamamen ayni ise ==> 0 doner.
        farklilik varsa ==> ilk farkli harfi buldugunda farkli harflerin arasinda kac harf oldugunu verir.
         */
    }
}
