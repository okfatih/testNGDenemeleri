package tests.Cross_Browser;

import Pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProvider {




    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        String expectedKelime = "Nutella";
        String actualKelime = amazonPage.aramaSonucu.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));
        Driver.closeDriver();
    }

    @Test(dataProvider = "Aranacakelime")
    /*
    Arayacağımız kelimeleri bir liste giti tut
    bana yollayack veri sağlayıcısı create edicez
     */
    public void dataProviderTest(String arananKelime) {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Nutella Java, cigdem ve Nederland araması yap
        amazonPage.aramaKutusu.sendKeys(arananKelime+Keys.ENTER);

        //sonçların aradığımız kelime içerip içöermediğini test edelim
        String expectedKelime =arananKelime;
        String actualKelime = amazonPage.aramaSonucu.getText();
        //Sayfayı kapatalım
        Driver.closeDriver();
    }
    @org.testng.annotations.DataProvider
    public static Object[][] Aranacakelime() {
        Object[][] arananKelimeArrayi = {{"Nutella"}, {"Java"},{"cigdem"}, {"Netherlands"}};
        return arananKelimeArrayi;
    }
    @org.testng.annotations.DataProvider
    public static Object[][] search() {
        Object[][] arr = {{"Dexter Shoes"}, {"Ralph Lauren Oxford"},{"Levi's 502"}};
        return arr;
    }
    @Test (dataProvider = "search")
    public void test2(String wordToBeSearched) {
        AmazonPage amazonPage = new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPage.aramaKutusu.sendKeys(wordToBeSearched,Keys.ENTER);
        String expectedResults = wordToBeSearched;
        String actualReslts =amazonPage.aramaSonucu.getText();
        Assert.assertTrue(actualReslts.contains(expectedResults));
        Driver.closeDriver();
    }
}
