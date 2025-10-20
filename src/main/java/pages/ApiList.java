package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


import java.util.List;

public class ApiList {

    @FindBy (css = ".title.text-center")
    public static WebElement apiList_title_placeholder;

    @FindBy (xpath = "//*[@class=\'panel-group\']//span")
    public static WebElement apiList_subtitle_placeholder;

    @FindBy(css = ".panel-heading .panel-title a")
    public List<WebElement> apiTitles;

    @FindBy (xpath = "//h4[contains(@class,'panel-title')]/a[@href='#feedback']")
    public static WebElement feedback;

    @FindBy (id = "feedback")
    public static WebElement feedback_textTable;

    public ApiList(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }





}
