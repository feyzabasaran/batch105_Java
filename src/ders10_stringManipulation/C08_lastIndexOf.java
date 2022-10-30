package ders10_stringManipulation;

public class C08_lastIndexOf {
    public static void main(String[] args) {

        String str= "Java hafiften beyin yakiyor";

        System.out.println(str.lastIndexOf("a"));
        // sondan a indexi kacıncı index 21

        System.out.println(str.lastIndexOf('e'));
        // char kabul eder. 15

        System.out.println(str.lastIndexOf("java"));
        // -1 verir cunku java icermiyor metin Java iceriyor.

        System.out.println(str.lastIndexOf("Java"));
        // 0 verir cunku J 0. index oluyor.

        System.out.println(str.lastIndexOf("e",14)); //11

    }
}
