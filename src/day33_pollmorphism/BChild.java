package day33_pollmorphism;

public class BChild extends AParent{

    @Override
    void method1() {
        //super.method1();
        //burada süper . olursa hem child class daki method1
        //hemde süper clas daki method 1 calısır

    }
    void method2(){
        /*
        bir method override edildiğinde child classs da QOverride notasyonu KULLANILABİLİR

        kullanmak veya kullanmamak arasında pratikte soyle bir sonuc olusur

        eger notasyon kulalnılırsa intelij iki method arasındaki ilişli takip edilir parent class daki
        method silinirse notasyon cte verir

        notasyon yoksa
        parent class daki overriden method silinirse bir uyarı verilmez cte olusmaz

         */
    }
    Integer method3(){
        return 5;
    }
}
