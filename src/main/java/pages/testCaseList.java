package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class testCaseList {

    @FindBy(xpath = "//div[@class='panel-heading']//a")
    public WebElement testCaseTitle;

    @FindBy (css = ".title.text-center")
    public WebElement testCaseTitle_text;

    @FindBy (xpath = "//*[@class=\'panel-group\']//span")
    public List<WebElement> testCaseTable_description;

    @FindBy (xpath = "//h4[contains(@class,'panel-title')]/a[@href='#feedback']")
    public static WebElement feedback;

    @FindBy (id = "feedback")
    public static WebElement feedback_textTable;

}
