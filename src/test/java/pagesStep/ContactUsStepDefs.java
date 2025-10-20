package pagesStep;

import WebDriverCustomise.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.ContactUs;

public class ContactUsStepDefs {

    public WebDriver driver;
    public ContactUs contactUs;


    public ContactUsStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.contactUs = new ContactUs(driver);
    }
}
