package ders40_Interfaces;

public interface I03_InterfaceChildOfInterface extends I01_Interface{


    // Eger bir interface'i baska bir interface'in child'i yapmak isterseniz
    // extends keyword kullanilir.

    // Bir interface concrete class'i INHERİT EDEMEZ

    void method1();
    // interface bir child parent interface'deki
    // abstract method'u override edebilir ama
    // ikisinin de body'si olmadigindan
    // bu islemin bir anlami yoktur

    int method4 ();
    boolean method5 ();
}
