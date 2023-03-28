package week05;

import java.util.Scanner;

public class P01_methodCration {
    static String output="";
    public static void main(String[] args) {
        /*Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
bir method olusturun.
- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
mesaji verin
- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
yazdirin.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen string bir ifade giriniz");
        String input=scan.nextLine();
        stringdekiHarfleriYazdir(input,1,35);



    }

    private static void stringdekiHarfleriYazdir(String input, int baslangic, int bitis1) {
        if(baslangic>bitis1){
            System.err.println("Hata :Baslangıc degeri bitisden büyük olamaz");
        }
        else if(baslangic>input.length()-1|| bitis1>input.length()-1){
            System.err.println("HATA: Girilen deger String sinirlari disinda bir degerdir.");
        }else {
        input=input.replace(" ","");
        for (int i = baslangic; i <bitis1 ; i++) {
            output+=input.charAt(i)+",";
        }
        System.out.println(output);

    }


}}
