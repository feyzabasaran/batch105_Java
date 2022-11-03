package ders27_immutableClasses_DateAndTime;

import java.time.LocalTime;

public class C05_LocalTime {
    public static void main(String[] args) {

        LocalTime saat= LocalTime.now();

        System.out.println(saat); // 00:59:40.935444 o an ki  saati yazdiriyor

        LocalTime saat2 = LocalTime.of(19,10,20);

        System.out.println(saat.compareTo(saat2)); //-1 kücükse negatif buyukse 1 donuyor

        System.out.println(saat2.withNano(45565)); // 19:10:20.000045565  Nano saniye ekliyor

    }
}
