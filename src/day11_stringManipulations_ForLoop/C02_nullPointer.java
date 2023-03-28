package day11_stringManipulations_ForLoop;

public class C02_nullPointer {
    public static void main(String[] args) {
        //null bi değer değildir
        //null bir pointer dir,yanına yazıldıgı non primative variableye değer atanmadığını işaret eder
        String str;  //str oluşturuldu ama değer atanmadı
        //java metoty içerisinde değer atamadan vaiable oluşturulmasına izin verir
        // ama değer atamadan kullanımlasına izin vermez
        //bazen programlarda variable ler oluşturulur ama daha sonra değer atanacağı için değer ataması yapılmaz
        //değer ataması yapılmadan listeleme bile cte verdiği için
        //değer verilmediğini işaretleyecek ,ama cte oluşmasını engellyecek biz çözüm olarak null pointer oluşturulmustur
        str=null; //str ="null" olarak işaretlenmiş değeri null atanmıs değil
        System.out.println(str);
        //System.out.println(str.concat("java"));
        //System.out.println(str.length());
        System.out.println(str+"java");
        String str2=str+"java";
        System.out.println("str2 = " + str2);
        //biz genelde String bir iafade oluşturup sonra değer atayacaksak hiçlik değeri atarız
        String str3="";//str 3 e değer atanmıştır,atanan değer hiçlik dir.
        System.out.println(str3.concat("java"));//null hiçbir metodla kullanılamaz




}}


