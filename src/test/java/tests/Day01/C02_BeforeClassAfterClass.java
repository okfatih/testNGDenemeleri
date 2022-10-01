package tests.Day01;

import Utilities.TestBase;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C02_BeforeClassAfterClass extends TestBase {


  @BeforeClass
  public void beforeClassMethod(){
      System.out.println("BeforeClass");
  }
  @AfterClass
  public void afterClassMethod(){
      System.out.println("AfterClass");
  }

    @Test
    public void amazonTesti() {
        driver.get("https://amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void bestbuyTesti() {
        driver.get("https://bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void techProTesti() {
        driver.get("https://techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }
}
