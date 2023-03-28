package day06_BagimsizIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pozitif tam sayı gir");
        double not=sc.nextDouble();

        if (not%5==0){
            System.out.println("sayı 5 e bölünebilir");
    }else System.out.println("sayı 5 e bölünemez");

        }
}
