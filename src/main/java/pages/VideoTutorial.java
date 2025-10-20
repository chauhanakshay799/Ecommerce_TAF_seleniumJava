package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class VideoTutorial {

    @FindBy(xpath = "//*[@class='nav navbar-nav']/li[8]/a")
    public WebElement videoTutorials_link;

    public VideoTutorial(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
