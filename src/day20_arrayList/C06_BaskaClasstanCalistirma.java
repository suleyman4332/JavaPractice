package day20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_BaskaClasstanCalistirma {
    public static void main(String[] args) {
        //c05 de ki istenmeyenleri sil methodu burada kullanalım
        List<String> urunler=new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("çikolatalı gofret");
        urunler.add("Çokoprens");
        urunler.add("cokomel");
        String istenmeyenHarf="o";
        System.out.println(C05_IstenmeyeniSil.istenmeyenharfIcerenlerisil(urunler, istenmeyenHarf));
        System.out.println(C05_IstenmeyeniSil.istenmeyenharfIcerenlerisil(urunler,"a"));

    }
}
