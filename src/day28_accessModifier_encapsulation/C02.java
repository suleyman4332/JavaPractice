package day28_accessModifier_encapsulation;

public class C02 {
private static String isim;

private boolean atHoliday;

    public static String getIsim() {

        return isim;
    }

    public static void setIsim(String isim) {
        C02.isim = isim;
    }
}

