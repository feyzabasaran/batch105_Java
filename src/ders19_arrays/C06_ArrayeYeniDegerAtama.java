package ders19_arrays;

import com.sun.jdi.ArrayReference;

import java.util.Arrays;

public class C06_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        String str="Java";
        str="hava";



        /*
        var olan bir array'in uzunlugunu degistirilemez
        AMA
        var olan bir array'in yeni bir array degeri atanabilir
         */

        // 1- var olan bir array'i yeni deger olarak atayabiliriz
        String [] arr1= {"Ali","Veli"};
        String [] arr2= {"A","B","C"};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1)); // [A,B,C]

        // 2- istedigimiz uzunluktaki yeni bir bos bir array degeri atayabiliriz.

        arr1=new String[6];
        System.out.println(Arrays.toString(arr1)); // [null, null, null, null, null, null]

        // 3- yeni olusturulan bir array'e { } icinde deger yazarak atama yapabiliriz.
        // ancak var olan bir array'e yeni deger atamasi icin { } kullanilamaz.

        // arr1= {"g","h"}; olmaz
    }
}
