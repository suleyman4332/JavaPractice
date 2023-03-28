package Java_practice02;

import java.util.Scanner;

public class Artikyil {
    public static void main(String[] args) {
       /*Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kontrol etmek istediğiniz yılı giriniz  ");
        int yil= scan.nextInt();
        if(yil%100==0 && (yil%400!=0 || yil%4==0)){
            System.out.println(" Girdiğiniz yıl artık yıldır");

        }else{
            System.out.println("Girdiğiniz yıl artıl yıl değildir");
            /*
3-Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak "Emekli
olabilirsin" veya "Emekli olmak icin .. Yil daha calisman gerekir" yazdirin.
 */
           Scanner scan =new Scanner(System.in);
        System.out.println("lütfen önce yaşınızı sonra cinsiyetinizi E yada K şeklinde giriniz");
        int yas=scan.nextInt();
        char cinsiyet=scan.next().charAt(0);
        if (cinsiyet=='K' || cinsiyet=='k'&&yas>=60) {
            System.out.println("emekli olabilirsiniz");



        } if (cinsiyet=='E'|| cinsiyet=='e'&& yas==65) {
            System.out.println("emekli olabilirsin " );
            /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
             KURALLAR
             : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
             : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
            

        }

    }
}
