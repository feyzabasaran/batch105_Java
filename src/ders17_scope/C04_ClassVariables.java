package ders17_scope;

public class C04_ClassVariables {

    public static void main(String[] args) {
        // C03'teki hastane ismini yazdirmak istersek
        System.out.println(C03_ObjectVariables.hastaneismi); // Yildiz hastanesi

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1(); // 1 defa da bu method'da artirdik
        System.out.println(C03_ObjectVariables.hastaSayisi++); // 23456

    }  //  kod takibi main method'dan baslar main methodun sonuna gelindiginde
    // herşey resetlenir ve en bastaki hali dikkate alinir.

    public static void method1(){
        C03_ObjectVariables.hastaSayisi++;

    }


    /*
    Java Runtime programdir.
    calismaya basladiginda variable'lara atanan degerleri isler
    calistigi muddetce yapilan degisiklikleri kaydeder
    ama calismasi bittiginde degisen degerler resetlenir
     */
}
