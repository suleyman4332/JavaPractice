package day25_passByValue_ImmutableClassses;

import java.time.LocalTime;

public class C05_DateTime {
    public static void main(String[] args) {
        LocalTime saat=LocalTime.now();
        System.out.println(saat);

        System.out.println(saat.getNano());


        //bir loop ile 1 den 10 bin e kadar olan sayiları toplayin
        //ve bu işlemin kaç nano saniye sürdügünü bulun
        int toplam=0;

        int basSuresiNano=saat.getNano();
        for (int i = 1; i <10000 ; i++) {
            toplam+=i;

        }
        LocalTime saatSon=LocalTime.now();
        int bitSuresiNano= saatSon.getNano();
        System.out.println("islem süresi : "+(basSuresiNano-bitSuresiNano));


    }
}
