package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MarktplaatsPage {
    public MarktplaatsPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (xpath = "//*[@id='gdpr-consent-banner-accept-button']")
    public WebElement cookies;

    @FindBy (xpath ="//input[@class='hz-Nav-dropdown-toggle hz-Header-Autocomplete-input']")
    public WebElement searchbox;

    @FindBy (xpath = "(//span[@class='mp-Nav-breadcrumb-item'])[2]")
    public WebElement resultYazisi;

    @FindBy (xpath = "//select[@class='hz-Dropdown-input']")
    public WebElement dropDown;


}
