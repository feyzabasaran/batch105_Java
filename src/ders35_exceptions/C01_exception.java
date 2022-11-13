package ders35_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_exception {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alip
        // o sayinin karesini yazdiran
        // Kullanici ondalikli sayi girerse kullaniciya uyari yazisi yazdirip
        // tekrar sayi isteyen bir method olusturun

        sayiAlKaresiniYazdir();

    }

    public static void sayiAlKaresiniYazdir (){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");


        try {
            int girilensSayi = scan.nextInt();
            /*
            Eger ondalikli sayi girilirse 26. satir exception verecek ve
            catch bloguna kadar olan diger kodlar calismayacak.
            catch blogu hata yakalandiginda ne yapmasini istedigimizi soyledigimiz bolumdur.

            Bu soruda istenen exception olustugunda yeniden deger istenmesi
            biz de exception olustugunda yeniden method'u calistirdik

            hata olmazsa catch blogu devreye girmez ve kod normal bir sekilde calisir.
             */
            System.out.print("Girdiginiz sayinin karesi: ");
            System.out.println(girilensSayi*girilensSayi);

        } catch (InputMismatchException e) {

            System.out.println("Sana tamsayi degeri gir dedik :) ");
            sayiAlKaresiniYazdir(); // recursive call, icinde bulundugu method'u cagirma

        }


    }
}
