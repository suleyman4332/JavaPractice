package day38_exceptions_garbageCollector;

public class C01ThrowKeyword {
    public static void main(String[] args) {
        //sayi 0 dan küçükse sartlı satırlar calısmasın
        try {
            int sayi=10;
            if (sayi<0){
                throw  new IllegalArgumentException("sayi negatif olmamalı");
            }

            System.out.println("sartlı olacak satır 1");
            System.out.println("sartlı olacak satır 2");
            System.out.println("sartlı olacak satır 3");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();

        }

        System.out.println("yola devam");

    }
}
