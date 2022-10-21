package tests;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import javax.swing.text.Utilities;
//Test class i utility classa vağlamak için @Listeners annotation ı kullanarız
@Listeners(utilities.Listeners.class)
public class ListenersTest1 {
    @Test
    public void test1() {
        System.out.println("Test Case 1 - PASS");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println("Test Case 2 - FAIL");
        Assert.assertTrue(false);
    }

    @Test
    public void test3() {
        System.out.println("Test Case 3 - SKIPPED");
        throw new SkipException("Skip Edilecek");
    }
}
