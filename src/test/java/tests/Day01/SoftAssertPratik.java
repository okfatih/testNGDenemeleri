package tests.Day01;

import Utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPratik extends TestBase {
    @Test
    public void test01() {
        SoftAssert softAssert = new SoftAssert();

        driver.get("http://zero.webappsecurity.com/");
        //Sign in a bas
        driver.findElement(By.xpath("//*[@id='signin_button']")).click();
        //K.adı ve şifre gir
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("username");
        driver.findElement(By.xpath("//*[@id='user_password']")).sendKeys("password");
        //sign in a bas
        driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

    }
}
