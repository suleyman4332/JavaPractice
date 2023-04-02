package day39_maps;

import java.util.HashMap;
import java.util.Map;

public class C01_MapIlkClass {
    public static void main(String[] args) {
        Map<Integer,String> okulMap=new HashMap<>();
        /*
        bir map olusturulurken ve element eklerken
        bilgilere sonradan erişimin mümkün olabilmesi için
        tüm elementleri aynı bilgileri barındırdığına
        ve aynı sıralama ile element e eklendiğinden emin olmalıyız
         */

        okulMap.put(101, "Ali, Cem, 10, H, MF");
        okulMap.put(102, "Veli, Can, 10, M, TM");
        okulMap.put(103, "Ali, Can, 11, M, Soz");
        okulMap.put(104, "Ayse, Cem, 11, H, TM");
        okulMap.put(105, "Ayse, Han, 10, H, MF");
        okulMap.put(106, "Veli, Han, 10, H, MF");

        System.out.println(okulMap);

        //Map de kaç element var?
        System.out.println(okulMap.size());//6
        //tüm Key leri yazdıralım
        System.out.println(okulMap.keySet());//[101, 102, 103, 104, 105, 106]
        //tüm value leri yazdıralım
        System.out.println(okulMap.values());
        //[Ali, Cem, 10, H, MF, Veli, Can, 10, M, TM, Ali, Can, 11, M, Soz, Ayse, Cem, 11, H, TM, Ayse, Han, 10, H, MF, Veli, Han, 10, H, MF]

        //value collectıon içinde kaç element vardir
        System.out.println(okulMap.values().size());//6



    }
}
