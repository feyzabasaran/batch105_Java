package ders28_varargs_stringBuilder;

public class C02_Varargs {

    public static void main(String[] args) {

        topla(5,6); // 11
        topla(5,3,8); // 16
        topla(2,4,6,8); // 20
        topla(1); // 1
        topla(3,6,7,4,7,9,0,3,1); // 40

        /*
        Bir method'da parametre sayisini sinirlandirmak istemezsek
        standart bir variable yerine Varargs kullaniriz.

       Varargs = Variable arguments
       Varargs data turunun yanina ... nokta konularak deklare edilir.
       int... ==> sayisi belirli olmayan int parametreler alan bir Array'dir.
         */

    }

    private static void topla(int... sayilar) {

        int toplamSonucu= 0;

        for (int each:sayilar
             ) {
            toplamSonucu+=each;
        }
        System.out.println("Girilen sayilarin toplami: " + toplamSonucu);

    }

}
