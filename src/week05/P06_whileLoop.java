package week05;

public class P06_whileLoop {
    public static void main(String[] args) {
        /*While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
yazdirin.*/
        //while loop da kaç kere çalışacagı belli değilse yada bir loop a bağlıysa
        int sayi=10;
        String sayilar="";
        while (sayi<100){
            if(sayi%7==0){
                sayilar+=sayi+",";

            }
            sayi++;
        }
        System.out.println(sayilar.substring(0,sayilar.length()-1));

    }

}
