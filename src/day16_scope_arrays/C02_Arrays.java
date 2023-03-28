package day16_scope_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String[] isimler={"nur","berke","mustafa"};
        int [] sayilar ={3,4,5,6,7,8,4,4,3,};
        char karakterler[]={'e','4',','};
        //array non -primitive data türlerindendir
        //eger array i liste şeklinde oluşturmayıp
        //new keyword kullanıyorsak
        //UZUNLUĞUNU yazmak ZORUNDAYIZ
        String [] arr =new String[5];
        //bir array tanımlanan uzunluktan daha fazla veya az eleman olamaz
        System.out.println(Arrays.toString(isimler));
        System.out.println(Arrays.toString(arr));
        //array deki elementlere index le ulaşırız
        int [] a =new int [7];
        a[0]=4;
        a[3]=7;
        a[5]=1;

        System.out.println(Arrays.toString(a));
        //sayılar array ının 4. indexindeki elementi yazdırın
        System.out.println(sayilar[4]);
        System.out.println(isimler[1]);


    }
}
