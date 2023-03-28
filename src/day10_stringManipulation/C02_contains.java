package day10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str="java ogren isi kap";
        System.out.println(str.contains("java"));
        String s="ka";
        System.out.println(str.contains(s));
        System.out.println(str.contains("a"));
        System.out.println(str.contains(""));
    }
}
