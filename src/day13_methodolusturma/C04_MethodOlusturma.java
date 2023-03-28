package day13_methodolusturma;

import java.util.Scanner;

public class C04_MethodOlusturma {
    public static void main(String[] args) {
        // Kullanicidan 10'dan kucuk iki pozitif tamsayi alip
        // faktoryel degerlerini toplayin

        Scanner sc=new Scanner(System.in);
        System.out.println("10 dan küçük sayı giriniz");
        int sayi1=sc.nextInt();
        int sayi2=sc.nextInt();
        int sonuc= C03_MethodOlusturma.faktoyel(sayi1)+C03_MethodOlusturma.faktoyel(sayi2);
        System.out.println(sonuc);


    }


}
