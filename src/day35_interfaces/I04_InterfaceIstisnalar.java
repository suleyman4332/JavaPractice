package day35_interfaces;

public interface I04_InterfaceIstisnalar {

    void toplama();
   static void aciklama(){
       System.out.println("bu method u implement etmek mecburi değildir");
   }

    default void ekisler (){
        System.out.println("Default keyword ile body si olan method oluşturulabilir");
    }
}
