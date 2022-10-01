package tests.TwitterTest;

import Pages.TwitterPage;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;

public class C01_TwitterTest {
    @Test
    public void test1() {
        TwitterPage twitterPage = new TwitterPage();//Twitter pageDeki constructor ı kullanıyoruz
        Driver.getDriver().get("https://twitter.com");
      //  twitterPage.cookies.click();
        twitterPage.signUpWithEmail.click();
        Faker faker = new Faker();
        twitterPage.enterName.sendKeys("Fatih", Keys.ENTER);
        twitterPage.enterPhone.sendKeys("24312412412",Keys.ENTER);

    }
}
