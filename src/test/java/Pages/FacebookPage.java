package Pages;

import utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookPage {
    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//button[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")
    public WebElement cookies;

    @FindBy (id="email")
    public WebElement email;

    @FindBy (id="pass")
    public WebElement password;

    @FindBy (xpath = "//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement loginButton;

    @FindBy (xpath = "//div[@class='_9ay7']")
    public  WebElement forgetPasswordUyarisi;


}

/*
Page  Object Model'de her page'ın
bir classı olacak ve o page'de locate
etmek istediğimiz her şeyi ve o page'de kullanacağımız reusable methodları koyarız

 */