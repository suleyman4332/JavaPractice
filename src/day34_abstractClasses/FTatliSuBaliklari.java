package day34_abstractClasses;

import java.util.ArrayList;
import java.util.List;

public class FTatliSuBaliklari extends EBalik {

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }

    @Override
    public void yuzgec() {

    }

    @Override
    public void yasamAlani() {

    }

    @Override
    public void iskeletYapisi() {

    }

    public static void main(String[] args) {

       // AHayvan hayvan=new AHayvan();
       // EBalik balik=new EBalik();
        FTatliSuBaliklari sazan=new FTatliSuBaliklari();
        EBalik alabalik=new FTatliSuBaliklari();
        AHayvan yayin=new FTatliSuBaliklari();
        /*
        Abstract class larin constructor lari vardir
        ama  obje oluşturulamaz
        Abstruct Class lar data türü seçilip
        Concrete child class larin constructor lari kullanılarak Abstract parent class özelliklerinde objeler oluşturulabilir
         */
        List<String> liste=new ArrayList<>();
        }

        }



