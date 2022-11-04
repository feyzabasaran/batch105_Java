package ders29_stringBuilder_accessModifier;

public class C05_AcsessModifier {

    public static void main(String[] args) {

        C04_AccessModifiers obj = new C04_AccessModifiers();

        obj.isim= "Feyza";
        System.out.println(obj.isim); // atama yapildigi icin Feyza yazdirir
        // obj.sayi=20;  private variable'lara baska class'dan ulasilamaz.

        C04_AccessModifiers obj2 = new C04_AccessModifiers();
        System.out.println(obj2.isim); // Ali



    }
}
