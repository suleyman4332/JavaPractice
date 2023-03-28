package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Checked exceptions kod yazılır yazılmaz ,daha run etmeden
        javanın riskli kodları tanımlayıp
        calıstırmadan önce bana bir yol göstermelisin dediği
        exception türleridir.
        Checked Exceptions genelde dosya okuma ve yazma IO islelerinde olusur
        IO exception olusma ihtimaline karsı
        kodu yazar yazmaz Java altını kırmızı çizer
        Checked exception için kodun altını kırmızı çizdiğinden
        kodumuzun çalısır hale gelmesi için kirmizi çizgiyi kaldırmamız lazım
        1-try -catch blogu kullanark
        exception handle edilebilir
        ve javaya  exception olustugunda ne yapmasını istediğimiz gösterilebilir
        2-eger exception i handle etmek istemiyorsak
        sadece kodumuzun calısmasını istiyorsak
        method deklarasyonuna bu exception ihtimalini yazarak
        kodu calısır hale getirebiliriz
        method signature ina throws keyword u ile beklenen exception turunu yazarsak kod calısır duruma gelir
        ANCAK exception olusursa java ya cözüm yolu sunulmadıgından kodun calısması durur

         */
        String dosyaYolu="src/day36_exceptions/text.txt";
        FileInputStream fis=new FileInputStream(dosyaYolu);

    }
}
