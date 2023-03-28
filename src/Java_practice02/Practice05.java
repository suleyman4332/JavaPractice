package Java_practice02;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
       /* Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
                hesaplayi
    }*/
        Scanner sc =new Scanner(System.in);
        System.out.println("20den küçük sayı giriniz");
        int sayi= sc.nextInt();
        for (int i = 1; i <=sayi; i++) {
            sayi*=i;

        }
        System.out.println(sayi+"  !="+sayi);
}}
