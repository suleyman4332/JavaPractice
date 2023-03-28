package day36_exceptions;

public class C03_TryCatch {
    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=0;


        try {
            System.out.println(sayi1/sayi2);

            System.out.println("deneme1");
            System.out.println("deneme2");
            System.out.println("deneme3");

        } catch (ArithmeticException e) {
            System.out.println("bolen sıfır olmamalı");

        }
        /*
        bir try blogunda exception olusursa
        o satırdan catch satırına kadar aradaki tüm kodlar IGNORE EDİLİR

        eger try blogunda exception olusmazsa
        catch devreye girmez
        (if else gibi)
         */
    }
}
