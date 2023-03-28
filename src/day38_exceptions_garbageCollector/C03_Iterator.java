package day38_exceptions_garbageCollector;

import java.util.Arrays;

public class C03_Iterator {
    public static void main(String[] args) {
        int []arr ={3,8,1,9,15};
        //tüm elementleri yazdırın
        for (int each:arr
             ) {
            System.out.print(each+"  ");
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]+" ");

        }
        //index kullanmadan tüm elementleri 3 artırıp kaydedin
        //index istenmediği için normal loop kullanamayız
        // for -each ile deneyelim

        for (int each:arr
             ) {
            each=each+3;
            System.out.print(each  +" ");
        }
        System.out.println(" ");
        System.out.print(Arrays.toString(arr));

    }
}
