package tests.day02Facebooktest;

import Utilities.Driver;
import org.testng.annotations.Test;

public class UcFarkliSite {
    @Test
    public void test1() {
        Driver.getDriver().get("https://amazon.com");
        Driver.closeDriver(); // amazona gittikten sonra kapatacak  FAKAT durmayacak burdan devam edp youtube u açıcak
        Driver.getDriver().get("https://youtube.com");
        Driver.closeDriver(); //Youtube kapatıp twitter açacak
        Driver.getDriver().get("https://twitter.com");
        // En sonunda twitter ı kapatacak

        /*
        Utilities Driver da Driver methoduna if (driver == null) atadığımdan
        bu 3 site tek pencerede açılacask
        Aynı if i Driver.closeDriver() a da attım böyleylikle BeforeClass, AfterClass
        tan farklı olarak driverı kapatma hususunu elime almış oldum
         */
    }
}
