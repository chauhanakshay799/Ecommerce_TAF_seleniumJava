package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginSignup {


    @FindBy(xpath = "//div[contains(@class, 'login-form')]//h2")
    public static WebElement login_box_title;

    @FindBy(xpath = "//*[@data-qa=\"login-email\"]")
    public static WebElement login_email_box;

    @FindBy(xpath = "//*[@data-qa=\"login-password\"]")
    public static WebElement login_password_box;

    @FindBy(xpath = "//*[@data-qa=\"login-button\"]")
    public static WebElement login_button;

    @FindBy(xpath = "//*[@data-qa=\"signup-name\"]")
    public static WebElement signup_email_box;

    @FindBy(xpath = "//*[@data-qa=\"signup-email\"]")
    public static WebElement signup_password_box;

    @FindBy(xpath = "//*[@data-qa=\"signup-button\"]")
    public static WebElement signup_button;

    @FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/li[4]")
    public static WebElement logout_button;

    @FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/li[10]")
    public static WebElement loggedin_user_name;

    public LoginSignup(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
