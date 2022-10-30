package ders10_stringManipulation;

public class C10_isEmpty {
    public static void main(String[] args) {

        String str = "";
        System.out.println(str.isEmpty()); // true

        str=" ";
        System.out.println(str.isEmpty()); //false
        // false verir cunku bosluk da bir karakter sayilir
        System.out.println(str.isBlank()); // true
        // true veriyor cunku bosluk var icinde

        str = "x";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.isBlank()); // false


    }
}
