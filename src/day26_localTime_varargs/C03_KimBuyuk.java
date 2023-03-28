package day26_localTime_varargs;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBuyuk {
    public static void main(String[] args) {
    //kullanıcıdan 2 farklı kişinin isim ve doğum tarihinin gün ay ve yılını alıp
    //hangi tarihte doğan kişinin daha büyük oldugunu yazdırın
    Scanner scan=new Scanner(System.in);
        System.out.println("1.isim gir");
        String isim=scan.nextLine();
        System.out.println("2.isim gir");
        String isim2=scan.nextLine();
        System.out.println("ilk kişinin doğum tarihini gün ay yıl olarak gir");
        int gun=scan.nextInt();
        int ay=scan.nextInt();
        int yil=scan.nextInt();
        LocalDate tarih1=LocalDate.of(yil,ay,gun);
        System.out.println("ikinci kişinin doğum tarihini gün ay yıl olarak gir");
         gun=scan.nextInt();
         ay=scan.nextInt();
         yil=scan.nextInt();
         LocalDate tarih2=LocalDate.of(yil,ay,gun);
        System.out.println(tarih2.isAfter(tarih1)?
                "Büyükolan"+isim:
                "Büyükolan"+isim2);



}
}