package tests.Cross_Browser;

import Utilities.CrossDriver;
import Utilities.TestBase;
import Utilities.TestBaseCross;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C02_SoftAssertionCross extends TestBaseCross {
    SoftAssert softAssert;
    @Test

    public void test1() {

        //Amazon title ın amazon içerdiğini test et
        driver.get("https://amazon.com");
        softAssert.assertTrue(driver.getTitle().contains("Amazon"),"Title doesn't include amazon");
        // arama kutusunun erişilebilir olduğunu test et
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramakutusu.isEnabled(),"arama kutusuna erisilemiyor");
        //arama kutusuna nutella yazıp aratın
        aramakutusu.sendKeys("Nutella", Keys.ENTER);
        //arama yapıldığının test edin
        WebElement resultYazi = driver.findElement(By.xpath("//*[@class='sg-col-inner']"));
        softAssert.assertTrue(resultYazi.isDisplayed(),"Search has been done");
        //arama sonucunun nutella içerdiğini test et
        softAssert.assertTrue(resultYazi.getText().contains("Nutella"),"Search doesn't include Kutella");


        //softAssert e bitiş satırını söylemek için assertAll kullanılır
        softAssert.assertAll();

    }
}