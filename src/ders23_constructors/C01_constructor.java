package ders23_constructors;

import java.util.Scanner;

public class C01_constructor {
    public static void main(String[] args) {

        // Scanner class'ındaki method ve variable'lari (ozellikleri) kullanmak icin scan objesi olustururuz.
           Scanner      scan      =         new                          Scanner(System.in);
        //class adi   obje ismi    obje olustumak icin keyword          Scanner Constructor
        scan.nextInt();

        String str=new String("Java Candir");
        String str2 = "Java ne guzel";

        str.toLowerCase();


    }

    public static void C01_constructor () {
        // method isimleri kucuk harfle baslar
        // class ismi ile ayni isimde olmamasi tercih edilir.
        // return type var (void) bu method'dur. constructor olamaz.

    }
}
