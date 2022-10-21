package tests.Day01;

import utilities.TestBase;
import org.testng.annotations.Test;

public class C01_BeforeMethodAfterMethod extends TestBase {
    @Test
    public void amazonTesti() {
        driver.get("https://amazon.com");
    }

    @Test
    public void bestbuyTesti() {
        driver.get("https://bestbuy.com");
    }

    @Test
    public void techProTesti() {
        driver.get("https://techproeducation.com");
    }
}
