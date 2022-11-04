package ders29_stringBuilder_accessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4)); //  ne kadar guzel

        // String methodu kullandigimiz icin sb degismez ilk hali olarak kalir.
        System.out.println(sb); // Java ne kadar guzel

        // sb = sb.substring(0,4); esitligin solu StringBuilder, sagi ise String
        //                         Java non-primitive datalarda casting yapmaz.
        // ayni not Integer, Byte ve Short gibi sayi barindiran non-primitiveler icinde gecerlidir.

        // sb guzel kelimesi iceriyor mu ?
        /*
        StringBuilder'da olmayan, String class'ında bulunan methodlari kullanmak isterseniz
        once toString() ile String'e cevirip sonra String manipulations yapilabilir.
         */

        System.out.println(sb.toString().contains("guzel")); // true

        sb.setCharAt(5,'N');
        System.out.println(sb); // Java Ne kadar guzel

    }
}
