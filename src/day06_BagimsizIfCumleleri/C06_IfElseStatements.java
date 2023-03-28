package day06_BagimsizIfCumleleri;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yas=scan.nextInt();
        if (yas>=65){
            System.out.println("emekli olabilirsin");
        }else System.out.println("emekliliğe kalan yas"+(65-yas));

    }
}
