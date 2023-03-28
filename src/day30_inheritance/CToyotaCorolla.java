package day30_inheritance;

public class CToyotaCorolla extends BToyota {
String lastik="Lassa 205-55-15";
String model="Corolla";
String yakit="Corolla dizel benzinli ve elektirkli olabilir ";
public void motor(){
    System.out.println("Corola araclar türküyede üretilen motor kullanır");
}
public void uretimYeri(){
    System.out.println("Corolla araclar türkiyede üretilir");
}

    public static void main(String[] args) {
    CToyotaCorolla corolla=new CToyotaCorolla();
        System.out.println(corolla.lastik);//205-55-15
        System.out.println(corolla.model);
        System.out.println(corolla.yakit);
        corolla.motor();
        corolla.uretimYeri();
        System.out.println(corolla.marka);
        System.out.println(corolla.vites);


    }
}
