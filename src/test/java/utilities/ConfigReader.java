package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
   public static Properties properties; //properties objesi olştur
   static {
       String dosyaYolu = "configuration.properties"; //static block içersinde configiration.properties textini bir String e ata

       try {
           FileInputStream fis = new FileInputStream(dosyaYolu); //bu stringi okut
           //fis dosyayolunu configuration.properties dosyasını okudu
           properties = new Properties();
           properties.load(fis); // fis in okuduğu bilgileri properties e yükledi
       } catch (IOException e) {
           e.printStackTrace();
       }

   }

    public static  String getProperty(String key){ // içine key göndericeğimiz get property methodunu create et
       /*
       Test methodundan yolladıgımız String key değerini alıp Properties
       clasından get property methodunu kullanarak bu key ait value u bize
       getirdi
        */

        return properties.getProperty(key);
        /*
        Testlerde  Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

       şeklinde kullandığın methoda key gönder amazonUrl o da sana  value versin
         */
    }

}
