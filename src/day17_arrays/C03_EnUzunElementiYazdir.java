package day17_arrays;

public class C03_EnUzunElementiYazdir {
    public static void main(String[] args) {
        String[] arr1 = {"Melike", "Burkay", "inci", "Emre","Ali"};
        enUzunEnkisaYazdir(arr1);
        String[] arr2 = {"Melike", "Burkay", "inci", "Emre","Hüseyin","Su"};
        enUzunEnkisaYazdir(arr2);


    }

    public static void enUzunEnkisaYazdir(String[] arr) {
        String enUzunKelime = arr[0];
        String enKisaKelime = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= enUzunKelime.length()) {
                enUzunKelime = arr[i];
            }
            if (arr[i].length() <= enKisaKelime.length()) {
                enKisaKelime = arr[i];
            }

        }
        System.out.println("arraydaki en uzun  kelime :"+enUzunKelime);
        System.out.println("arraydaki en kısa kelime :"+enKisaKelime);
    }
}