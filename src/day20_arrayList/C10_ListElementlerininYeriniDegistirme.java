package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_ListElementlerininYeriniDegistirme {
    public static void main(String[] args) {
        List<Integer>sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(10);
        //2. index te ki element ile 5. indexteki elementin yerini değiştirin
        System.out.println(sayilar);
        //önce birtanesini temp variable ye atayalım
        int temp=sayilar.get(2);
        //2. index e 5 inci index deki değeri atayalım
        sayilar.set(2,sayilar.get(5));
        //5.index e temp deki değeri atayalım
        sayilar.set(5,temp);
        System.out.println(sayilar);
        //ödev verilen bir listede istenen 2 indexteki elementlerin yerini değiştirip
        //yeni listeyi bize döndüren bir method oluşturun

    }
}
