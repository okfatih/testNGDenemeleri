package tests.SmokeTestforBlueRentalCars;

import Pages.BluerentalcarPage;
import utilities.ConfigReader;
import utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginTestforBluerentalCars {
    @Test (groups = "G2")
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("blueCars")); //bluecars a git
        BluerentalcarPage bluerentalcarPage = new BluerentalcarPage();
        bluerentalcarPage.login.click();
        bluerentalcarPage.email.sendKeys(ConfigReader.getProperty("wrongEmail"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("wrongPass")).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(bluerentalcarPage.failedLogin.isDisplayed());
        Driver.closeDriver();
    }
}
