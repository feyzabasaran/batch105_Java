package ders41_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02_Iterator {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        Iterator it1 = sayilar.iterator();

        // tum elementleri iterator kullanarak yazdiralim

        System.out.println(it1.hasNext()); // yaninda sayi var mi diye soruyor true
        System.out.println(it1.next()); // 10

        System.out.println(it1.hasNext());  // true
        System.out.println(it1.next()); // 20

        System.out.println("=========");

        while (it1.hasNext()){ // yaninda sayi oldugu müddetce
            System.out.print(it1.next() + " "); // bir yandakini yazdir
        }
        System.out.println("");
        // iterator nereye kadar iterate ettiysek orada kalır
        // bastan itibaren yazdirmak isterseniz, yeni bir iterator olusturmaniz gerekir.

        Iterator it2 = sayilar.iterator();
        System.out.println("===========");

        while (it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
    }
}
