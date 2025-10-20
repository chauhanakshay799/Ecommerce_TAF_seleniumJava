package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class ContactUs {

    @FindBy(xpath = "//*[@class='col-sm-12']//*[@class='title text-center']")
    public static WebElement contactUs_placeholder;

    @FindBy (xpath = "//input[@name='name']")
    public static WebElement contactUs_name;

    @FindBy (xpath = "//input[@name='email']")
    public static WebElement contactUs_email;

    @FindBy (xpath = "//input[@name='subject']")
    public static WebElement contactUs_subject;

    @FindBy (xpath = "//input[@name='upload_file']")
    public static WebElement contactUs_pdf_upload;

    @FindBy (xpath = "//input[@name='submit']")
    public static WebElement contactUs_form_submit;

    @FindBy (xpath = "//*[@class='contact-form']/div[1]")
    public static WebElement contactUs_form_note;

    @FindBy (xpath = "//*[@class='contact-form']//h2[@class='title text-center']")
    public static WebElement contactUs_getInTouch;

    @FindBy (xpath = "//*[@class='contact-info']//*[@class='title text-center']")
    public static WebElement contactUs_getFeedback_email;

    @FindBy (xpath = "//*[@class='contact-info']//address")
    public static WebElement getContactUs_getFeedback_email_content;

    public ContactUs(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
