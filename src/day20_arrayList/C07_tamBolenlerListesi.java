package day20_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_tamBolenlerListesi {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan main method da  pozitif bir tamsayi alip, o tamsayiyi tam bolebilen
        // tum pozitif tamsayilari bir liste olarak bize donduren bir method olusturun
        Scanner scan=new Scanner(System.in);
        System.out.println("Pozitif bölenlerini bulunacak pozitir bir tam sayi giriniz");
        int girilensayi=scan.nextInt();
        System.out.println(pozitifBolenleriListele(girilensayi));





    }
    public static List<Integer> pozitifBolenleriListele(int verilenSayi){
        List<Integer>pozitifBolenler=new ArrayList<>();
        for (int i = 0; i <=verilenSayi ; i++) {
            if(verilenSayi%i==0){
                pozitifBolenler.add(i);
            }
        }
        return pozitifBolenler;

    }
}
