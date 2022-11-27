package ders46_maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // Ogrenci map'inde sirali olarak
        // tum ogrencilerin
        // bolum, sinif ,sube, isim, soyisim ve numaralarini yazdirin.

        Map<Integer,String >ogrenciMap = MapDepo.ornekMapOlsutur();
        ogrenciMap.put(109,"Adem-Demir-11-D-Soz");

        // Soz, 11, D, Adem Demir, 109
        // bu formatta String'ler olusturup bir treeSet'e atayan
        // ve bu seti bize donduren bir method olusturalim

        Set<String> siraliOgrenciListesi = MapDepo.siraliOgrenicListesiOlustur(ogrenciMap);
        System.out.println(siraliOgrenciListesi);
        /*
        [
        MF, 10, H, Ali Can, 101,
        MF, 10, H, Ayse Can, 104,
        Soz, 10, K, Fatma Han, 106,
        Soz, 11, D, Adem Demir, 109,
        Soz, 11, M, Veli Cem, 102,
        TM, 11, H, Ali Cem, 103,
        TM, 11, M, Ayse Cem, 105
         ]
         */
    }
}
