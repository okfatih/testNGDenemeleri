package tests.day03Pom;

import utilities.ConfigReader;
import utilities.Driver;
import org.testng.annotations.Test;

public class C01_ConfigReader {
    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
    }
}
