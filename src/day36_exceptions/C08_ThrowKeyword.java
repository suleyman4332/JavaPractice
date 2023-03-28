package day36_exceptions;

import java.util.Scanner;

public class C08_ThrowKeyword {
    public static void main(String[] args) {
        /*
        kodları yazarken bazen muhtemel bir durumda
        bazı kodların ignore edilmesi istenebilir

        bu durumda kodları IGNORE  etme yöntemi olarak
        isteyrek exception firlatip
        sonra da calismasını istediğmiz yerde catch ile yakalayıp yolumuza devam edebiliriz
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("yasınızı giriniz");
        int yas =scan.nextInt();
        if (yas<0){
            System.out.println("yas negatif olamaz ");
        }

    }
}
