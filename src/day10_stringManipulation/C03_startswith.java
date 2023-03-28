package day10_stringManipulation;

import java.util.Scanner;

public class C03_startswith {
    public static void main(String[] args) {
//        - mail @ icermiyorsa “gecersiz mail”
//        - mail @gmail.com icermiyorsa, “mail gmail olmali”
//        - mail @gmail.com ile bitmiyorsa, “mailde yazim hatasi var”
        Scanner sc=new Scanner(System.in);
        System.out.println("mail giriniz");
        String mail=sc.nextLine();
        if(!mail.contains("@")){
            System.out.println("ail @ içermelidir");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");

        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mailde yazım hatası var");

        }


    }
}
