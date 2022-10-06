package tests.October4;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.io.IOException;

public class ScreenShotReusableMethod {
    @Test
    public static  void test1() throws IOException {
        Driver.getDriver().get("https://hepsiburada.com");
     ReusableMethods.getScreenshot("HepsiBurdaHomePage");
        Driver.closeDriver();


    }


    @Test
    public void test2() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Dexter Navigator shoes", Keys.ENTER);
       ReusableMethods.getScreenshotWebElement("Dexter ayakkabi",amazonPage.aramaSonucu);
        // ReusableMethods.getScreenshotWebElement("aramaSonucu",amazonPage.aramaSonucu);
        Driver.quitDriver();
    }
}
