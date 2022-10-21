package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage {
    public TwitterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//div[@class='css-901oao r-1awozwy r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0'])[1]")
    public WebElement cookies;

    @FindBy (xpath = "//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")
    public WebElement signUpWithEmail;

    //Create your account name
    @FindBy (xpath = "//input[@name='name']")
    public WebElement enterName;

    @FindBy (xpath = "//input[@name='phone_number']")
    public WebElement enterPhone;

}
