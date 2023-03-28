package day19_arraLists;

import java.util.ArrayList;
import java.util.List;

public class C06_get {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        System.out.println("sayilar = " + sayilar);
        sayilar.get(0);
        System.out.println("sayilar.get(0) = " + sayilar.get(0));
        System.out.println(sayilar.get(sayilar.size() - 1));

        System.out.println(sayilar.set(2, 12));
        System.out.println(sayilar.set(1, 7));
        System.out.println("sayilar = " + sayilar);

    }
}
