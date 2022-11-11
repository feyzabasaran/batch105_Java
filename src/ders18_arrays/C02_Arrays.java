package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String [] arr = {"Ali", "Ulus", "Nesrin"};

        // Bu array'in tum elementlerini aralarinda bir bosluk birakarak yazdiralim

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i]+ " "); // Ali Ulus Nesrin
        }
        System.out.println("");
        // bu array'i array olarak yazdiralim

        System.out.println(arr); // [Ljava.lang.String;@35f983a6 - referanslari yazdirdi
        // array bir obje /non-primitive data turu oldugundan java referansini yazdirir.
        // Array'i array olarak yazdirmak isterseniz Arrays class'indan yardim almalisiniz

        System.out.println(Arrays.toString(arr)); // [Ali, Ulus, Nesrin] -dogru yazimi budur.

    }
}
