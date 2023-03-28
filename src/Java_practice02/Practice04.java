package Java_practice02;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        /*Soru 1- 1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        yazdirin.*/

       /* for (int i = 1; i <=100 ; i++) {
            System.out.print(i+" ");

            System.out.println();*/
            /*Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin.*/
          /*  int sayi=60;
            for (int j = 1; j <=sayi; j++) {
                if(j%7==0){
                    System.out.print(j+" ");
                }

            }*/
        /*Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin*/
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("iki adet sayı giriniz");
        int sayi1=sc.nextInt();
        int sayi2=sc.nextInt();
        int top=0;
       for (int i = sayi1; i <=sayi2 ; i++) {
            top+=i;
           System.out.println("top");

            }

        System.out.println("uyarı");*/
       /* Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucuk olsa da program calissin*/
        Scanner sc=new Scanner(System.in);
        System.out.println("iki adet tam sayı giriniz");
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();
        int top=0;
        for (int i = sayi1 ; i <=sayi2 ; i++) {
            top+=i;
            System.out.println(top+i);


        }
        System.out.println(" ");


        }

        }


