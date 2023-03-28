package day13_methodolusturma;

public class C05_StringiTerseCevirme {
    public static void main(String[] args) {
        //veilen bir stringi tersine çevirip bize döndüren bir method oluşturun
        stringTersineCevir("Java Candır");
    }
    public static String stringTersineCevir(String  metin){
        String tersMetin="";
        for (int i =metin.length()-1; i >=0 ; i--) {

            tersMetin+=metin.charAt(i);

        }
        return tersMetin;
    }
}
