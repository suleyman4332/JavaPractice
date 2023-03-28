package day31_inheritance;

public class CToyota extends BAraba {

    protected String str2="Toyota";

   protected CToyota(){
       this("Java");
        System.out.println("parametresiz  toyota constructor calisti");
    }
    protected CToyota (int sayi){
        System.out.println("int parametreli constructor calisti");
    }
    protected CToyota (String s){
        System.out.println("Araba 2 int parametreli constructor calisti");
    }
}
