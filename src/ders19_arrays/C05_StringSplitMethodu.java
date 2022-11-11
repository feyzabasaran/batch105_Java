package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {

        // Split methodu String'i array'e donusturur.

        String str = "java gercekten cok cok guzel";
        // verilen str'da kac tane e harfi oldugunu bulunuz

        String[] eArrayi= str.split("e");

        System.out.println(Arrays.toString(eArrayi)); // [java g, rc, kt, n cok cok guz, l]
        System.out.println(eArrayi.length); // 5

        System.out.println("Metindeki e sayisi: "+ (eArrayi.length-1)); // Metindeki e sayisi: 4

        // 2.yontem
        // String'i hiclik ile split yaparak (bolerek) karakterlerine ayiralim

        String [] tumKarakterlerArr= str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));
        //[j, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]
        // ", "  array'den geliyor

        int sayac = 0;
        //bir loop ile tum karakterleri kontrol edelim


        for (int i = 0; i <tumKarakterlerArr.length ; i++) {

            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }
        }
        System.out.println("Metindeki e sayisi: " + sayac); // Metindeki e sayisi: 4

    }
}
