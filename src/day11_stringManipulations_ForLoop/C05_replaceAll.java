package day11_stringManipulations_ForLoop;

public class C05_replaceAll {
    public static void main(String[] args) {


        String str = "J&ava54 C+an01dır";
        System.out.println(str.replaceAll("\\d", ""));
        System.out.println(str.replaceAll("\\W", ""));
    }
}