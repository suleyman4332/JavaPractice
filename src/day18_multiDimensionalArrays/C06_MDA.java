package day18_multiDimensionalArrays;

public class C06_MDA {
    public static void main(String[] args) {
        String str="süleyman ünal";
        String ters="";
        for (int i = str.length()-1; i >=0 ; i--) {
            ters+=str.charAt(i);

        }
        System.out.println("\""+ters+"\"");
    }

}
