package day39_maps;


    import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
    import java.util.Set;

public class MapMethodDepo {
        public static Map<Integer,String > ornekMapOlustur(){
            Map<Integer,String> okulMap= new HashMap<>();
            okulMap.put(101, "Ali-Cem-10-H-MF");
            okulMap.put(102, "Veli-Can-10-M-TM");
            okulMap.put(103, "Ali-Can-11-M-Soz");
            okulMap.put(104, "Ayse-Cem-11-H-TM");
            okulMap.put(105, "Ayse-Han-10-H-MF");
            okulMap.put(106, "Veli-Han-10-H-MF");
            return okulMap;
        }
        public static void subeOgrenciListesiYazdir(Map<Integer, String> okulMap, String istenenSube) {
            // 1- value'lari ayri bir collection olarak kaydedelim
            Collection<String> valueCollection = okulMap.values();
            //     [Ali-Cem-10-H-MF, Veli-Can-10-M-TM, Ali-Can-11-M-Soz, Ayse-Cem-11-H-TM, Ayse-Han-10-H-MF, Veli-Han-10-H-MF, Kerem-Umut-12-K-MF]
            // 2- her bir value'u split ile bir array'e donusturelim
            System.out.println("=======Sube listesi=======");
            System.out.println("Sira  Sinif  Isim  Soyisim");
            int siraNo=1;
            for (String eachValue: valueCollection
            ) {
                // Ali-Cem-10-H-MF
                String[] valueArr = eachValue.split("-"); // [Ali, Cem, 10, H, MF]
                // 3- array'den sube'yi kontrol edip
                //    eger istenen sube ise ogrencinin sinif isim ve soyismini yazdiralim
                if (valueArr[3].equalsIgnoreCase(istenenSube)){
                    System.out.println(siraNo+ " - "+valueArr[2] +", " + valueArr[0] + ", " + valueArr[1]);
                    siraNo++;
                }
            }
        }

        public static Map<Integer, String> topluSubeDegistirme(Map<Integer, String> okulMap, String eskiSube, String yeniSube) {

            //1-once key leri Set olarak kaydedelim
            Set<Integer> okulKeySeti=okulMap.keySet();


            for (Integer eachKey:okulKeySeti
                 ) {
                //2-her bir  key e ait value yi split ile array e dönüştürelim
                String[]valueArr=okulMap.get(eachKey).split("-");
                //3-sube bilgisi eski sube olanları yeniSube yapalım
                if (valueArr[3].equalsIgnoreCase(eskiSube)){
                    valueArr[3]=yeniSube;
                }

                //4-array deki bilgileri birleştirerek yeniden Map e ekleyelim

                String yeniValue="";
                for (int i = 0; i <valueArr.length-1 ; i++) {
                    yeniValue+=valueArr[i]+"-";
                }
                yeniValue+=valueArr[valueArr.length-1];

                okulMap.put(eachKey,yeniValue);


            }
            return okulMap;

            //5-okulMap ının son halini return edelim
        }

    public static Map<Integer, String> yilsonusiniflariDegistir(Map<Integer, String> okulMap) {
        //1-key leri bir set olarak kaydedelim
        Set<Integer>keySeti=okulMap.keySet();

        //2-set deki her bir key e ait value yi for each loop ile ele alalım
        for (Integer eachKey:keySeti
             ) {
            //3-her key e ait value yu split() ile ayırıp ,array olarak kaydedelim
            String[] valueArr=okulMap.get(eachKey).split("-");

            //4-array olarak kaydettiğimiz bilgilerde istenen update i yapalım
            if (valueArr[2].equalsIgnoreCase("12")){
                valueArr[2]="Mezun";
            }else {//"9" "10" "11"
                int sinif=Integer.parseInt(valueArr[2]);
                sinif++;
                valueArr[2]=sinif+"";

            }

            //5-array in yeni halini String olarak birleştirip yeniValue elde edelim
            String yeniValue="";
            for (int i = 0; i <valueArr.length-1 ; i++) {
                yeniValue+=valueArr[i]+"-";
            }
            yeniValue+=valueArr[valueArr.length-1];
            //6-her bir key ve yeni value yi Map e ekleyerek map i update edelim
            okulMap.put(eachKey,yeniValue);

        }
    return okulMap;

        //3-her key e ait value yu split() ile ayırıp ,array olarak kaydedelim

        //4-array olarak kaydettiğimiz bilgilerde istenen update i yapalım

        //5-array in yeni halini String olarak birleştirip yeniValue elde edelim

        //6-her bir key ve yeni value yi Map e ekleyerek map i update edelim
        //7-map in yeni halini return edelim





    }
}
