package day31_inheritance;

public class Hemsire extends FMuhasebe {

    String unvan = "Hemsire";

    public void standartMaas() {
        System.out.println("Hemsireler min.10 bin tl maas alir");
    }

    public void ozelSigorta() {
        System.out.println("Hemsireler aylık 300 tl katkı ile özel sigorta yaptırabilir");
    }

    public void nobetUcreti(int nobetSayisi) {
        System.out.println(nobetSayisi * 200);
    }

    public static void main(String[] args) {
    Hemsire hemsire=new Hemsire();
    hemsire.method();


}

    public void method (){
        System.out.println(this.unvan);
        System.out.println(super.unvan);
        System.out.println(this.sgkNo);
        System.out.println(super.sgkNo);
        this.standartMaas();
        this.fazlaMesai(3);
        super.fazlaMesai(4);
        this.ozelSigorta();
        super.ozelSigorta();

    }

}
