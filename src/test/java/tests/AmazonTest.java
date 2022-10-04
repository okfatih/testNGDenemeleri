package tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AmazonTest {
    @Test (groups = "G2")
    public void test1() {
        //  Driver.getDriver().get("amazonUrl");

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        
        AmazonPage amazonPage = new AmazonPage();
        Assert.assertTrue(amazonPage.homepage.isDisplayed());
        amazonPage.aramaKutusu.sendKeys("nutella", Keys.ENTER);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();


       // System.out.println(amazonPage.aramaSonucu.getText());
//        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
//        js.executeScript("arguments[0].scrollIntoView(true);",amazonPage.belowSignIn);
        //js.executeScript("arguments[0].click();",amazonPage.belowSignIn);

    }

    @Test
    public void amazonHomePageTest() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(amazonPage.homepage.isDisplayed());
    }
}