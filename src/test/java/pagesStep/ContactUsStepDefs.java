package pagesStep;

import Utility.UtilityFunctions;
import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ContactUs;

public class ContactUsStepDefs extends ContactUs{

    private final WebDriver driver = WebDriverManager.getDriver();
    UtilityFunctions utilFunc = new UtilityFunctions(driver);


    public ContactUsStepDefs(WebDriver driver) {
        super(driver);
    }


    @And("Click on 'Contact Us' button")
    public void click_on_contact_us_button() {
       contact_us_link.click();
    }

    @And("Verify 'GET IN TOUCH' is visible")
    public void verify_get_intouch_is_visible() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(contactUs_getInTouch.isDisplayed());
        Assert.assertTrue(contactUs_getInTouch.getText().trim().equalsIgnoreCase("GET IN TOUCH"));
    }

    @And("Enter name {}, email {}, subject {} and message {}")
    public void enter_name_email_subject_and_message(String name, String email, String subject, String message) {
        contactUs_name.sendKeys(name);
        contactUs_email.sendKeys(email);
        contactUs_subject.sendKeys(subject);
        contactus_message.sendKeys(message);
    }

    @And("Upload file")
    public void upload_file() {
        //need to think about it and its edgecases
    }

    @And("Click 'Submit' button")
    public void click_submit_button() {
        contactUs_form_submit.click();
    }

    @And("Click OK button")
    public void click_ok_button() {
        utilFunc.acceptAlertBox();
    }

    @And("Verify success message 'Success! Your details have been submitted successfully.' is visible")
    public void verify_success_message_is_visible() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(contactUs_message_sent_info.isDisplayed());
        Assert.assertTrue(contactUs_message_sent_info.getText().trim().equalsIgnoreCase("Success! Your details have been submitted successfully."));
    }

    @And("Click 'Home' button and verify that landed to home page successfully")
    public void click_home_button_and_verify_home_page_successfully() {
        utilFunc.pageLoadedFull();
        contactUs_homeButton_messagesent.click();
        utilFunc.pageLoadedFull();
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Automation Exercise"));
    }





}
