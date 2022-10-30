package ders19_arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {

    public static void main(String[] args) {

        // Verilen bir int array'de en kucuk ve en buyuk sayilari
        // yazdiran bir method olusturun

        int[] arr ={3,8,1,5,2,9};

        enBuyukEnKucukElementYazdir(arr);

        Arrays.sort(arr); // kucukten buyuge siralar
        System.out.println(Arrays.toString(arr)); //

    }
    public static void enBuyukEnKucukElementYazdir(int[]arr){

        Arrays.sort(arr);

        System.out.println("En buyuk element: "+ arr[arr.length-1]);
        System.out.println("En buyuk element: "+ arr[0]);
    }
}
