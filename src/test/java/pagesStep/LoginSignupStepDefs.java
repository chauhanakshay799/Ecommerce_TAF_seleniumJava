package pagesStep;

import WebDriverCustomise.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.LoginSignup;

public class LoginSignupStepDefs {


    WebDriver driver;
    public LoginSignup loginsignup;

    public LoginSignupStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.loginsignup = new LoginSignup(driver);
    }
}
