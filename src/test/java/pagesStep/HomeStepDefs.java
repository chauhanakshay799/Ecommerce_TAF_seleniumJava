package pagesStep;

import Utility.UtilityFunctions;
import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Home;

public class HomeStepDefs extends Home{

    private final WebDriver driver = WebDriverManager.getDriver();
    UtilityFunctions utilFunc = new UtilityFunctions(driver);

    public HomeStepDefs(WebDriver driver) {
        super(driver);
    }

    @Given("Navigate to url {string}")
    public void i_navigate_to_url(String url) {
        driver.get(url);
        utilFunc.pageLoadedFull();
    }

    @And("Verify that home page is visible successfully")
    public void verify_home_page_is_visible() {
        utilFunc.pageLoadedFull();
    }

    @And("Scroll down to footer")
    public void scroll_down_to_footer() {
        while (!Subscription_placeholder.isDisplayed()) {
            new Actions(driver).keyDown(Keys.PAGE_DOWN).perform();
            utilFunc.pageLoadedFull();
        }
    }

    @And("Verify text 'SUBSCRIPTION'")
    public void verify_text_subscription() {
        Assert.assertTrue(Subscription_placeholder.getText().trim().equalsIgnoreCase("SUBSCRIPTION"));
    }

    @And("Enter email address {} in input and click arrow button")
    public void enter_email_address_in_input_and_click_arrow_button(String email) {
        subscribe_email.clear();
        subscribe_email.sendKeys(email);
        subscribe.click();
    }

    @And("Verify success message 'You have been successfully subscribed!' is visible")
    public void verify_success_message_is_visible() {
        Assert.assertTrue(success_subscribe.getText().trim().equalsIgnoreCase("You have been successfully subscribed!"));
    }







}
