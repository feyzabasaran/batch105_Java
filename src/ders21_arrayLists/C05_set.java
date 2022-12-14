package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_set {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // list.set(index,yeniDeger) method'u
        // istenen index'deki eski degeri silip bize dondurur.
        // ve o indexdeki degeri verdigimiz

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

                sayilar.add(arr[i]);
        }

        // Java'da set() update icin kullanilir.
        // Add() ile set() farklidir.

        System.out.println(sayilar.set(0, 8)); // eski degeri 1 olarak verir // 0. indexi 8 yapti
        int eskiDeger= sayilar.set(1,9);
        System.out.println(eskiDeger); // 2
        System.out.println(sayilar); // [8, 9, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]


    }
}
