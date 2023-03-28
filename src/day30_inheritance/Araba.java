package day30_inheritance;

public class Araba {
    //marka gözetmeksizin tüm arabaların sahip olacagı özellikleri bu class a koyarız

    String marka="Tum arabaların markası olur";
    String model="Tum arabaların modeli olur";
    String vites="Tüm arabaların vitesi olur";
    String yakit="Tum arabalar yakıtla calısır;";
    public void uretimYeri(){
        System.out.println("tüm arabalar fabrikada üretilir");


    }
    public void motor(){
        System.out.println("tüm artalarn motor olur");
    }


}
