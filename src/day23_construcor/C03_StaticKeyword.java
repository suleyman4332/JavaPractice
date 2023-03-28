package day23_construcor;

public class C03_StaticKeyword {
    static String hastaneismi="Yildiz Hastamesi";
    static String hastanetelefonu="3122344343";
    static String bashekimIsmi="Kemal Aydın";

    String persIsmi;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {
        C03_StaticKeyword personel1=new C03_StaticKeyword();
        System.out.println(personel1.persIsmi);
        System.out.println(hastaneismi);
        System.out.println(personel1.bashekimIsmi);


        C03_StaticKeyword personel2=new C03_StaticKeyword();
        personel2.persIsmi="Doğan";
        System.out.println("personel2 = " + personel2.persIsmi);
        System.out.println(personel1.persIsmi);
        personel2.bashekimIsmi="Sumeyra günel";
        System.out.println("personel2.bashekimIsmi = " + personel2.bashekimIsmi);
        System.out.println(personel1.bashekimIsmi);

        /*1-static variable ler tüm clas için geçerlidir (clas variable denir
        2-static variable ler tüm objeler için aynı değeri tasıdıkları için
        her obje için ayrıca oluşturulmaz ,sadece 1 variable olur
        3-static variable lere ulasmak veya update etmek için obje ismi kullanmaya gerek yoktur
        direk ulaşılabilir
        baska class dan static variable ye ulaşmak için class ismi static variable ismi yazılır*/


    }
}
