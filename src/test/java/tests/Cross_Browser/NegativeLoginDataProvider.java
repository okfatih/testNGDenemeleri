package tests.Cross_Browser;

import Pages.BluerentalcarPage;
import utilities.ConfigReader;
import utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeLoginDataProvider {
    BluerentalcarPage brcPage;

    @DataProvider
    public static Object[][] kullaniciListesi() {

        Object[][] kullaniciInfo = {{"fatih@31gmail.com", "1234"},
                                    {"ramboOkan21@gmail.com", "731"},
                                    {"ilyas@gmasda", "312414"}};
        return kullaniciInfo;
    }


    @Test(dataProvider = "kullaniciListesi" )
    public void test01(String userMail, String password) throws InterruptedException {
        brcPage=    new BluerentalcarPage();
        Driver.getDriver().get(ConfigReader.getProperty("blueCars")); //bluecars a git
        Thread.sleep(2000);
        brcPage.login.click();
        //Data Provider dan test emaili alalım
        brcPage.email.sendKeys(userMail);

        brcPage.pass.sendKeys(password);

        brcPage.login2.click();
        Assert.assertTrue(brcPage.login2.isDisplayed());
        Driver.closeDriver();
    }
}
