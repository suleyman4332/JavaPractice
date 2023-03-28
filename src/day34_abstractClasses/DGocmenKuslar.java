package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar{
    /*
    sadece ayırımı belirtmek için abstruck olmayan classlara concrete class denir

    1-abstruct bir class
    parent i olan abstruct class daki
    abstruct methodları ZORUNDA DEĞİLDİR
    isterse implement edip ,concrete hale getirir
    isterse yok sayar
    2-abstruct bir silsileden sonra gelen ilk concrete class parent veya grand parent (s)olan
    abstruct class larda
    concrete yapılmayan tüm abstruct classlari IMPLEMENT etmek ZORUNDADİR

     */

    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
