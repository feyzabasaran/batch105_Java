package ders36_checkedExceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        FileInputStream fos = new FileInputStream("src/ders36_checkedExceptions/Deneme.txt");

        // Java ile bilgisayarimizdaki bir dosyaya ulasmak istersek
        // FileInputStream class'indan obje olusturup
        // o obje araciligiyla dosyayi kullanabiliriz.

        // FileInputStream olusturulurken ulasmak istedigimiz dosyanin
        // dosya yolunu parametre olarak girmeliyiz.

        /*
        Checked exception olusturma ihtimali olan kodlari yazdigimizda
        java compile time orada bir hata ihtimali oldugunu gorur
        ve kodun altini kirmizi olarak cizer

        bu durumda kirmizi cizgiyi kaldirmak icin 2 yontem vardir
        1- exception'i try catch blogu ile handle etmek
        2- Java'ya sorun ihtimalinin farkinda oldugumuzu ama kodumuza guvendigimizi
           ve calismaya devam etmesini istedigimizi soylemek
         bunun icin method signature'na
         method deklarastyonun ile curly braces{} arasina
         throws keyword ve beklenen exception turu yazilabilir
         */

    }


}
