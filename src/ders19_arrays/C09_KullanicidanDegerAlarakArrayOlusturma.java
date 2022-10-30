package ders19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C09_KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alip, bir array olusturun
        // kullanici eleman girisini bitirmek icin 0'a bassin

        Scanner scan=new Scanner(System.in);

        int[] arr = {0};
        int girilenSayi=0;

        do {

            System.out.println("Array'e eklemek icin bir tamsayi giriniz" +
                    "\nBitirmek icin 0'a basin");
            girilenSayi= scan.nextInt();

            if (arr[0]==0 ){
                arr[0]=girilenSayi;
            }else if (girilenSayi!=0){
               arr= C08_ArrayeElementEklemeMethodu.arrayeElemanEkleMethodu(arr,girilenSayi);

            }

        }while (girilenSayi!=0);

        System.out.println(Arrays.toString(arr));
    }
}
