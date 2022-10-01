package tests.Day01;

import Utilities.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_DependsOnMethods  {
   WebDriver driver;
    @BeforeClass
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterClass
    public void TearTown(){
           // driver.close();
    }


    @Test
    public void test1() {
        driver.get("https://raamazon.com");
    }

    @Test (dependsOnMethods = "test1")
    public void test2() {
        WebElement aramakutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramakutusu.sendKeys("Nutella",Keys.ENTER);
    }

    @Test (dependsOnMethods = "test2")
    public void test3() {
        /*
        Sonuc yazısının nutella içerdiğini test et
         */
        WebElement resultYazi = driver.findElement(By.xpath("//*[@class='sg-col-inner']"));
        Assert.assertTrue(resultYazi.getText().contains("Nutella"));
    }
}
