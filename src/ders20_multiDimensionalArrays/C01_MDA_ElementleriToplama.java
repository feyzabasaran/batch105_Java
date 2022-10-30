package ders20_multiDimensionalArrays;

public class C01_MDA_ElementleriToplama {
    public static void main(String[] args) {

        int[] arr1= {3,5,7,8};
        int toplam= 0;

        for (int i = 0; i <arr1.length ; i++) {
            toplam += arr1[i];
        }
        System.out.println("Tek katli array elemenetler toplami: " + toplam); // 23

        int [][]arr= {{1,2},{3,4,5},{7}};
        // elementlerini toplayalim

        toplam =0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                toplam += arr[i][j];
            }
        }
        System.out.println("İki katli array'in elementleri toplami: " +toplam); // 22
    }
}
