package ders42_collections;

import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();

        // LinkedList 3 tane interface'İ implement etmistir
        // List, Queue, DEque interfaceleri
        // Dolayisiyla bu interface'lerden sonra gelen ilk concrete class oldugundan
        // Bu 3 interface'deki tum abstract method'lari override etmistir.

        // LinkedList olusturulurken secilen data turune gore
        // bu 3 interface'den birinin ozelliklerini alabilir
        // veya data turu LinkedList secilirse , 3 interface'in ozelliklerini de toptan alir


        List<String> ll2 = new LinkedList<>();  // Data turu list,  constructor LinkedList

        ll1.add("K");
        ll1.add("T");

        // daha onceden arrayList olustururken, List<> interface'ini data turu olarak kullandigimizdan
        // bu sekilde olusturulan LinkedList'lerin ozelliklerini biliyoruz

        ll2.add("R");  // [R]

        ll2.add("Z"); // [R, Z]

        ll2.add(0,"A"); //  [A, R, Z]

        ll2.addAll(2,ll1); // [A, R, K, T, Z]  2. indexe ll1'i ekler

        ll2.set(3,"M") ; // [A, R, K, M, Z]  3. indexi silip yerine M yazdirir

        System.out.println(ll2.get(1)); // R

        System.out.println(ll2); // [A, R, K, M, Z]

        ll2.add("K");
        ll2.add("T");

        System.out.println(ll2.retainAll(ll1)); // true  ll1'dekiler disindakileri siliyor

        System.out.println(ll2); // [K,K,T]
        ll2.add("A");  // [K,K,T,A]

        System.out.println(ll2.hashCode()); // 3232590 ll2'nin hafizada tuttugu yeri gosteriyor

        // System.out.println(ll2.get(4)); // IndexOutOfBoundsException  4.index yoktur

        System.out.println(ll2.subList(2, 4)); // [T, A]  2 dahil 4 degil o yuzden 4. index'in olmamasi no problem



    }
}
