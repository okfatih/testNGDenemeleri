package tests.day03Pom;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C01_ConfigReader {
    @Test
    public void test1() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
    }
}
