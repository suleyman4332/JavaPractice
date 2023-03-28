package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Kubra");
        isimler.add("Mustafa");
        isimler.add("Emre");
        isimler.add("Ferhat");
        isimler.add("Erdal");
        System.out.println(isimler);
        System.out.println(isimler.get(2));
        System.out.println(isimler.indexOf("Ferhat"));//element isteniyorsa index veririz indexteki isteniyorsa index of
        System.out.println(isimler.lastIndexOf("Ferhat"));
        System.out.println(isimler.indexOf("Hilal"));
        System.out.println(isimler.lastIndexOf("Gökhan"));
        isimler.add("Mustafa");
        System.out.println(isimler);
        System.out.println(isimler.indexOf("Mustafa"));
        System.out.println(isimler.lastIndexOf("Mustafa"));

    }
}
