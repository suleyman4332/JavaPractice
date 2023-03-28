package day17_arrays;

public class C02_ArraydeistenenElemaniBulma {
    public static void main(String[] args) {
        int[] arr1={2,4,5,2,6,4,7,3,5};
        elemansayisiYazdir(arr1,3);
        elemansayisiYazdir(arr1,2);
        elemansayisiYazdir(arr1,5);
        String[] arr2={"E","H","M","H","H","E"};
        elemansayisiYazdir(arr2,"E");
        elemansayisiYazdir(arr2,"M");



    }
public static void elemansayisiYazdir(int[]arr,int arananSayi){
        int sayac=0;
    for (int i = 0; i <arr.length ; i++) {
        if (arr[i]==arananSayi){
            sayac++;
        }
    }
    System.out.println(sayac);
}

    public static void elemansayisiYazdir(String[]arr,String arananElement){
        int sayac=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals(arananElement)){
                sayac++;
            }
        }
        System.out.println(sayac);
    }}
