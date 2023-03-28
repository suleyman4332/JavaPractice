package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplami {
    public static void main(String[] args) {


        // Kullanıcıdan istediği kadar tam sayı alıp toplayın.
// Kullanıcı Q'ya bastığında işlemi sonlandırıp
// kaç sayı girildiğini ve toplamını yazdırın
// Q veya q dışında tam sayı olmayan bir değer girilirse
// hata mesajı verip yeni değer isteyerek işleme devam edin


        int sayac=0;
        int toplam=0;
        int girilenSayi=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("toplanmak üzere tamsayi giriniz\n bitirmek için q ya basın");
            try {
                girilenSayi=scan.nextInt();//q ,Q veya geçersiz baska input girerse exception olusur
                toplam+=girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {

                char input=scan.next().charAt(0);
                if(input=='q'|| input=='Q'){
                    System.out.println("girilen "+sayac+"adet tamsayının toplamı:=="+toplam);
                    break;
                }else {
                    System.out.println("Tamsayi değeri girmelisiniz");
                }

            }



        }while (true);
        System.out.println("bu is bu kadar");


    }
}