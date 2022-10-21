package tests.October4;

import Pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import tests.log4J.Log4JTest1;

import java.io.IOException;

public class ScreenShotReusableMethod {
    private static Logger logger = LogManager.getLogger(Log4JTest1.class.getName());
    @Test
    public static  void test1() throws IOException {

        logger.info("HepsiBurada sitesine gidilir");
        Driver.getDriver().get("https://hepsiburada.com");
        logger.info("Ekran görüntüsü alınır");
     ReusableMethods.getScreenshot("HepsiBurdaHomePage");
        logger.warn("Driver kapatılır");
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
