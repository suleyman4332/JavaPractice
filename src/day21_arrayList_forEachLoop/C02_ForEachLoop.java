package day21_arrayList_forEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {
        /*
        bizden istenen görevde sıralama önemsiz ise
        asıl amaçlanan tüm elementleri elden geçirmek ise
        for loop yerine for each loop tercih edilir
        for each loop da
        -index yok
        -baslangıç değeri yok
        -bitiş değeri yok


         */
        Integer[] arr = {3,5,6,7,3,2,3,5,8,7,1,2,3,4,5,8};
        //array ın tüm elementlerinin toplamını yazdırın
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;


        }
        System.out.println("elemetler toplamı  "+toplam);
        //array ın elementlerinden 3 ile bölünebnilenleri yazdırın
        for (int each:arr
             ) {
            if(each%3==0) System.out.print(each+ " " );
        }
        System.out.println("");
        // arr ın elementleri içinde kaç tane tek sayi olduğunu bulun
        int sayac=0;
        for (int each:arr
             ) {
            if (each%2!=0)sayac++;
        }

        System.out.println("Array deki tek sayi adedi :" +sayac);


    }
}
