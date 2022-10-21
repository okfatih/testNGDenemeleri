package tests.TwitterTest;

import Pages.TwitterPage;
import utilities.Driver;
import utilities.TestBaseRapor;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class C01_TwitterTest extends TestBaseRapor {
    @Test (groups = "G2")
    public void test1() {
        extentTest = extentReports.createTest("Twitter Sign Up Test","To be able to sign in with valid cred");
        TwitterPage twitterPage = new TwitterPage();//Twitter pageDeki constructor ı kullanıyoruz
        extentTest.info("Twitter ana sayfaya gidildi");
        Driver.getDriver().get("https://twitter.com");
      //  twitterPage.cookies.click();
        extentTest.info("sign up tuşu tıklandı");
        twitterPage.signUpWithEmail.click();
        Faker faker = new Faker();
        extentTest.info("Faker ile çakma bir isim girildi");
        twitterPage.enterName.sendKeys("Fatih", Keys.ENTER);
        extentTest.info("Faker ile çakma bir şifre girildi");
        twitterPage.enterPhone.sendKeys("24312412412",Keys.ENTER);
        extentTest.pass("Successfull Sign In");

    }
}
