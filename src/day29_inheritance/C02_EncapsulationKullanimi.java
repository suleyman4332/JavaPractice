package day29_inheritance;

public class C02_EncapsulationKullanimi {
    public static void main(String[] args) {
        C01 obj=new C01();
        obj.isim="Melike";//write
        System.out.println(obj.isim);//read

        obj.setSayi(40);//read
        System.out.println(obj.getSayi());//read


        /*
        bir clas üyesinin puplic olmasi ile private yapılıp getter ve setter methodlarının
        oluşturulması işlevsel açıdan aynı sonuç oluşturur

        bazı develeporlar set(write) ve get(read) yatkilerinin kullanıldıgını vurgulamak için 2. yöntemi tercih ederler
         */







    }
}
