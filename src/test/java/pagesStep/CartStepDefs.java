package pagesStep;

import Utility.UtilityFunctions;
import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Cart;
import pages.LoginSignup;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CartStepDefs extends Cart{

    private final WebDriver driver = WebDriverManager.getDriver();
    UtilityFunctions utilFunc = new UtilityFunctions(driver);
    LoginSignup loginSignup = new LoginSignup(driver);

    public CartStepDefs(WebDriver driver) {
        super(driver);
    }

    @And("Click 'Cart' button")
    public void clickCartButton() {
        Cart_Link.click();
    }

    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        utilFunc.pageLoadedFull();
        while (!footer_text.isDisplayed()){
            new Actions(driver).sendKeys(Keys.DOWN).build().perform();
        }
    }

    @And("Verify that cart page is displayed")
    public void verifyCartPageIsDisplayed() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(cart_breadcrumb.getText().equalsIgnoreCase("Shopping Cart"));
    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        cart_checkout.click();
    }

    @And("Click 'Register / Login' button")
    public void cartClickRegisterButton() {
        cart_signup_login.click();
    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
        loginSignup.signup_name_box.sendKeys("auto");
        loginSignup.signup_email_box.sendKeys("auto@sel.com");
        loginSignup.signup_button.click();

        utilFunc.pageLoadedFull();
        loginSignup.genderMale.click();
        loginSignup.custName.sendKeys("auto");
        loginSignup.custEmailAddress.sendKeys("auto@sel.com");
        loginSignup.custPassword.sendKeys("Iforgot@123");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("23/12/1995", formatter);

        String day = String.valueOf(date.getDayOfMonth());
        String year = String.valueOf(date.getYear());
        String monthFormatted = date.getMonth().name().substring(0, 1).toUpperCase()
                + date.getMonth().name().substring(1).toLowerCase();

        utilFunc.dropDownGeneric(loginSignup.day_of_birth, day);
        utilFunc.dropDownGeneric(loginSignup.month_of_birth, monthFormatted);
        utilFunc.dropDownGeneric(loginSignup.year_of_birth, year);

        loginSignup.addressFirstName.sendKeys("Akshay");
        loginSignup.addressLastName.sendKeys("Chauhan");
        loginSignup.companyName.sendKeys("XYZ ltd");
        loginSignup.companyAddress1.sendKeys("Street 24/7, 101");
        loginSignup.companyAddress2.sendKeys("Barcelona");
        utilFunc.dropDownGeneric(loginSignup.companyCountry, "Spain");
        loginSignup.companyState.sendKeys("Barcelona");
        loginSignup.companyCity.sendKeys("Barcelona");
        loginSignup.companyZipcode.sendKeys("08029");
        loginSignup.mobile_number.sendKeys("98765434210");

        create_account.click();
    }

    @And("Verify 'ACCOUNT CREATED!' and click 'Continue' button")
    public void clickContinueButton() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(loginSignup.account_created.isDisplayed());
        loginSignup.continue_account_created.click();
    }

    @And("Verify 'Logged in as username' at top")
    public void verifyLoggedInAsUsernameAtTop() {
        Assert.assertTrue(logged_in_as_button.getText().contains("auto"));
    }

    @And("Click 'Proceed To Checkout' button")
    public void clickProceedToCheckoutButton() {
        utilFunc.pageLoadedFull();
        cart_checkout.click();
    }

    @And(" Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(delivery_address.getText().length() > 30);
        Assert.assertEquals(table_contents.size(), 2);
    }

    @And("Enter description in comment text area and click 'Place Order'")
    public void enterDescriptionInCommentTextAreaAndClick() {
        cart_form.sendKeys("Looks lal good lets go now");
        cart_checkout.click();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsOnCardOnCard() {
        utilFunc.pageLoadedFull();
        name_on_card.sendKeys("Akshay Chauhan");
        card_number.sendKeys("1234 5678 8901 1234");
        card_cvc.sendKeys("311");
        expiry_month.sendKeys("10");
        expiry_year.sendKeys("2050");
    }

    @And("Click 'Pay and Confirm Order' button")
    public void clickPayAndConfirmOrderButton() {
        submit_card.click();
    }

    @And("Verify success message 'Your order has been placed successfully!'")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Assert.assertTrue(order_placed.getText().toLowerCase().contains("order placed!"));
    }

    @And("Click 'Delete Account' button")
    public void clickDeleteAccountButton() {
        utilFunc.pageLoadedFull();
        delete_account.click();
    }

    @And("Verify ACCOUNT DELETED! and click Continue button")
    public void accountDeleteConfirm() {
        Assert.assertTrue(account_deleted.getText().equalsIgnoreCase("Account Deleted!"));
        continue_button.click();
    }

}
