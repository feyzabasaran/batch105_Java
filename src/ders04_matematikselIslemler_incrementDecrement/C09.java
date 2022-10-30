package ders04_matematikselIslemler_incrementDecrement;

public class C09 {
    public static void main(String[] args) {

        int num1=9;
        int num2=num1++;

        // post increment önce num2'ye yeni değer ata
        // num1 'in değerini 1 artırıyoruz
        System.out.println(num1);
        System.out.println(num2);


        int num3= 9;
        int num4=++num3;

        // pre increment önce num3'ü artırıyoruz
        // num4'e yeni değeri atıyoruz

        System.out.println(num3);
        System.out.println(num4);
    }






}
