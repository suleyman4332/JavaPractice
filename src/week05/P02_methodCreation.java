package week05;

import java.awt.*;
import java.util.Scanner;

public class P02_methodCreation {
    static String duzenliStr="";
    public static void main(String[] args) {
        /*Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun*/
        Scanner scan=new Scanner(System.in);
        System.out.println("isim giriniz");
        String isim=scan.nextLine();
        System.out.println("2.isim gir");
        String name2=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();

        System.out.println(isimSoyisimYazdir(isim,name2,soyisim));


    }

    private static String isimSoyisimYazdir(String isim,String name2, String soyisim) {
        isim=isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase();
        name2=name2.toUpperCase().charAt(0)+name2.substring(1).toLowerCase();
        soyisim=soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase();
        duzenliStr=isim+" "+name2 +" "+soyisim;
        return duzenliStr;

    }
}
