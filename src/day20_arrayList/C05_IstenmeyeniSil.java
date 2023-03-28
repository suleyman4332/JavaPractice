package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_IstenmeyeniSil {
    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede istenmeyen harf iceren elementleri
        //silip, kalan kismini list olarak bize donduren bir method olusturun
        List<String> liste=C04_KullaniciyaListeOlusturtmak.kullaniciyaListOlusturtma();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kullanılmasını istemediğiniz bir harf girin");
        String istenmeyenharf=scan.next().substring(0,1);

        List<String>ayiklanmisList=istenmeyenharfIcerenlerisil(liste,istenmeyenharf);
        System.out.println(ayiklanmisList);


    }

    public static List<String> istenmeyenharfIcerenlerisil(List<String> liste, String istenmeyenharf) {
        //mesela liatemiz ali ,veli ,ayşe ,fatma ve istenmeyen harf a
        //for loop ile elementleri ele alırken remove yaparsak
        //list in uzunluğu değişeceği için sorun yasarız
        //farklı bir list olusturup ,silinmeyecekleri  yeni listeye kaydedelim
        List<String>kalanlarListesi=new ArrayList<>();
        for (int i = 0; i <liste.size(); i++) {
        if (!liste.get(i).contains(istenmeyenharf)){
            kalanlarListesi.add(liste.get(i));

        }
        }
        return kalanlarListesi;

    }

}
