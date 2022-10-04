package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExercisePage {
    public AutomationExercisePage(){
       PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//html")
    public WebElement homepage;

    @FindBy (xpath = "//i[@class='fa fa-shopping-cart']")
    public WebElement alisverisKutus;

    @FindBy (xpath = "//h2")
    public WebElement subscText;

    @FindBy (xpath = "//*[@id='susbscribe_email']")
    public WebElement emailBox;

    @FindBy (xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    public WebElement arrow;



    @FindBy(xpath = "//div[@id='success-subscribe']")
    public WebElement text;

}
