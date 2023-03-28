package day29_inheritance;

public class C05_Child extends C03_ParentClass {
    int c=20;
    int a;
    String s="Child clas";
    String m;
    public void method1() {
        System.out.println("child class çalıştı");
    }

    public static void main(String[] args) {
        //child class dan bir obje oluşturalaım ve özelliklerini yazdıralım
        C05_Child obj=new C05_Child();
        System.out.println(obj.a);//0
        System.out.println(obj.c);//20
        System.out.println(obj.b);//0
        System.out.println(obj.m);//nul
        System.out.println(obj.s);//child class
        System.out.println(obj.t);//null
        obj.method1();//chaild class method 1
        obj.method2();//parent method 2 çalıstı



    }

}
