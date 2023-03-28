package day24_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {
        double fiyat=200;

        /*
        int fiyat=500;
        java aynı method içerisinde aynı isimde birden fazla variable
        oluşturulmasına izin vermez
         */

        indirimYap10(fiyat);
        System.out.println("method call dan sonra fiyat :"+fiyat);
        indirimYap25(fiyat);
        System.out.println("25 den sonta:"+fiyat);
        indirimliFiyatGetir10(fiyat);
        System.out.println("Return yapılan method dan dönen fiyat:"+fiyat);

        //main method daki fiyatı kalıcı olarak değiştirmek istersek
        //main method içerisinde atama yapmalıyız
        fiyat=indirimliFiyatGetir10(fiyat);
        System.out.println("atama yapıldıktan sonra" +fiyat);


    }
    public static void indirimYap10(double fiyat){//double fiyat=değeri çağrıldığı yerden gelir
        fiyat=fiyat*0.9;
        System.out.println("%10 indirimli fiyat :"+fiyat);

    }
    public static void indirimYap25(double fiyat){
        fiyat=fiyat * 0.75;
        System.out.println("%25 indirimli fiyat :"+fiyat);


    }
    public static double indirimliFiyatGetir10(double fiyat){

        fiyat=fiyat *0.9;

        return fiyat;
    }

}
