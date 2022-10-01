package tests.Day01;

import Utilities.TestBase;
import org.testng.annotations.Test;

public class Priority extends TestBase {
    @Test (priority = 2)
    public void amazonTesti() {
        driver.get("https://amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test (priority = -1)
    public void bestbuyTesti() {
        driver.get("https://bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test (priority = 1)
    public void techProTesti() {
        driver.get("https://techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
    //çalışma sırası bestbuy, techpro, amazon
}
