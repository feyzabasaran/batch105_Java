package ders40_Interfaces;

public class I02_ConcreteChildClassOfInterface implements I01_Interface {

    // Bir class'i bir interface'in child'i yapmak icin implements keyword kullanilir.

    public static void main(String[] args) {

        System.out.println(MESAJ); // Hello Interface
        // sayi=40;  Yazili olmasa da Interface icerisinde oldugundan
        // final'dir ve atama yapilamaz.
        // final olan variable'a yeni deger atamasi yapamayiz.

        System.out.println(Integer.MAX_VALUE);
        // normalde variable isimleri, kucuk harfle baslar ve camelCase kullanilir.
        // Ancak javada ortak kabul olarak
        // static ve final olarak isaretlenen variable isimleri tamamen buyuk harf ile yazilir.


        System.out.println(Math.PI);

    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    public String method3() {
        return null;
    }
}
