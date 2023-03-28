package day29_inheritance;

public class C04_Child extends C03_ParentClass {
    int c=20;
    int a;
    String s="Child clas";
    String m;
    public void method1() {
        System.out.println("child class çalıştı");
    }

    public static void main(String[] args) {
        C03_ParentClass obj3=new C03_ParentClass();
        obj3.a=20;
        obj3.b=22;
        obj3.s="p";
        obj3.t="k";
        obj3.method1();
        obj3.method2();



        C04_Child obj4=new C04_Child();
        obj4.a=50;
        obj4.c=20;
        obj4.s="u";
        obj4.m="l";
        obj4.method1();

        //C04 class ını c03 e child yapınca
        //child class da olamayıp parent class da olan
        //b.t ve method 2  özellik olarak obje C04 e eklendi
        obj4.b=8;
        obj4.t="y";
        obj4.method2();//



        /*
        javada parent class lar child edilmez
        child clas lar parent edilir
        bir class ın baska bir class taki TÜM ÖZELLİKLERİ
        otomatık olarak edinmesini istiyorsak
        class ımızı extends keyword ile  o class a child yaparız
        (sizi parent yaptım deriz)
         */




    }
}
