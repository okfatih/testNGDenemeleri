package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BluerentalcarPage {
    public BluerentalcarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
//Kullanıcı adı customer@bluerentalcars.com
    //pass: 12345

    @FindBy (xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement login;

    @FindBy (xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy (xpath = "//*[@id='formBasicPassword']" )
    public WebElement pass;

    @FindBy (xpath ="//button[@class='btn btn-primary']" )
    public WebElement login2;

    @FindBy (xpath = "//button[@id='dropdown-basic-button']")
    public  WebElement successfulLogin;

    @FindBy (xpath = "//*[text()='email must be a valid email']")
    public WebElement failedLogin;
}
