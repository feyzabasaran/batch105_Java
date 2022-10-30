package ders20_multiDimensionalArrays;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {

        int [][] arr= {{4,3,1},{1,2},{5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length); // 5

        System.out.println(arr[2].length); //  [5,6,7] ===> = 3

        System.out.println(arr[1]); // [1,2] ===> direk yazdirilamaz, java referansini yazdirir.

        System.out.println(Arrays.toString(arr[1])); // [1,2] direk yazdirir.

        System.out.println(Arrays.deepToString(arr)); // [[4, 3, 1], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]

        System.out.println(arr[3][0]); // oyle bir element olmadigi icin ArrayIndexOutOfBoundsException uyarisi verir.
    }
}
