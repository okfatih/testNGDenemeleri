package tests.SmokeTestforBlueRentalCars;

import Pages.BluerentalcarPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PositiveLoginTestforBluerentalCars extends TestBaseRapor {
    @Test (groups = "grup2")

    public void test01() throws IOException {
        extentTest = extentReports.createTest("Pozitif Test","Can login with valid credentials");
        extentTest.info("Go to website");
        Driver.getDriver().get(ConfigReader.getProperty("blueCars")); //bluecars a git
        BluerentalcarPage bluerentalcarPage = new BluerentalcarPage();
        extentTest.info("Login button has been clicked");
        bluerentalcarPage.login.click();
        extentTest.info("Valid email has been entered");
        bluerentalcarPage.email.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        Actions actions = new Actions(Driver.getDriver());
        extentTest.info("Valid pass has been entered");
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("brcValidPass"), Keys.ENTER).perform();
        extentTest.info("Checked if the login was successfull");
        System.out.println(bluerentalcarPage.successfulLogin.getText());
        ReusableMethods.getScreenshotWebElement("Login",bluerentalcarPage.successfulLogin);
        ReusableMethods.getScreenshot("Login'e gidildi");
        Assert.assertTrue(bluerentalcarPage.successfulLogin.isDisplayed());
        extentTest.pass("Login is successful");
             Driver.closeDriver();

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
Smoke test uygulaman?? mutlaka sorumsuz ger??ekle??mesi
gereken ??zelliklerini test etmek i??in yap??l??r
Genellikle sabah ilk i??e ba??lama g??revemizdir.
Login,logout, sepete ekle odemme yap gibi temel i??levleri
test ederiz
E??er smoke test Failed olursa zaman ge??irmeksizin
ekibi haberdar ederiz
 */
