package day31_inheritance;

public class DCorolla extends CToyota {

    String str3="Corolla";


    DCorolla (){


        System.out.println(" parametresiz Corolola constructor calisti");
    }
    DCorolla (int sayi){
        this();
        System.out.println("int parametreli constructor calisti");
    }

    public static void main(String[] args) {
        DCorolla obj1=new DCorolla(5);
    }
}

/*
Biz görünür bir constructor oulşturduğumuzda
Java'nın default constructoru silmesine benzer olarak
extends keyword kullanılmış bir classtaki
herhangi bir constructorun ilk satırında
gözle görünür bir constructor call yazılmışsa java
default olarak koyduğu super() constructor call'u siler

 Bir constructorun içinde sadece bir tane constructor call olabilir.
 oda ilk satırda olmak zorundadır
  eger this(parametre)veya super (parametreler )
  constructor yaptıgımızda yazdıgımız argument ile uyumlu parametreye sahip

 */