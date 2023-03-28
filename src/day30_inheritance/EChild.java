package day30_inheritance;

public class EChild extends DParentAccessModifier{
        static int sayiChildStatic;
     public static void main(String[] args) {


         //inheritance de private class üyeleri inherit edilemez
         //

    EChild eChild=new EChild();
         System.out.println(eChild.sayiDefault);
         System.out.println(eChild.sayiProtected);
         System.out.println(eChild.sayiPublic);

         //içinde bulundugumuz class daki static variableler
         //obje üzerinden otomatik gelmez ama manuel yazdıgımızda java kabullenir
         System.out.println(sayiChildStatic);
        //ancak patent class daki static variableler
         //obje üzerinden kullanılamaz
        // System.out.println(eChild.sayiStaticPrivate);

         System.out.println(DParentAccessModifier.sayiStaticProtected);
         //bu kullanım için inheritanc a ihtiyac yok
         //herhangi bir class daki static variable yi
         //classısmı.staticVariableIsmi şeklinde kullanabiliriz


     }
}
