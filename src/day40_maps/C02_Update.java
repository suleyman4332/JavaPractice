package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C02_Update {
    public static void main(String[] args) {
        //verilen okul Map inde ogrencilerin sınıflarını 1 artırın
        //eger 12. sınıf varsa sınıf bilgisi olarak mezun yazın
        //eger update varsa ,key ve value birlikte düşünülmelidir
        //aynı key ile yeni value yi map e eklediğimizde
        //key unique olacagi icin eski value yi update edip yeni value değerini kaydeder

        Map<Integer,String>okulMap= MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        okulMap=MapMethodDepo.yilsonusiniflariDegistir(okulMap);
        System.out.println(okulMap);

        okulMap=MapMethodDepo.yilsonusiniflariDegistir(okulMap);
        System.out.println(okulMap);
    }
}
