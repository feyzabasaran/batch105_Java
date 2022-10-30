package ders19_arrays;

import ders12_forLoops.C06_Soru;
import ders18_arrays.C03_ArrayElementleriniArtirma;
import ders18_arrays.C04_ArrayElementleriToplami;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {

        // verilen bir array'in elementlerini 2 artirin

        int[] arr = {2,3,4};

        arr= C03_ArrayElementleriniArtirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));  // [4, 5, 6]

        // arr array'inin elementlerini toplayip sonucu yazdirin

        System.out.println(C04_ArrayElementleriToplami.pozitifElementleriTopla(arr)); // 15

        // arr array'inde 10 element olarak var mi ?

        C05_ArraydeElemanArama.elemanAra(arr,10); // aranan sayi array'de yok

        // Kullanicidan bir deger alarak bir array olusturun

        int[] yeniArr = C06_KullaniciyaArrayOlusturma.arrayOlustur();

        System.out.println(Arrays.toString(yeniArr)); // [1, 2, 3]
    }
}
