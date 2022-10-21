package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    public void onStart(ITestContext arg) {
        System.out.println("OnStart- Tum testlerden once 1 sefer calisir-> "+ arg.getName());
    }
    public void onFinish(ITestContext arg){
        System.out.println("onFinish- Tum testlerden sonra 1 sefer calisir-> " + arg.getName());
    }
    public void onTestStart(ITestResult arg){
        //Before Method gibidir
        System.out.println("onTestStart- Method sayisi kadar, Herbir @Test anotationindan once 1 kez calisirr-> " + arg.getName());
    }
    public void onTestSuccess(ITestResult result){
      System.out.println("onTestSuccess- Passed olan method sayisi kadar calisir sonra calisir-> "+ result.getName());
        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onTestSkipped(ITestResult result){
       // System.out.println("Skipped edilen method sayisi kadar ve skip edilen methodlardan sonra 1 kez calisir->" +result.getName());
        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void onTestFailure(ITestResult result){
      //  System.out.println("Failed edilen method sayisi kadar calisir ve failed edilen methodlar sonra calisir-> "+ result.getName());
        try {
            ReusableMethods.getScreenshot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
