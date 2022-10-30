package ders15_overloading_whileLoop;

public class C08_RakamlarToplamı {
    public static void main(String[] args) {

        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi = 145314111;

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi!=0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }

        System.out.println(rakamlarToplami);
    }
}
