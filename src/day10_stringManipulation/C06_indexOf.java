package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        // Verilen bir cumlede istenen bir String ıcın asagıdakı cumlelerden uygun olanı yazdırın
// 1- Aaradıgınız kelıme cumlede bır kere kullanılmıs
// 2- Aradıgınız kelıme cumlede 2 kere kullanılmıs
// 3- Aradıgınız kelıme cumlede 2'den fazla kullanılmıs
        /*String str="Java cok ma cok guzel";
        System.out.println(str.indexOf("c"));
        String cumle="Yaşasın java iyiki java öğrenmişim";
        String kelime="java";
        public static void main(String[] args) {
            String str = "Java cok ama cok guzel";
            System.out.println(str.indexOf("c")); // 5
            System.out.println(str.indexOf("a")); // 1 birden fazla ise ilk buldugunu verir
            System.out.println(str.indexOf("cok")); // 5
            System.out.println(str.indexOf("cok", 6)); // 13
            System.out.println(str.indexOf("cok", 5)); // 5
            System.out.println(str.indexOf("java")); // -1  aranan String yoksa -1 doner
            // Verilen bir cumlede, istenen bir String icin
            // asagidaki cumlelerden uygun olani yazdirin
            // 1- aradiginiz kelime cumlede 1 kere kullanilmis
            // 2- aradiginiz kelime cumlede 2 kere kullanilmis
            // 3- aradiginiz kelime cumlede 2'den fazla kullanilmis
            // 4- aradiginiz kelime cumlede hic kullanilmamis
            String cumle= "Yasasin java, iyi ki java ogreniyorum";
            String kelime= "Yasasin";
            if (cumle.indexOf(kelime) == (-1)){
                System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
            } else {
                int kelimeIlkIndex= cumle.indexOf(kelime); // 8
                if (cumle.indexOf(kelime,(kelimeIlkIndex+1))==(-1)){
                    System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
                }else {
                    int ikinciKelimeIndex=cumle.indexOf(kelime,(kelimeIlkIndex+1));
                    if (cumle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                        System.out.println("aradiginiz kelime cumlede 2 kere kullanilmis");
                    }else{
                        System.out.println("aradiginiz kelime cumlede 2'den fazla kullanilmis");*/
        String str = "Java bazen beyin yakar";
        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.indexOf("a", 2));
        System.out.println(str.lastIndexOf("a", 19));
        System.out.println(str.indexOf("a", 4));
        System.out.println(str.lastIndexOf("a", 17));
        System.out.println(str.indexOf('e'));
        System.out.println(str.lastIndexOf('e'));
        System.out.println(str.lastIndexOf("mustafa"));
        String cumle = "Yasasin java, iyi ki java ogreniyorum";
        String kelime = "Yasasin";

        int ilkIndex = cumle.indexOf(kelime);
        int lastIndex = cumle.lastIndexOf(kelime);

        if (ilkIndex == (-1)) {
            System.out.println("aradiginiz kelime cumlede hic kullanilmamis");
        } else if (ilkIndex == lastIndex) {
            System.out.println("aradiginiz kelime cumlede 1 kere kullanilmis");
        } else {
            System.out.println("aradiginiz kelime cumlede 1'den fazla kullanilmis");


        }

    }
}
