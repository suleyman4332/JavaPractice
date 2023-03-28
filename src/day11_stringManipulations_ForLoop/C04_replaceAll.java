package day11_stringManipulations_ForLoop;

public class C04_replaceAll {
    public static void main(String[] args) {
        /* (Regular Expressions)
   \\s bosluk (
   \\S bosluk disindaki tum karakterler
   \\w harfler ve rakamlar (a z A Z, 0 9)
   \\W harfler ve rakamlar disindaki tum karakterler
   \\d rakamlar 0 9
   \\D rakamlar disindaki tum karakterler,

*/
        String str="J1a23va34 5C54and65ir87";
        str.replaceAll("\\d","");
        System.out.println(str.replaceAll("\\w",""));
        String input1="15.30€";
        String input2="11.40€";
        input1=input1.replaceAll("\\D","");
        input2=input2.replaceAll("\\D","");
        double inp1=Integer.parseInt(input1);
        double inp2=Integer.parseInt(input2);
        System.out.println("toplam"+(inp1+inp2)/100+"€");

    }
}
