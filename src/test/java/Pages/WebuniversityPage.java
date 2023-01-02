package Pages;

import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebuniversityPage {
    public WebuniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);

                }
    @FindBy (xpath = "//input[@type='text']")
    public WebElement text;

    @FindBy (xpath = "//li")
    public List<WebElement> toDoListelemanlari;

    @FindBy (xpath = "//li")
    public List<WebElement>streepToDoButtons;

    @FindBy (xpath = "//*[@class='fa fa-trash']")
    public List<WebElement>deleteButtons;

}
