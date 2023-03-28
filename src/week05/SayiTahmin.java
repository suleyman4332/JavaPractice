package week05;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        int sayi=95;
        System.out.println("aklımdan bir sayı tuttum tahmin et");
        Scanner sc=new Scanner(System.in);
        boolean bl=false;
        while (!bl){
            int tahmin= sc.nextInt();


            if (tahmin>sayi){
                System.out.println("çok söyledin azalt");
            }else if (tahmin<sayi){
                System.out.println("az söyledin artır");
            } else if (tahmin==sayi) {
                System.out.println("tebrikler ");
                bl=true;

            }else {

            }


        }

    }
}