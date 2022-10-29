package tests.day03PomConfigReader;

import Pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C02_ConfigReaderKullanimi {
    @Test
    public void test1() {
        SoftAssert softAssert = new SoftAssert();

        FacebookPage facebookPage = new FacebookPage();
        //facebook'a git
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        //cookies kabul et
        facebookPage.cookies.click();
        //Username wrong username gir

        facebookPage.loginButton.sendKeys(ConfigReader.getProperty("fbWrongUserName"));
        // Password wrong password
        facebookPage.password.sendKeys(ConfigReader.getProperty("fbWrongPass"));
        //login buttonuna basın
        facebookPage.loginButton.click();
        //Giriş yapmadığını test edin
        Assert.assertTrue(facebookPage.forgetPasswordUyarisi.isDisplayed());
        //Sayfayı kapat
        Driver.closeDriver();

    }
}
