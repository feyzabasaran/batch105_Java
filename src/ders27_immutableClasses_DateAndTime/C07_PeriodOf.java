package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C07_PeriodOf {
    public static void main(String[] args) {

        // dogumumuzdan bugune ne kadar zaman gecti?

        LocalDate bugun = LocalDate.now();

        LocalDate dogumGunu= LocalDate.of(1994,06,15);

        Period gecenSure= Period.between(dogumGunu,bugun);

        System.out.println(gecenSure); // P 28Year 4Month 16Day

        System.out.println(gecenSure.getYears()); // 28





    }
}
