package day31_inheritance;

public class EPersonel {

    String isim="personel isim belirtilmemiş";
    String unvan="personel unvan belirtilmemiş";
    boolean izindeMi;

    public void standartMaas(){
        System.out.println("Personel asgari ücret"  + 8500);

    }
    public void ozelSigorta(){
        System.out.println("Personelden katkı payı alınarak özel sigorta yapılır");
    }
}
