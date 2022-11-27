package ders45_maps;

import ders44_maps.MapDepo;

import java.security.Key;
import java.util.List;
import java.util.Map;

public class C05_Maps {
    public static void main(String[] args) {

        // Ogrenci Map'inden Numara, isim ve soyisim degerlerini yazdiralim

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlsutur();
        ogrenciMap.put(110,"Suleyman-Sah-11-T-MF");
        ogrenciMap.put(105,"Sule-Karaca-10-L-MF");

        MapDepo.numaraIsimSoyisimYazdir(ogrenciMap);

        /*
       101 Ali Can
       102 Veli Cem
       103 Ali Cem
       104 Ayse Can
       105 Sule Karaca
       106 Fatma Han
       110 Suleyman Sah
         */
    }
}
