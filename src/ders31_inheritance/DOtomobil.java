package ders31_inheritance;

import java.util.List;

public class DOtomobil extends BinekArac{

    public static void main(String[] args) {
        DOtomobil oto1 = new DOtomobil();
        System.out.println(oto1.marka);

        // inheritance sayesinde bir child class olusturdugunuzda
        // yeni hic bir variable veya method olusturmadan
        // parent classlardaki tum ozellikleri almis oluruz.
        // child class'da parent'dan gelen ozellikleri
        // update edebilir veya yeni ozellikler ekleyebiliriz.


    }
}
