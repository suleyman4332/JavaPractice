package day36_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_CokluException {
    public static void main(String[] args) {


        String str = "Java her gecen gün guzelleşiyor";
        int[] arr = {3, 4, 6, 3, 6, 7, 4, 2, 5, 7};
        //kullanıcıdan bir tam sayi isteyin girilen değeri index olarak kullanıp
        //str ve arr nin o index indeki elemanları yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("index olarak kullanmak için 0 veya pozitif bir tam sayi girin");

        try {
            int index=scan.nextInt();
            System.out.println(str.charAt(index));
            System.out.println(arr[index]);
        } catch (RuntimeException e) {
            System.out.println("giriş hatalı olabilir index veya String  veya array ın dısında olabilir");
            e.printStackTrace();
            //biz mesaj yazacaksak genel bir mesaj yazabiliriz
            //veya javanın hata kodlarını yazabiliriz

        }


        try {
            int index=scan.nextInt();
            System.out.println(str.charAt(index));
            System.out.println(arr[index]);
        } catch (InputMismatchException e) {
            System.out.println( "tamsayi girmelisin");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("girilen index String sınırları dısında");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("girilen index array sinirlari disinda");
        }

        /*
        birbirinden bagımsız
        3 farklı türde exception riski var
        bunları farklı sekillerde handle edebiliriz
        1-herbirini ayrı ayrı try -catch yapariz
        2-tek bir try ,birden fazla catch yapabilirsiniz
        3-tek bir try catch yapip tüm exceptionları yakalayacak bir exception turu yazılabilir
         */



        }




      }
