package ders46_maps;

import ders44_maps.MapDepo;

import java.util.Map;

public class C03_SoyisimleriBuyukHarfYap {
    public static void main(String[] args) {

        // ogrenci map'indeki soyisimleri buyuk harfe cevirip
        // map'i bize donduren bir method olusturun

        Map<Integer,String> ogrenciMapi = MapDepo.ornekMapOlsutur();

        ogrenciMapi.put(109,"Adem-Demir-11-D-Soz");

        ogrenciMapi = MapDepo.soyisimleriBuyukHarfYap(ogrenciMapi);

        System.out.println(ogrenciMapi);

        /*
        {
        101=Ali-CAN-10-H-MF,
        102=Veli-CEM-11-M-Soz,
        103=Ali-CEM-11-H-TM,
        104=Ayse-CAN-10-H-MF,
        105=Ayse-CEM-11-M-TM,
        106=Fatma-HAN-10-K-Soz,
        109=Adem-DEMİR-11-D-Soz}
         */

    }
}
