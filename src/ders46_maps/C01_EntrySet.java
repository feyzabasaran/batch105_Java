package ders46_maps;

import ders44_maps.MapDepo;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {

    public static void main(String[] args) {


        // onceki iki derste key(Set) ve value(Collection) degerlerini toplu olarak alabiliyorduk
        // ancak key ve value birlikte kullanmak istedigimizde
        // bu islemi yapmak zor olur.

        // bunun icin java Entry Interface'ini olusturmustur.
        // Entry'ler key = value ikilisini 1 Entry olarak kabul eder

        Map<Integer,String> ogrenciMap = MapDepo.ornekMapOlsutur();
        System.out.println(ogrenciMap);
        System.out.println(ogrenciMap.size()); // 6
        ogrenciMap.put(108,"Mehmet-Erkan-12-K-MF");
        /*
        {
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        }
         */

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti =ogrenciMap.entrySet();
        System.out.println(ogrenciEntrySeti);


        /*
        [
        101=Ali-Can-10-H-MF,
        102=Veli-Cem-11-M-Soz,
        103=Ali-Cem-11-H-TM,
        104=Ayse-Can-10-H-MF,
        105=Ayse-Cem-11-M-TM,
        106=Fatma-Han-10-K-Soz
        ]

        aralarindaki farklar
        1- Yukaridaki map , bu set
        2- yukaridaki {} kullaniyor, bu ise []
        3- yukardakinde key ve value'ler her eleman icin bir arada ama ayri ayri birayler
           Entry'de ise K=V ikisi birlikte bir element olusturuyor.

        */

        // entry seti icerisindeki entryleri biz de sira numarasi vererek yazdiralim

        int siraNo=1;

        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            System.out.println(siraNo + "-  " + eachEntry);
            siraNo++;
        }

        /*
        1-  101=Ali-Can-10-H-MF
        2-  102=Veli-Cem-11-M-Soz
        3-  103=Ali-Cem-11-H-TM
        4-  104=Ayse-Can-10-H-MF
        5-  105=Ayse-Cem-11-M-TM
        6-  106=Fatma-Han-10-K-Soz
         */

        // Entry'leri kullanarak Key'leri yazdirin

        for (Map.Entry<Integer,String> eachEntry:ogrenciEntrySeti
             ) {
            System.out.println(eachEntry.getKey());
        }
        /*
        101
        102
        103
        104
        105
        106
         */

        // Entry'leri kullanarak tum ogrencilerin siniflarini 1 artirin
        // 12. sinifta olan varsa map'ten cikarin

        // tum entry'leri elden gecirelim
        String entryValue;
        String[] entryValueArr;
        for (Map.Entry<Integer,String> eachEntry: ogrenciEntrySeti
             ) {
            // her bir entry'deki value'yi alip parcalayip, istenen update'i yapip,
            // yeniden map'e eklememiz lazim
            entryValue= eachEntry.getValue(); // Ali-Can-10-H-MF
            entryValueArr=entryValue.split("-"); //  [Ali, Can, 10, H, MF]

            if (entryValueArr[2].equals("12")){
                // ogrencinin sinifi 12 ise
                eachEntry.setValue("Mezun oldu");

            }else  {
                // ogrencinin sinifi 12 degil ise
                int sinif = Integer.parseInt(entryValueArr[2]);
                sinif++;
                entryValueArr[2] = sinif+"";  // [Ali, Can, 11, H, MF]
                eachEntry.setValue(entryValueArr[0]+"-"+
                                   entryValueArr[1]+"-" +
                                   entryValueArr[2]+"-" +
                                   entryValueArr[3]+"-" +
                                   entryValueArr[4]);

            }
        }
        System.out.println(ogrenciMap);

        /*
        {101=Ali-Can-11-H-MF,
        102=Veli-Cem-12-M-Soz,
        103=Ali-Cem-12-H-TM,
        104=Ayse-Can-11-H-MF,
        105=Ayse-Cem-12-M-TM,
        106=Fatma-Han-11-K-Soz}
         */








    }
}
