package ders26_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_PassByValueArray {

    public static void main(String[] args) {

        // verilen bir Array'in elementlerini 5 artirip
        // sonra yazdiran bir method olusturun

        int[] arr= {3,4,5};

        elementleri5Artir(arr);
        elementleri5Artir(arr);
        elementleri5Artir(arr);

        System.out.println("Method call sonrasi main method'da arr: "+ Arrays.toString(arr));
    }

    public static void elementleri5Artir(int[] arr){

        for (int i = 0; i <arr.length ; i++) {

            arr[i]= arr[i]+5;
        }

        System.out.println(Arrays.toString(arr));
    }
}
