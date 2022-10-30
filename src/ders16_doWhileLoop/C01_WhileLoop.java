package ders16_doWhileLoop;

public class C01_WhileLoop {

    public static void main(String[] args) {

        // 10,11,12 sayilarini toplayan bir while loop olusturalim.

        int sayi= 10;
        int toplam = 0;

        while (sayi<=12){
            toplam+=sayi;
            sayi++;
        }

        /*
        while loop'da 2 problem oluşabilir
        1- once dedgeri kontrol edip sonra islem yaptigimizdan
        body'de bir kere daha kontrol etmemiz gerekebilir.
        2- yapilan islem sayisindn bir fazla while bitis satri kontrol
        edilir
        3- while loop oncesinde degerleri kontrol edecegimiz bir
        variable olusturuyorsak ona yapacagimiz atamayi dikkatli yapmamiz gerekebilir.
        yanlis deger atamasi yapmak, bazen while loopun calismamasina neden olabilir


         */
        System.out.println(toplam);
    }

}
