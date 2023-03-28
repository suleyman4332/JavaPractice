package Java_practice02;

public class Practice03 {
    public static void main(String[] args) {
       /*
3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
değiştirin (Swap)
 */
    int a=10;
    int b=20;
    int top=a=a+b;
    int top1=b=a-b;
    int top2=a=a-b;
        System.out.println("a="+top2+"b="+top1);
    }
}
