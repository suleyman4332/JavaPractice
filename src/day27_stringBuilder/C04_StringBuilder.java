package day27_stringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java Candir");
        StringBuilder sb2=new StringBuilder("Java Candir");
        sb1.substring(5);
        System.out.println(sb1);//Java candir

        System.out.println(sb1.compareTo(sb2));
        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString()));
        sb1.subSequence(3,6);
        System.out.println(sb1);


    }
}
