package day13_methodolusturma;

import java.util.Scanner;

public class C06_MethodKullanma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("metin gir");
        String metin=sc.nextLine();
        String tersmetin=C05_StringiTerseCevirme.stringTersineCevir(metin);
        if (metin.equals(tersmetin)){
            System.out.println("girilen metin PALİNDROME");
        }else System.out.println("Girilen metin PALİNDROME değil");
    }
}
