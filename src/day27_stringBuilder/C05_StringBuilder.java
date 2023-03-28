package day27_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java Candir");
        System.out.println(sb1.delete(1, 4));
        System.out.println(sb1.deleteCharAt(6));
        System.out.println(sb1);
        System.out.println(sb1.insert(6,"r"));
        System.out.println(sb1);
        sb1.insert(4," ");
        System.out.println(sb1);
    }
}
