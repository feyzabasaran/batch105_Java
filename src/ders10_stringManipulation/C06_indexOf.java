package ders10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        // istenilen Stingin kacıncı indexte oldugunu bulur.
        // char da kabul eder.

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a")); // 9

        System.out.println(str.indexOf('c')); // 8

        System.out.println(str.indexOf("hersey")); // 15. indexte baslar o yuzden 15 yazdirir.

        System.out.println(str.indexOf("e",9)); //13
        // 9.indexten sonra ilk e kacıncı indexte onu bulur.

        // 13.index'deki e'den bir sonraki e'nin index'ini bulalim

        System.out.println(str.indexOf("e",14)); //16

        // cumledeki 2.c'nin index'ini yazdirin

        int ilkCindex= str.indexOf("c"); // 8
        System.out.println(str.indexOf("c",ilkCindex+1)); // 22

        System.out.println(str.indexOf("ali"));
        System.out.println(str.indexOf("x"));

        // son ikisi icin -1 dondurur cunku metin bu stringleri icermiyor.
    }
}
