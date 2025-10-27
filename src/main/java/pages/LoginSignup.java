package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginSignup {

    @FindBy(xpath = "//*[@data-qa='signup-button']")
    public  static WebElement signup_button;

    @FindBy(xpath = "//*[@data-qa=\"login-email\"]")
    public  WebElement login_email_box;

    @FindBy(xpath = "//*[@data-qa=\"login-password\"]")
    public  WebElement login_password_box;

    @FindBy(xpath = "//*[@data-qa=\"login-button\"]")
    public  WebElement login_button;

    @FindBy(xpath = "//*[@data-qa=\"signup-name\"]")
    public  WebElement signup_name_box;

    @FindBy(xpath = "//*[@data-qa=\"signup-email\"]")
    public  WebElement signup_email_box;

    @FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/li[4]")
    public  WebElement logout_button;

    @FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/li[4]")
    public  WebElement signup_login;

    @FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/li[10]")
    public  WebElement loggedin_user_name;

    @FindBy(xpath = "//*[@class=\"nav navbar-nav\"]/li[5]")
    public  WebElement delete_account;

    @FindBy(xpath = "//h2[@class='title text-center']/b")
    public  WebElement account_deleted;

    @FindBy(xpath = "//a[@href='/login']")
    public  WebElement login_link;

    @FindBy(xpath = "//div[@class='signup-form']/h2")
    public WebElement signup_box_title;

    @FindBy(xpath = "//div[@class='login-form']/h2[@class='title text-center']/b")
    public WebElement signup_form_title;

    @FindBy(id = "id_gender1")
    public  WebElement genderMale;

    @FindBy(id = "id_gender1")
    public  WebElement genderFemale;

    @FindBy(id = "name")
    public  WebElement custName;

    @FindBy(id = "email")
    public  WebElement custEmailAddress;

    @FindBy(id = "password")
    public  WebElement custPassword;

    @FindBy(id = "days")
    public  WebElement day_of_birth;

    @FindBy(id = "months")
    public  WebElement month_of_birth;

    @FindBy(id = "years")
    public  WebElement year_of_birth;

    @FindBy(id = "newsletter")
    public  WebElement newsletter;

    @FindBy(id = "optin")
    public  WebElement optUpdatesMail;

    @FindBy (id ="first_name")
    public  WebElement addressFirstName;

    @FindBy (id ="last_name")
    public  WebElement addressLastName;

    @FindBy (id ="company")
    public  WebElement companyName;

    @FindBy (id ="address1")
    public  WebElement companyAddress1;

    @FindBy (id ="address2")
    public  WebElement companyAddress2;

    @FindBy (id ="country")
    public  WebElement companyCountry;

    @FindBy(id = "city")
    public  WebElement companyCity;

    @FindBy(id = "state")
    public  WebElement companyState;

    @FindBy(id = "zipcode")
    public  WebElement companyZipcode;

    @FindBy(id = "mobile_number")
    public  WebElement mobile_number;

    @FindBy(linkText = "Create Account")
    public  WebElement create_account;

    @FindBy (xpath = "//div[@class ='col-sm-9 col-sm-offset-1']/h2")
    public  WebElement create_account_title;

    @FindBy (css = ".btn.btn-primary")
    public  WebElement continue_button;

    @FindBy(xpath = "//div[@class='login-form']/h2")
    public  WebElement login_form_title;

    @FindBy(xpath = "//input[@data-qa='login-email']")
    public  WebElement login_email_box;

    public LoginSignup(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
