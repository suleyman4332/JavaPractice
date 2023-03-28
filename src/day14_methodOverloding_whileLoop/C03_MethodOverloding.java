package day14_methodOverloding_whileLoop;

public class C03_MethodOverloding {
    public static void main(String[] args) {
        /*bir clasta aynı isme sahip farklı işlem yapan methodlar olur
        java bu metodlardan hangisinin çalısacaguına parametreye göre karar verir
        bir class da ismi aynı parametreleri farklı methodlar olmasına OVERLOADING denir*/

        String str="Bu is olacak";

        System.out.println(str.replace("Bu is", "Java guzel"));

        System.out.println(str.replace('u', 'e'));


    }
}
