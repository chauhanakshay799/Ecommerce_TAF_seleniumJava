package pagesStep;

import Utility.UtilityFunctions;
import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pages.LoginSignup;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LoginSignupStepDefs extends LoginSignup{


    private final WebDriver driver = WebDriverManager.getDriver();
    UtilityFunctions utilFunc = new UtilityFunctions(driver);


    public LoginSignupStepDefs(WebDriver driver) {
        super(driver);
    }


    @And("Click on Signup / Login button")
    public void click_on_signup_button() {
            login_link.click();
    }

    @And("Verify 'New User Signup!' is visible")
    public void verify_is_visible(String title) {
        Assert.assertEquals(signup_box_title.getText(), title);
    }

    @And("Enter name {} and email address {}")
    public void enter_name_and_email_address(String name, String email) {
        utilFunc.waitUntilVisible(signup_name_box,5).sendKeys(name);
        utilFunc.waitUntilVisible(signup_email_box,5).sendKeys(email);
    }

    @And("Click 'Signup' button")
    public void click_signup_button() {
        utilFunc.waitUntilVisible(signup_button,5).click();
    }

    @And("Verify that {} is visible")
    public void verify_that_account_information_is_visible( String title) {
        utilFunc.waitForPageReadyState();
        Assert.assertTrue(signup_form_title.getText().equalsIgnoreCase("title"));
    }

    @And("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title(String title, String name, String email, String password, String date_of_birth) {
        genderMale.click();
        custName.sendKeys(name);
        custEmailAddress.sendKeys(email);
        custPassword.sendKeys(password);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(date_of_birth, formatter);

        String day = String.valueOf(date.getDayOfMonth());
        String year = String.valueOf(date.getYear());
        String monthFormatted = date.getMonth().name().substring(0, 1).toUpperCase()
                + date.getMonth().name().substring(1).toLowerCase();

        utilFunc.dropDownGeneric(day_of_birth, day);
        utilFunc.dropDownGeneric(month_of_birth, monthFormatted);
        utilFunc.dropDownGeneric(year_of_birth, year);
    }

    @And("Select checkbox 'Sign up for our newsletter!'")
    public void select_signup_checkbox () {
        newsletter.click();
    }

    @And("Select checkbox 'Receive special offers from our partners!'")
    public void select_receive_special_offers_from_our_partners() {
        optUpdatesMail.click();
    }

    @And("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fill_details(String firstName, String lastName, String company, String address, String address2,
                             String country, String state, String city, String zipcode, String mobileNumber) {

        addressFirstName.sendKeys(firstName);
        addressLastName.sendKeys(lastName);
        companyName.sendKeys(company);
        companyAddress1.sendKeys(address);
        companyAddress2.sendKeys(address2);
        utilFunc.dropDownGeneric(companyCountry, country);
        companyState.sendKeys(state);
        companyCity.sendKeys(city);
        companyZipcode.sendKeys(zipcode);
        mobile_number.sendKeys(mobileNumber);

    }

    @And("Click 'Create Account button'")
    public void click_create_account_button() {
        create_account.click();
    }

    @And("Verify that {} is visible")
    public void account_created (String title) {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(create_account_title.getText().trim().equalsIgnoreCase(title));
    }

    @And("Click 'Continue' button")
    public void account_created_continue() {
        continue_button.click();
    }

    @And("Verify that 'Logged in as username' is visible")
    public void verify_logged_in_as_username_is_visible() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(loggedin_user_name.isDisplayed());
    }

    @And("Click 'Delete Account' button")
    public void click_delete_account_button() {
        delete_account.click();
    }

    @And("Verify that 'ACCOUNT DELETED!' is visible")
    public void verify_account_deleted() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(account_deleted.getText().trim().equalsIgnoreCase("ACCOUNT DELETED!"));
    }

    @And("Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button")
    public void click_account_deleted_continue() {
//        utilFunc.pageLoadedFull();
//        Assert.assertTrue(account_deleted.getText().trim().equalsIgnoreCase("ACCOUNT DELETED!"))
//        (Checking if the function call will work here)
        verify_account_deleted();
        continue_button.click();
    }

    @And("Click on 'Signup / Login' button")
    public void signup_or_login_button() {
        signup_login.click();
    }

    @And("Verify 'Login to your account' is visible")
    public void login_title() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(login_form_title.getText().trim().equalsIgnoreCase("Login to your account"));
    }

    @And("Enter correct email address {} and password {}")
    public void enter_email_address_and_password(String email, String password) {
            login_email_box.sendKeys(email);
            login_password_box.sendKeys(password);
    }

    @And("Enter incorrect email address {} and password {}")
    public void enter_email_address_and_password_wrong(String email, String password) {
        enter_name_and_email_address(email, password);
    }

    @And("Click 'login' button")
    public void click_login_button() {
        login_button.click();
    }

    @And("Verify error 'Your email or password is incorrect!' is visible")
    public void verify_error_your_email_or_password_is_incorrect() {
        Assert.assertTrue(login_form_error_message.getText().trim().equalsIgnoreCase("Your email or password is incorrect!"));
    }

    @And("Click 'Logout' button")
    public void click_logout_button() {
        logout_button.click();
    }

    @And("Verify that user is navigated to login page")
    public void verify_user_navigated_to_login_page() {
        assert driver != null;
        Assert.assertTrue("https://www.automationexercise.com/login".equalsIgnoreCase(driver.getCurrentUrl()));
    }

    @And("Verify 'New User Signup!' is visible")
        public void verify_new_user_signup_is_visible() {
    }

    @And("Enter name {} and already registered email address {}")
    public void enter_name_and_already_registered_email_address(String name, String email) {
        signup_name_box.sendKeys(name);
        signup_email_box.sendKeys(email);
    }

    @And("Verify error 'Email Address already exist!' is visible")
    public void verify_error_email_address_already_exist() {
        Assert.assertTrue(signup_form_error_message.getText().trim().equalsIgnoreCase("Email Address already exist!"));
    }




}
