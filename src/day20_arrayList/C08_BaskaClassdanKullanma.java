package day20_arrayList;

public class C08_BaskaClassdanKullanma {
    public static void main(String[] args) {
        //verilen sayinin pozitif tam bölenleri sayisi 10 dan çok ise "güzel"
        //yoksa "kötü" yazdırın
        int sayi=3000;
        int pozitifTamBolenlerSayisi=C07_tamBolenlerListesi.pozitifBolenleriListele(sayi).size();
        if (pozitifTamBolenlerSayisi>10){
            System.out.println("güzel");
        }else System.out.println("kötü");

    }
}
