package day06_BagimsizIfCumleleri;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not=scan.nextDouble();
        if (not>=85){
            System.out.println("AA");
        } else if (not>65&&not<85){
            System.out.println("BB");

        } else if (not>=45&&not<65) {
            System.out.println("CC");

        }else System.out.println("kaldınız");
    }

    }

