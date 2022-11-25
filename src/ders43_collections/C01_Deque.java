package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        Deque<String> dq1 = new LinkedList<>();

        dq1.add("K");
        dq1.add("B"); // [K, B]
        dq1.addLast("F"); // [K, B, F]  sona ekledi
        dq1.addFirst("A"); // [A, K, B, F] basa ekledi

        System.out.println(dq1.getFirst()); // A
        System.out.println(dq1.getLast()); // F

        System.out.println(dq1.remove()); // A'yi bize getirir ve siler
        System.out.println(dq1.poll()); // K 'yi bize getirir ve siler
        System.out.println(dq1.removeLast()); // F'yi bize getirir ve siler
        System.out.println(dq1.remove()); // B'yi bize getirir ve siler  ve liste dq1 artik bos

        // dq1.remove(); // NoSuchElementExceptio
        System.out.println(dq1.poll()); // null
        // bos deque olmasina ragmen exception firlatmaz, eleman silemedigi icin bize null doner

        dq1.add("K");
        dq1.add("B"); // [K, B]

        dq1.push("F"); // [F, K, B]  push(), listenin basina ekleme yapar
        // deque'in basina element ekler. addFirst() ile ayni islevi gorur.
        // eger deque ile ilgili sinirlandirma varsa ve yer kalmadiysa
        // illegalStateException verir

        System.out.println(dq1.poll()); // F, ilk elementi siler ve  bize dondurur.
        // removeFirst() ile ayni islevi gorur

        System.out.println(dq1.element()); // K , listenin ilk elementini silmeden bize dondurur.
        // Bos deque'de calisirsa exception firlatir.

        System.out.println(dq1.peek()); // K
        // ilk elementi silmeden bize dondurur. Bos deque'de calisirsa null döndürür.

        System.out.println(dq1.offer("C"));  // true dondurur ve verilen harfi sona ekler. [K, B, C]
        // capasite dolu oldugunda, yerleştiremediginde false döndürür.

        System.out.println(dq1.offerFirst("M")); // // true dondurur ve verilen harfi basa ekler. [M, K, B, C]

        System.out.println(dq1);

    }
}
