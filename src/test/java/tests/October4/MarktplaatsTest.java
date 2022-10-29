package tests.October4;

import Pages.MarktplaatsPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.*;

import java.io.IOException;
import java.util.List;

public class MarktplaatsTest extends TestBaseRapor {
    MarktplaatsPage marktplaats = new MarktplaatsPage();
    Actions actions = new Actions(Driver.getDriver());
    static Select select;

    @Test
    public void test3() throws IOException {
        extentTest = extentReports.createTest("MarktplaatsTest", "Search and drop down menu in Marktplaats");

        extentTest.info("User goes to marktplaats homepage");
        Driver.getDriver().get(ConfigReader.getProperty("marktplaats"));

        extentTest.info("User accepts cookies");
        marktplaats.cookies.click();

        extentTest.info("User searches for Java");
        marktplaats.searchbox.sendKeys("Java", Keys.ENTER);
        //actions.sendKeys(Keys.ENTER).perform();

        extentTest.info("User gets the results text printed");
        System.out.println(marktplaats.resultYazisi.getText());

        extentTest.info("User gets the picture of results text taken");
        ReusableMethods.getScreenshotWebElement("Result Text", marktplaats.resultYazisi);

        extentTest.info("User verifies that result text contains java");
        Assert.assertTrue(marktplaats.resultYazisi.getText().contains("java"), "No java in the results");

        select = new Select(marktplaats.dropDown);

        extentTest.info("User selects the second item from dropdown menu");
        select.selectByIndex(2);

        extentTest.info("User gets each dropdown menu item printed");
        List<WebElement> dropDown = select.getOptions();
        dropDown.stream().forEach(t -> System.out.print(t.getText() + ", "));


    }
}
