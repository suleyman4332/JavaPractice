package day16_scope_arrays;

public class C01_Hastane {
    public static void main(String[] args) {
        ADoktor dok1=new ADoktor();
        System.out.println(dok1.askerlikYaptiMi);
        dok1.isim="doktor kemal";
        dok1.soyisim="yılmaz";
        dok1.dogumYili=1980;
        System.out.println(dok1.isim);

        ADoktor dok2=new ADoktor();
        System.out.println(dok2.isim);
        dok2.soyisim="Çelik";

        System.out.println(dok2.fakulte);
        dok1.isim="burcu";
        System.out.println(dok2.isim);
        dok1.fakulte="tıp fakultesi";
        System.out.println(dok2.fakulte);
        ADoktor dok3=new ADoktor();
        System.out.println(dok3.dogumYili);
        System.out.println(dok3.fakulte);
        System.out.println(ADoktor.fakulte);


    }}