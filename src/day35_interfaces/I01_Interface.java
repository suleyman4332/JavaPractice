package day35_interfaces;

public interface I01_Interface {

   int sayi=10;
   final String str="Java Candir";
   public static final boolean b=true;

  //interface de tüm variableler (yazılmasa bile )public static ve final dir
    //final oldugu için sonradan değiştirme imkanı yoktur ,oluştururken değer atanmalıdır
    //bu özellikler standart olarak tüm variablelere tanımlandıgından
    //bu tanımlamaları yapmak gerekli değildir (intelij gri yaptı)

    void toplama();
    public void cikarma();
    abstract String ekleme();
    public abstract int faktoryel();


    //tüm methodlar da standart olartak public ve abstract dir (yazılmasa bile )


    }



