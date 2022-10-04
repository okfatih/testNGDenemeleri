package tests;

import Pages.AmazonPage;
import Pages.AutomationExercisePage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AutomationExerciseTest {
    @Test(groups = "G2")
    public void test01() throws InterruptedException {
        Driver.getDriver().get("http://automationexercise.com");
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(automationExercisePage.homepage.isDisplayed());
        automationExercisePage.alisverisKutus.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(automationExercisePage.subscText).perform();
        softAssert.assertTrue(automationExercisePage.subscText.isDisplayed());
        automationExercisePage.
                    emailBox.sendKeys("raysting@gmail.com",Keys.ENTER);
        Thread.sleep(3000);
        //actions.moveToElement(automationExercisePage.arrow).click().perform();
        softAssert.assertTrue(automationExercisePage.text.isDisplayed());





    }
}
/*
/ 1. Tarayıcıyı başlat
// 2. 'http://automationexercise.com' url'sine gidin
// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
// 4. 'Sepet' düğmesine tıklayın
// 5. Altbilgiye ilerleyin
// 6. 'ABONELİK' metnini doğrulayın
// 7. Girişte e-posta adresini girin ve ok düğmesine tıklayın
// 8. Başarı mesajını doğrulayın 'Başarıyla abone oldunuz!' görünür
automationexercise.com
Automation Exercise
This is for automation practice
 */