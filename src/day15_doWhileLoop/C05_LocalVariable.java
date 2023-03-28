package day15_doWhileLoop;

public class C05_LocalVariable {
    public static void main(String[] args) {
        /*1-bir method içerisinde oluşturulan variable nin scope u o method dur
        baska bir mthod dan kullanılamaz!!!
        bu variable lara local variable denir
        2-her ne kadar bir method içinde olsalar da
        loop ların da ayrı bir scope u vardır
        loop içerisinde oluşturulan variableler loop dısında kullanılamazlar!!
        */
        String isi="Ali Can";
    }
    public static void baskaMetod(){
       // System.out.println();
        int sayi=5;

    }
}
