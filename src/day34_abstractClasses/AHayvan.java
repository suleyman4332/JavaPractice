package day34_abstractClasses;

public abstract class AHayvan {
    /*
    bir class ı abstract class yapmak için deklerasyona abstract keyword unu yazmnak yeterlidir

    abstract class lar class olduklaı için constractorları vardır
    ama abstract class larda obje oluşturulamaz
    Abstract class larda bugüne kadar kullandıgımız yapıda
    methodlar oluşturabiliriz ancak bunlar child class lar tarafından
    uyarlanmak (override)zorunda olmaz
    Child class ları uyarlamaya mecbur etmek istediğimiz methodları da abstract yapmalıyız

    bir method u abstract yapmak için yine declaratıonına  abstract yazmamız yeterli
     */

    public abstract void hareket();


    public abstract void solunum();



    public abstract void beslenme();

    public abstract void cogalma();

    public abstract void omur();
}
