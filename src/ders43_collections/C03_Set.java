package ders43_collections;

import java.util.*;

public class C03_Set {

    public static void main(String[] args) {

        // verilen bir array'in tekrar eden elementlerini silip
        // her elementin sadece 1 kere kullanildigi hale getirin

        int [] arr = {6,4,3,1,2,7,4,2,3,6,4,3,2,6,3,6,7,3,5};

        Set<Integer> geciciSet= new HashSet<>();

        for (Integer each:arr
             ) {
            geciciSet.add(each);
        }

        arr=new int [geciciSet.size()]; // eski array'e yeni boyut tanimladik (6 uzunlugunda ve bos)

        // Set'deki benzersiz hale getirilen elementleri gecici array'e tasiyalim

        int index = 0;
        for (Integer each : geciciSet
             ) {
            arr[index]=each;
            index++;
        }

        // tekrarsiz degerleri gecici arr'e tasidik
        // simdi kendi array'imize bu gecici arr degerini atayalim

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7]

    }
}
