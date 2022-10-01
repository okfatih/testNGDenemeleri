package tests.Day01;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_Assertions extends TestBase {
    @Test
    public void test1() {
        SoftAssert softAssert  = new SoftAssert();
        //Amazon title ın amazon içerdiğini test et
        driver.get("https://amazon.com");
        Assert.assertTrue(driver.getTitle().contains("PArqwreqrqmazon"));
        // arama kutusunun erişilebilir olduğunu test et
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramakutusu.isEnabled());
        //arama kutusuna nutella yazıp aratın
        aramakutusu.sendKeys("Nutella", Keys.ENTER);
        //arama yapıldığının test edin
        WebElement resultYazi = driver.findElement(By.xpath("//*[@class='sg-col-inner']"));
        Assert.assertTrue(resultYazi.isDisplayed());
        //arama sonucunun nutella içerdiğini test et
        Assert.assertTrue(resultYazi.getText().contains("Nutella"));


    }


}
