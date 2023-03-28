package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {
        //kullanıcıdan bir harf isteyin
        //o harfle baslayan gün ismi varsa yazdırın
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        switch (harf){
            case ('p'):
                System.out.println("pazartesi,perşembe.pazar");
                break;
            case ('s'):
                System.out.println("salı");
                break;
            case ('ç'):
                System.out.println("çarşamba");
                break;
            case('c'):
                System.out.println("cuma,cumartesi");
                break;
            default:
                System.out.println("hatalı giriş");


        }


    }
}
