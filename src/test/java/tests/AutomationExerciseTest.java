package tests;

import Pages.AutomationExercisePage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class AutomationExerciseTest extends TestBaseRapor {
    @Test(groups = "G2")
    public void test01() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("Automation ex","display test");

        extentTest.info("Automationexercise sitesine gidildi");
        ReusableMethods.getScreenshot("automationexercise Site anaSayfası");
        Driver.getDriver().get("http://automationexercise.com");
        AutomationExercisePage automationExercisePage = new AutomationExercisePage();
        SoftAssert softAssert = new SoftAssert();

        extentTest.info("HomePage görülüp görülmediği test edildi");
        softAssert.assertTrue(automationExercisePage.homepage.isDisplayed());

        extentTest.info("Alışveriş kutusu tıklandı");
        automationExercisePage.alisverisKutus.click();
        Actions actions = new Actions(Driver.getDriver());

        extentTest.info("Subscribe bölümüne gidilip görülüp görülmedi test edildi");
        actions.moveToElement(automationExercisePage.subscText).perform();
        ReusableMethods.getScreenshotWebElement("subscription",automationExercisePage.subscText);
        softAssert.assertTrue(automationExercisePage.subscText.isDisplayed());

        extentTest.info("Email kutucuğu dolduruldu");

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