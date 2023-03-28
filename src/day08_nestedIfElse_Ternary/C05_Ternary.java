package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("tam sayı giriniz");
        int sayi=sc.nextInt();
        System.out.println(sayi>=0?"sayı": sayi*(-1));
    }
}
