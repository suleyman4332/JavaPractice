package day32_inheritance_dataTypeKullanimi;

public class CAvciKuslar extends BKuslar {
    String a="Child A";
    String b="Child B";
    String f="Child F";
    public static void main(String[] args) {

        CAvciKuslar child1=new CAvciKuslar();
        System.out.println(child1.a);
        System.out.println(child1.b);
        System.out.println(child1.f);

        System.out.println(child1.c);
        System.out.println(child1.d);
        System.out.println(child1.e);
        System.out.println(child1.g);

                  BKuslar child2 =new CAvciKuslar();
        System.out.println(child2.a);
        System.out.println(child2.b);
        System.out.println(child2.c);
        System.out.println(child2.d);
        System.out.println(child2.e);




    }
}
