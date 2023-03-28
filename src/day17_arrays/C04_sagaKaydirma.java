package day17_arrays;

import java.util.Arrays;

public class C04_sagaKaydirma {
    public static void main(String[] args) {
        int [] arr={3,4,5,6};
        int temp=arr[arr.length-1];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[arr.length-1-i]=arr[arr.length-2-i];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
