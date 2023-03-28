package day26_localTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodOfTime {
    public static void main(String[] args) {
        LocalDate dogumtarihi=LocalDate.of(1980,1,1);
        LocalDate bugun=LocalDate.now();
        System.out.println(Period.between(dogumtarihi, bugun));//P43Y2M8D
        System.out.println("yas  :"+Period.between(dogumtarihi,bugun).getYears());
        System.out.println("yas  :"+Period.between(dogumtarihi,bugun).getDays());

    }
}
