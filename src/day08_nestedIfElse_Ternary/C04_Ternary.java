package day08_nestedIfElse_Ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir tam sayı alın
        //sayı çift ise "sayı çift"
        //değilse "tek sayı " yazdırın
        Scanner sc=new Scanner(System.in);
        System.out.println("tam sayı giriniz");
        int sayi=sc.nextInt();
        System.out.println(sayi%2==0?"çiftsayı": "sayi tek");
    }
}
