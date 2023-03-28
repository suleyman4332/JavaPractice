package day36_exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {
        String str=null;
        System.out.println(str);
       // System.out.println(str.concat(str:"Java"));
        String str1="34";
        String str2="23";
        //String olarak verilen sayiların toplamını yazdırın
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));
        String str4="Java Candir";
        Object obj=str4;
        Integer a= (Integer) obj;


    }
}
