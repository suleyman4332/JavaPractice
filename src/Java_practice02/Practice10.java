package Java_practice02;

import java.util.Arrays;

public class Practice10 {
    public static void main(String[] args) {
int[] arr={3,4,5,6};
arr=arrElementleriniartir(arr,2);
        System.out.println(Arrays.toString(arr));

}
public static int[] arrElementleriniartir(int[]ilkAr,int artis){
    for (int i = 0; i <ilkAr.length ; i++) {
        ilkAr[i]+=artis;
    }
return ilkAr;
}
}
