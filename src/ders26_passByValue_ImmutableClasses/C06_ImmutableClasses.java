package ders26_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06_ImmutableClasses {

    public static void main(String[] args) {

        String str = "Java guzeldir";

        System.out.println(str.toUpperCase()); // JAVA GUZELDİR

        System.out.println(str); // Java guzeldir

        str.toLowerCase();

        System.out.println(str); // Java guzeldir

        // String immutable oldugu icin, method ile yapilan degisiklikler String'i kalici degistirmez.

        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);

        System.out.println(harfler);

        // List ve Array mutable oldugu icin method ile yapilan degisiklikler kalici olur.
    }
}
