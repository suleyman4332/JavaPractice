package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {
    public static void main(String[] args) {
        //uzun bir listeyi java da list olarak kaydetmek istersek
        //tek tek eklemek istemessek pratik olarak bir array olusturup loop ile
        //tüm elementleri list e ekleyebiliriz

        int []arr={2,3,5,4,3,6,7,5,4,3,2,5,6,8,6,5,1};

        List<Integer> sayilar =new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);

        }System.out.println(sayilar);
        //listede element olarak 3 varmı ?
        System.out.println(sayilar.contains(3));
        System.out.println(sayilar.contains(9));
        System.out.println(sayilar.get(5));
        System.out.println(sayilar.set(4, 6));//değişim yapıyor sonra atıyor
        System.out.println(sayilar);
        sayilar.clear();
        System.out.println(sayilar);


    }
}
