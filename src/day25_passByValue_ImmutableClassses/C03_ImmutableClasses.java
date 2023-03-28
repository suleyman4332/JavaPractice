package day25_passByValue_ImmutableClassses;

import java.util.Locale;

public class C03_ImmutableClasses {
    /* Java da bir class ve o class dan oluşturulan objeler
    ya mutable dir yada immutable dir.
    Java metinsel ifadeleri atayabileceğimiz 3 clas oluşturmustur
    String;   immutable
    StringBuilder==mutable
    StringBuffer ===mutable
    ımmutable bir class dan oluşturulan objeler de ımmutable dir
    String immutable olduğundan
    aynı str objesine yeni değer atandıgında Java eski değeri DEĞİŞTİREMEZ
    bunun yerine istenen değere sahip yeni bir obje oluşturur
    ve str in pointer ini yeni objeye yöneltir
    kullanılmayan eski objeler
    garbage collector tarafında toplanmak üzere bekler
     */
    public static void main(String[] args) {
        String str="Java candir";
        str=str.toLowerCase();
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);
    }
}
