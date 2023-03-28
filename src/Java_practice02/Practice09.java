package Java_practice02;

import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        /*Kullanicidan isim ve soyismini ayri ayri alin.
                ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin*/
        Scanner sc = new Scanner(System.in);
        System.out.println("isim  giriniz");
        String name = sc.nextLine();
        System.out.println("soyisim giriniz");
        String surname = sc.nextLine();
        if (name.length() > surname.length()){
            name=name.substring(0,1).toUpperCase()+surname.substring(1,name.length()).toLowerCase();
            surname=surname.substring(0,1).toUpperCase()+surname.substring(1,surname.length()).toLowerCase();
            System.out.println(name+" "+surname);

        } else if

        (name.length()<surname.length());
        name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
        surname=surname.toUpperCase();
        System.out.println(name+" "+surname);

    }
}