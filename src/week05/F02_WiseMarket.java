package week05;

import java.util.Scanner;

public class F02_WiseMarket {
    static Scanner scan=new Scanner(System.in);
    static String urunAdi;
    static String sepet="";
    static int urunKodu;
    static int urunFiyati;
    static int urunAdedi;
    static int toplam;
    static boolean ekUrun=false;

    /*
            ====================PROJEMIZ===================================
            * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
   1 ŞARKÜTERİ ÜRÜNLERİ
   2 MANAV ÜRÜNLERİ
   3 MARKET
    secime gore ,
   4-urunleri listele ve
   5-fiyatlari gelsin*/

    public static void main(String[] args) {

        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("=======WİSE MARKET E HOŞ GELDİNİZ=========");
        System.out.println("---------M E N U----------------------");
        System.out.println("lütgen alışveriş yapmak istediğiniz reyonu seçiniz");
        System.out.println("1-Manav Reyonu \n -Şarküteri Reyonu \n -Market reyonu \n -Fiş Yazdir \n-Çıkış ");
        int secim=scan.nextInt();
        if (!(secim>=1&&secim<=5)){
            System.out.println("geçerli değer giriniz");
            girisEkrani();

        }else {
            switch (secim){
                case 1:
                    manav();
                    break;
                case 2:
                sarkuteri();
                break;
                case 3:
                   // market();
                    break;
                case 4:
                    //fisYazdir();
                    break;
                case 5:
                  //  cikis();
                    break;
                default:
                     }

        }

    }
    private static void sarkuteri(){
        System.out.println("ürün kodunu seciniz \n6kasar 130\n7zeytin 50\n8pastırma 450\n9kıyma 140");
        while (!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=6&&urunKodu<=9){
                System.out.println("kaç kg alacaksınız");
                urunAdedi=scan.nextInt();
                switch (urunKodu){
                    case 6:
                        urunAdi="kasar peyniri";
                        urunFiyati=130;
                        System.out.println(urunAdedi+"kg"+urunAdi+" :"+(urunFiyati*urunAdedi)+"tl dir");
                        break;

                    case 7:
                        urunAdi="zeytin";
                        urunFiyati=50;
                        System.out.println(urunAdedi+"kg"+urunAdi+" :"+(urunFiyati*urunAdedi)+"tl dir");
                        break;
                    case 8:
                        urunAdi="pastırma";
                        urunFiyati=450;
                        System.out.println(urunAdedi+"kg"+urunAdi+" :"+(urunFiyati*urunAdedi)+"tl dir");
                        break;
                    case 9:
                        urunAdi="kıyma";
                        urunFiyati=140;
                        System.out.println(urunAdedi+"kg"+urunAdi+" :"+(urunFiyati*urunAdedi)+"tl dir");
                        break;
                }
                urunFiyati=urunAdedi*urunFiyati;
                toplam+=urunFiyati;
                System.out.println("toplam fiyat"+toplam);
                sepet=urunAdi+":"+urunFiyati+"tl dir";
                System.out.println("ek ürün almak istiyorsanız ürün kodunu giriniz istemiyorsanız 0 a basınız");

            }else if (urunKodu==0){
                girisEkrani();
            }
        }
    }
public static void manav(){
    System.out.println("lütfen alacagınız ürün kodu giriniz: \n1-Patates 12$ \n2-Soğan 12$ \n3-Elma 15$\n 4-Portakal\n5-Ananas-30$ ");
    while (!ekUrun){
        urunKodu= scan.nextInt();
        if (urunKodu>=1&& urunKodu<=5){
            System.out.println("kaç kg alacaksınıız?");
            urunAdedi=scan.nextInt();
            switch (urunKodu){
                case 1:
                    urunAdi="Patates";
                    urunFiyati=12;
                    System.out.println(urunAdedi+"kg"+urunAdi+"fiyatı"+urunFiyati*urunAdedi+"tl dir");
                    break;
                case 2:
                    urunAdi="Soğan";
                    urunFiyati=12;
                    System.out.println(urunAdedi+"kg"+urunAdi+"fiyatı"+urunFiyati*urunAdedi+"tl dir");
                    break;
                case 3:
                    urunAdi="Elma";
                    urunFiyati=15;
                    System.out.println(urunAdedi+"kg"+urunAdi+"fiyatı"+urunFiyati*urunAdedi+"tl dir");
                case 4:
                    urunAdi="Portakal";
                    urunFiyati=20;
                    System.out.println(urunAdedi+"kg"+urunAdi+"fiyatı"+urunFiyati*urunAdedi+"tl dir");
                    break;
                case 5:
                    urunAdi="Ananas";
                    urunFiyati=30;
                    System.out.println(urunAdedi+"kg"+urunAdi+"fiyatı"+urunFiyati*urunAdedi+"tl dir");
                    break;

            }
            urunFiyati=urunFiyati*urunAdedi;
            toplam+=urunFiyati;
            System.out.println("oluşan sepet miktari: "+toplam);
            sepet+=urunAdi+" :"+urunFiyati+"tl dir";
            System.out.println("baska ürün almak istermisiniz ?");

        } else if (urunKodu==0) {
            girisEkrani();
        }
    }
}
}


