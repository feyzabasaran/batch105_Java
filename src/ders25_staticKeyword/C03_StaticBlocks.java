package ders25_staticKeyword;

public class C03_StaticBlocks {

    // static bloklar main methoddan once calisir

    static {
        System.out.println("1. static blok calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
    }

    static {
        System.out.println("2. static blok calisti");
    }

}
