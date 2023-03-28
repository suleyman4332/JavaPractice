package day32_inheritance_dataTypeKullanimi;

public class EChild extends DParent{
    String str="Child";

    void method1(){
        System.out.println("Child method 1");




    }

    public static void main(String[] args) {
        EChild childC=new EChild();
        childC.method1();
        System.out.println(childC.str);


        DParent childP=new EChild();
        System.out.println(childP.str);


    }

}
