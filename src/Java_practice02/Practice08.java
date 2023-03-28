package Java_practice02;

import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
/*
        1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        "Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("üçgenin üç kenar uzunluğunu girin");
        int kenar1 = sc.nextInt();
        int kenar2 = sc.nextInt();
        int kenar3 = sc.nextInt();
        System.out.println((kenar1 == kenar2 && kenar2 == kenar3 ? "eşkenar üçgen" :
                "eşkenarkanr üçgen değil"));
        Scanner scn = new Scanner(System.in);
        System.out.println("iki adet sayı girin");
        int sayi1 = scn.nextInt();
        int sayi2 = scn.nextInt();
        System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);

        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not = scan.nextDouble();
        System.out.println(not >= 50 ? "sınıfı geçtin" : "kaldınız");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("rakam giriniz");
        int rakam = scan1.nextInt();
        switch (rakam) {
            case (1):
                System.out.println("bir");
                break;
            case (2):
                System.out.println("iki");
                break;
            case (3):
                System.out.println("üç");
                break;
            case (4):
                System.out.println("dört");
                break;
            case (5):
                System.out.println("beş");
                break;
            case (6):
                System.out.println("alyı");
                break;
            case (7):
                System.out.println("yedi");
                break;
            case (8):
                System.out.println("sekiz");
                break;
            case (9):
                System.out.println("dokuz");
                break;
            default:
                System.out.println("hatalı giriş");
                Scanner scan2 = new Scanner(System.in);
                System.out.println("lütfen istediğiniz ay no giriniz");
                int ayNo = scan1.nextInt();
                switch (rakam) {
                    case (1):
                    case (2):
                    case (12):
                        System.out.println("kış");
                        break;
                    case (3):
                    case (4):
                    case (5):
                        System.out.println("ilkbahar");
                        break;
                    case (6):
                    case (7):
                    case (8):
                        System.out.println("yaz");
                        break;
                    case (9):
                    case (10):
                    case (11):
                        System.out.println("sonbahar");
                        break;
                    default:
                        System.out.println("hatalı giriş");

                }


        }
    }}


