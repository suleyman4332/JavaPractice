package week07;

import java.util.Scanner;

public class P02_doWhileLoop {
    /*
    Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
    kontrol edin ve sifredeki hatalari yazdirin.
    Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
        sifre girdiginde "Sifreniz Kabul edilmistir" yazdirin.
        - Sifre kucuk harf icermelidir
        - Sifre buyuk harf icermelidir
        - Sifre ozel karakter icermelidir
        - Sifre en az 8 karakter olmalidir.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sayac=0;
        String sifre=scan.nextLine();
        do {
            System.out.println("şifre giriniz");
            sifre= scan.nextLine();
            for (int i = 0; i <sifre.length() ; i++) {
                if (!(sifre.charAt(i)>=65&&sifre.charAt(i)<=90)){
                    System.out.println("sifre büyük harf içermelidir");
                    sayac++;
                }
                if ((sifre.charAt(i)>=97&&sifre.charAt(i)<=122)){
                    System.out.println("şisre küçük harf içermelidir");
                    sayac++;
                }
                if ((sifre.charAt(i)>=32&&sifre.charAt(i)<=64)){
                    System.out.println("sifre özel karakter içermelidir!");
                    sayac++;
                }
                if (sifre.length()<8){
                    System.out.println("sifre en az 8 karekter olmalıdır ");
                }
                break;
            }
            if (sayac==0){
                System.out.println("şifreniz basarılı");
            }




        }while (sayac!=0);
    }

}
