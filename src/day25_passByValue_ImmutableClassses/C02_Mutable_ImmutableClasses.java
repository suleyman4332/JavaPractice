package day25_passByValue_ImmutableClassses;

import java.util.ArrayList;
import java.util.List;

public class C02_Mutable_ImmutableClasses {
    public static void main(String[] args) {
        /*
        string ve wrapper clas lar immutable oldukları için değiştirilemezler
        ancak array ve list mutable oldukları için
        atama yapmasak da method kullanınca değerleri değişir.
         */
        String str="Java gün geçtikçe daha da keyifli oluyor";
        str.substring(5);
        str.substring(3,15);
        str.startsWith("Java");
        str.toLowerCase();
        System.out.println(str);

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(8);
        System.out.println(sayilar);
        sayilar.set(0,7);
        sayilar.remove(1);
        System.out.println(sayilar);
    }
}
