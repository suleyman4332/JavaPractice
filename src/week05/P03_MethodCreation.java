package week05;

import java.util.Scanner;

public class P03_MethodCreation {
    public static void main(String[] args) {
        /*Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
sonuclarini donduren bir method olusturun.*/
        Scanner scan=new Scanner(System.in);
        System.out.println(" Lütfwn pozitif bir tam sayi girin");
        int sayi=scan.nextInt();
        System.out.println(asalSayiKontrolEt(sayi));

    }

    private static int asalSayiKontrolEt(int sayi) {


        return 0;
    }
}
