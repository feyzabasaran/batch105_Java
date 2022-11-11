package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {

    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int[] arr ={3,8,1,5,2,9};

        enBuyukEnKucukElementYazdir(arr);  // En buyuk element: 9  En kucuk element: 1

        Arrays.sort(arr); // natural order'a gore siralar [1, 2, 3, 5, 8, 9]
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 8, 9]

    }
    public static void enBuyukEnKucukElementYazdir(int[]arr){

        Arrays.sort(arr);

        System.out.println("En buyuk element: "+ arr[arr.length-1]);
        System.out.println("En kucuk element: "+ arr[0]);
    }
}
