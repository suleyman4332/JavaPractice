package Java_practice02;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("üçgenin kenar uzunluğunu girin");
        double uz=scan.nextDouble();
        System.out.println("üçgenin yüksekliğini girin");
        double yuk=scan.nextDouble();
        double top=uz*yuk/2;
        System.out.println(top);
    }
}
