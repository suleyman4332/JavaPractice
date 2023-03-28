package week05;

import java.util.Scanner;

public class atmProje {
    static String kartNo = "123456";
    static String sifre = "1234";
  static   Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        giris();

    }

        private static void giris () {
            System.out.println("kart numarasını giriniz");
            String KkartNo = scan.nextLine().replace(" ","");
            System.out.println("sifre giriniz");
            String ksifre=scan.next();
            if (ksifre.equals(sifre)&&kartNo.equals(kartNo)){
                menu();

            }else {
                System.out.println("kullanıcı adi veya sifre yanlıs girildi");
                giris();
            }

    }
    private static void menu(){
        System.out.println("yapmak istediğiniz işlemi seçiniz :\n" +
                "1.BAKİYE SORGULAMA \n" +
                "2.PARA YATIRMA \n" +
                "3.PARA ÇEKME \n" +
                "4.PARA GÖNDERME \n" +
                "5.ŞİFRE DEĞİŞTİRME\n"+
                "6.ÇIKIŞ\n" +
                " SEÇİMİNİZ: ");
        int secim=scan.nextInt();
        switch (secim){

        }

    }

    }
