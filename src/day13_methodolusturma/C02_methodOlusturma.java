package day13_methodolusturma;

import java.util.Scanner;

public class C02_methodOlusturma {
    public static void main(String[] args) {
        //kullanıcıdan 2 sayi alıp
        //toplamlarını yazdıran bir method oluşturun
        ikiSayiTopla();
        ikiSayiTopla();

    }
    public static void ikiSayiTopla(){
    Scanner sc=new Scanner(System.in);
        System.out.println("iki adet sayı giriniz");
    int sayi1=sc.nextInt();
    int sayi2=sc.nextInt();
        System.out.println("top"+(sayi1+sayi2));
}}
