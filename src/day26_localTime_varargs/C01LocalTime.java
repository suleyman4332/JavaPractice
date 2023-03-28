package day26_localTime_varargs;

import java.time.LocalTime;

public class C01LocalTime {
    public static void main(String[] args) {
        LocalTime saat1=LocalTime.of(14,15);
        System.out.println(saat1);
        LocalTime saat=LocalTime.now();
        System.out.println(saat);
        //local time objesi olan saat variable canlı bir saat değildir
        //oluşturulduğu andaki Local time i sistemden alıp kaydettiğimiz sabit bir değerdir


        saat.getHour();//get methodları saat Localtime objesinin saat dakika saniye ve nano degerlerini bize getirir

        saat.plusHours(2);//
        System.out.println(saat.minusMinutes(10).minusSeconds(10));
        System.out.println(saat.withSecond(10).withNano(0));
        System.out.println(saat.compareTo(saat1));
        System.out.println(saat.compareTo(saat));
        System.out.println(saat.isAfter(saat1));
        System.out.println(saat.isBefore(saat1));
        System.out.println(saat.toSecondOfDay());
    }
}
