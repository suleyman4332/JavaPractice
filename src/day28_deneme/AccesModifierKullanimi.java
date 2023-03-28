package day28_deneme;

import day28_accessModifier_encapsulation.C03_EncapsuleDatalar;

public class AccesModifierKullanimi {
    public static void main(String[] args) {


        C03_EncapsuleDatalar obj = new C03_EncapsuleDatalar();
        System.out.println(obj=new C03_EncapsuleDatalar());

        /*
        baska bir class daki variable veya method a ulasmak istediğimizde
        ulaşmak istediğimiz class uyesının static olup olmaması
        erisim yontemini etkiler
        static ise class Imi.uyeIsmi yazarken
        static değilse obje oluşturup objeIsmi.uyeIsmi

        ulasmak istediğimiz üyenin access modifier i ise
        o uyeye ulasıp ulasamayacagımızı belirler
        ulasabilirsek o datayı okuyabilir veya o dataya yeni değer atayabilirz
         */


    }
}