package Java_practice02;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("adınız");
        String name=scan.nextLine();
        System.out.println("soyadınız " );
        String sname=scan.nextLine();
        System.out.println("yasınız");
        int yas=scan.nextInt();
        System.out.println("mail adresi");
        String mail=scan.next();
        System.out.println("şifre");
        int sifre=scan.nextInt();
        System.out.println("adınız :"+name+"\n"+"soyadınız:"+sname+"\n"+"yasınız:"+yas+"\n"+"mailiniz:"+
                mail+"\n"+"şifre"+sifre+"\n");


    }
}
