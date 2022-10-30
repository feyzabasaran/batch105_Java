package ders10_stringManipulation;

public class C01_concatenation {
    public static void main(String[] args) {

        // String birlestirme islemi

        String str1= "Java";
        String str2= "Guzeldir";
        boolean bl= true;
        int sayi= 20;
        double dbl= 3.54;

        System.out.println(str1+bl+sayi); // Javatrue 20
        // string ile basladigimizi icin devamini da o sekilde yazdiriyor

        // System.out.println(bl+sayi); hata veriyor
        // String disindaki data turlerinde toplama yapmamiza izin vermeyebilir.

        System.out.println(sayi+dbl); //23.54

        // System.out.println(str1.concat(bl)); hata veriyor
        //concat() sadece String variable'lari toplamak icin kullanilir.
        System.out.println(str1.concat(" ").concat(str2)); // Java Guzeldir
    }
}
