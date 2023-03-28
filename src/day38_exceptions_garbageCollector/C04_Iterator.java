package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {


    /*
    java da colections konusunda öğreneceğimiz set gibi bazı yapılar index desteklemez
    bu durumda index olamdıgından element leri yazdırmak istersek
      for each loop kullanabiliriz
      ama elementler arasında dolasmak belirli sartları saglayanları update etmek istersniz for each loop
      ile yapamazsınız

     */
    List<Integer> sayilar=new ArrayList<>();
    sayilar.add(6);
    sayilar.add(12);
    sayilar.add(14);
    sayilar.add(4);
        sayilar.add(72);

    //çift olan sayiları silin
        for (int i = 0; i <sayilar.size() ; i++) {
            if (sayilar.get(i)%2==0);
            sayilar.remove(i);

        }
        System.out.println(sayilar);
        }



}
