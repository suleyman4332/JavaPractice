package Java_practice02;

import java.util.Scanner;

public class Practice13 {
    public static void main(String[] args) {
        int sayi = 1459;
        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Rakamlar toplamı: " + toplam);
                
    }

 }
