package ders34_overriding_pollymorphism;

public class DChild extends CParent{

    /*
    Overriding kurallari
    1- Access modifier method signature'a dahil olmadigindan
       overridden ve overriding access modifier'lar farkli olabilir
       child parent'i sinirlandiramaz
       yani overriding method'un access modifier'i daha genis kapsamli olmalidir.
     public -->  protecden  -->  default -->  private
     */

    protected void method1(){

    }

    // 2- private,final ve static method'lar override edilemez
    //    ayni isimde method olusturulunca java CTE vermez
    //    ancak override isareti cikmaz ve
    //    @Override notasyonu kullanilmak istenirse CTE verir
    //    Yani Java bunlari farkli class'lardaki farkli method'lar olarak kabul eder.

    public static void method2 (){

    }

    private void method3(){

    }

    // 3- Return type method signature'ina dahil olmadigindan
    //    farkli secilebilir ancak
    //    return type void veya primitive ise ayni olmak zorundadir.
    //    Eger return type'lar non-primitive ise
    //    Child class'daki return type, parent class'daki return type'i
    //    yine ayni veya child'i olmalidir


    public void method4(){

    }

    public String method5(){

        return "";
    }
}
