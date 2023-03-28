package day24_staticKeyword;

public class C01_staticBlocks {
    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println("====");
        C01_staticBlocks obj1=new C01_staticBlocks();
    }
    static {
        /* static block lar class ilk çalışmaya başlandıgında calısır
        genel olarak class için gerekli on ayarlamaları yapmak için kullanılır
        birfen fazla static bloks varsa
        yularıdan asagı doğru sıralı olarak calısır
        */

        System.out.println("Static block calisti");
    }
    static {
        System.out.println("alttaki static block calisti");
    }
    {
        /*static olmayan block lar ise obje oluşturulurken
        constructor dan önce çalısır
        obje için yapılması gereken on ayarlamaları yapmak için kullanılır
         */

        System.out.println("static olmayan block calisti");
    }
}
