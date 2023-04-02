package week07;

import java.util.Scanner;

public class tekrar1 {
    public static void main(String[] args) {
        /*
        String deneme="süleyman ünal23.-";
        System.out.println(deneme.replace('s', 'S'));
        System.out.println(deneme);
        System.out.println(deneme.replaceAll("\\D", "**"));

        System.out.println(deneme.replaceAll("\\s", ""));
        System.out.println(deneme.replaceAll("\\S", "*"));
        System.out.println(deneme.replaceAll("\\W", "=="));*/

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String cumle = scan.nextLine();
        if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        } else if (cumle.contains("de")) {
            System.out.println("hem ev lazım hem iş");

        } else if (cumle.contains("is")) {
            System.out.println("calısmak güzeldir");
        } else {
            System.out.println("cok calısmam lazım");


        }
        String sayi="15$";
        String sayi2="25$";
        sayi=sayi.replaceAll("\\W","");
        sayi2=sayi2.replaceAll("\\W","");
        int num=Integer.parseInt(sayi);
        int num1=Integer.parseInt(sayi2);
        int toplam=num+num1;
        System.out.println(toplam);*/

        //=========================================================================
        /*Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
input : java1 ogRe2@nMek3 #ne +Gu=zel
output : Java ogrenmek ne guzel. */
        String input=" java1 ogRe2@nMek3 #ne +Gu=zel";
        input=input.replaceAll("\\W","");
        input=input.replaceAll("\\d","");
        System.out.println(input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase());


   



    }
}
