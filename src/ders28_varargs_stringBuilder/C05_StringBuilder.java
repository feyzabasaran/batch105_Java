package ders28_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java candir.");

        System.out.println(sb.capacity()); // 16+12 şeklinde yapiyor 16 sabit burda
        System.out.println(sb.length());

        System.out.println(sb.reverse()); // .ridnac avaJ tersten yazdirma
        System.out.println(sb.reverse()); // Java candir.
        System.out.println(sb.replace(0,4,"Ahmet hoca")); // Yaaaaa candir.

        System.out.println(sb.insert(18, "hem de kraldir")); // Ahmet hoca candir.hem de kraldir

        String str = "Java cok guzel";

        System.out.println(sb.insert(21, str, 9, 14)); // Ahmet hoca candir.hemguzel de kraldir

    }

}
