package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.List;

public class TestCaseList {

    @FindBy(xpath = "//*[@class='nav navbar-nav']/li[5]")
    public static WebElement testCase_page_button;

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

    public TestCaseList(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
