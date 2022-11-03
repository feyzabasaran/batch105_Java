package ders04_matematikselIslemler_incrementDecrement;

public class C09_Pre_Post_Increment {
    public static void main(String[] args) {

        //Post-increment once atama sonra artirma islemi yapilir
        int num1=9;
        int num2=num1++;

        // post increment once num2'ye yeni deger ata
        // num1 'in degerini 1 artırıyoruz
        System.out.println(num1);
        System.out.println(num2);

        // Pre increment once atirma sonra atama islemi yapiyoruz.

        int num3= 7;
        int num4=++num3;

        // pre increment once num3'u artırıyoruz
        // num4'e yeni degeri atıyoruz

        System.out.println(num3);
        System.out.println(num4);
    }






}
