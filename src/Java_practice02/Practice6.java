package Java_practice02;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
         /*
        1- Kullanıcnın EYT li olup olmadığını tespit eden ve emekli olup olamayacağını yazdırın.
           Olamıyorsa kaç prim günü eksiği olduğunu yazdırın
           KURALLAR
             : 1999 yılı 9. ay öncesi işe başlamış olmak
             : Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
             : Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("hizmete baslama yılı giriniz");
        int baslama=sc.nextInt();
        if (baslama>1999){
            System.out.println("kapsam dısındasınız");
        }else{ System.out.println("cinsiyet giriniz E yada K olarak");
            char cinsiyet=sc.next().charAt(0);
            System.out.println("prim gün giriniz");
            int primGun=sc.nextInt();
            System.out.println("çalışma yılı giriniz");
            int yil= sc.nextInt();
            if (cinsiyet== 'E'|| cinsiyet=='e'){
                if (primGun>=5500 && yil >=25){
                    System.out.println("emekli olabilirsin");

                } else if (primGun<5500&& yil<25) {
                    System.out.println("emekli olmak için"+(5500-primGun)+"gün çalışmalısın");


                }

            }
            }


    }

}
