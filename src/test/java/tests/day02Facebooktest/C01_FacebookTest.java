package tests.day02Facebooktest;

import Pages.FacebookPage;
import utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C01_FacebookTest {
    @Test (groups = "grup1")
    public void test1() {
        SoftAssert softAssert = new SoftAssert();
        FacebookPage facebookPage = new FacebookPage();
        Driver.getDriver().get("https://facebook.com");
        Faker faker = new Faker();
        facebookPage.cookies.click();
        facebookPage.email.sendKeys(faker.internet().emailAddress());
        facebookPage.password.sendKeys(faker.internet().password());
        facebookPage.loginButton.click();
        softAssert.assertTrue(facebookPage.forgetPasswordUyarisi.isDisplayed());
        softAssert.assertAll();

    }
}
