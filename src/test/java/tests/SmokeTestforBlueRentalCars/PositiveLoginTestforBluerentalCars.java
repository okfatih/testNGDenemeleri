package tests.SmokeTestforBlueRentalCars;

import Pages.BluerentalcarPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class PositiveLoginTestforBluerentalCars {
    @Test (groups = "grup2")
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("blueCars")); //bluecars a git
        BluerentalcarPage bluerentalcarPage = new BluerentalcarPage();
        bluerentalcarPage.login.click();
        bluerentalcarPage.email.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("brcValidPass"), Keys.ENTER).perform();
        System.out.println(bluerentalcarPage.successfulLogin.getText());
        Assert.assertTrue(bluerentalcarPage.successfulLogin.isDisplayed());
      //  Driver.closeDriver();

    }

    /*
    hotelMyCampPage.loginKutusu.click();
        hotelMyCampPage.username.sendKeys(ConfigReader.getProperty("wrongUserName"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).
                sendKeys(ConfigReader.getProperty("wrongPass")).
                sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(hotelMyCampPage.failedLogin.isDisplayed());
        Driver.closeDriver();
     */
}
/*
Smoke test uygulamanı mutlaka sorumsuz gerçekleşmesi
gereken özelliklerini test etmek için yapılır
Genellikle sabah ilk işe başlama görevemizdir.
Login,logout, sepete ekle odemme yap gibi temel işlevleri
test ederiz
Eğer smoke test Failed olursa zaman geçirmeksizin
ekibi haberdar ederiz
 */
