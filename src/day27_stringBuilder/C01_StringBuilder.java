package day27_stringBuilder;

public class C01_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.append("Mustafa");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.append("YılmazTürk");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
        sb1.append("java yı çok sever sabah aksam java çalısır");
        System.out.println(sb1.capacity());
        System.out.println(sb1.length());
     //  2.yöntem
        StringBuilder sb2=new StringBuilder("java candır");
        System.out.println(sb2.capacity());
        System.out.println(sb2.length());
        //3. yöntem
        StringBuilder sb3=new StringBuilder(11);
        sb3.append("5554422336");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());

        sb3.append(":t c no");
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
        String str="Java Candır";
        sb3.append(str,4,str.length());
        System.out.println(sb3);
        //trim=
        sb3.trimToSize();
        System.out.println(sb3.capacity());
        System.out.println(sb3.length());
    }
}
