package ders18_arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int [] arr1={2,4,6,8,10};

        //array'in bir elementine ulasmak ve update etmek istersek

        System.out.println(arr1[2]); // 6

        arr1[3]=20; // 3. indexteki degeriyani 8'i 20 yaptik

        System.out.println(arr1[3]); //20

        System.out.println(arr1.length); // 5

        System.out.println(arr1[arr1.length-1]); // 10   // son elementi yazdirir.

        // array'in tum elementlerini yazdirin

        for (int i = 0; i <arr1.length; i++) {
            System.out.print(arr1[i]+ " "); // 2 4 6 20 10
        }

        // array'in uzunlugu sonradan degistirilemez
        // eger array'de olmayan bir index'e atama yapmak isterseniz
        // ArrayIndexOutOfBoundsException hatasini verir.
        // bu hata Compile Time Error degil
        // Run time error'dur
        // arr1[5]=35;

    }
}
