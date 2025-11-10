package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


import java.util.List;

public class Cart {

    @FindBy(xpath = "//*[@class='nav navbar-nav']/li[3]")
    public WebElement Cart_Link;

    @FindBy(id = "empty_cart")
    public WebElement emptyCartMessage;

    @FindBy(className = "pull-left")
    public WebElement footer_text;

    @FindBy(xpath = "//li[contains(@class, 'active')]")
    public  WebElement breadcrumb_shoppingCart;

    @FindBy(css = ".btn.btn-default.check_out")
    public  WebElement cart_checkout;

    @FindBy(css = "#cart_info_table tbody tr")
    public  List<WebElement> cartItems;

    @FindBy(xpath = "//*[@class='text-center']/a[@href='/login']")
    public  WebElement cart_signup_login;

    @FindBy(className = "active")
    public  WebElement cart_breadcrumb;

    @FindBy(xpath = "//*[@data-qa='create-account']")
    public WebElement create_account;

    @FindBy(xpath = "//*[@class='nav navbar-nav']/li[10]")
    public  WebElement logged_in_as_button;

    @FindBy(xpath = "//*[@class='table table-condensed']/tbody/tr")
    public  List<WebElement> table_contents;

    @FindBy(className = "form-control")
    public  WebElement cart_form;

    @FindBy(className = "name-on-card")
    public  WebElement name_on_card;

    @FindBy(css = ".form-control.card-number")
    public  WebElement card_number;

    @FindBy(css = ".form-control.card-expiry-month")
    public  WebElement  expiry_month;

    @FindBy (css = ".form-control.card-cvc")
    public  WebElement card_cvc;

    @FindBy (css = ".form-control.card-expiry-year")
    public  WebElement expiry_year;

    @FindBy(id = "submit")
    public  WebElement submit_card;

    @FindBy(xpath = "//*[@data-qa='order-placed']")
    public  WebElement order_placed;

    @FindBy(xpath = "//*[@class='nav navbar-nav']/li[5]")
    public  WebElement delete_account;

    @FindBy(xpath = "//*[@data-qa='account-deleted']")
    public  WebElement account_deleted;

    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public  WebElement continue_button;

    @FindBy (className = "description")
    public  WebElement description_placeholder;

    @FindBy (className = "price")
    public  WebElement price_placeholder;

    @FindBy (className = "quantity")
    public  WebElement quantity_placeholder;

    @FindBy (className = "total")
    public  WebElement total_placeholder;

    @FindBy(className = "cart_quantity")
    public  WebElement cart_quantity_value;

    @FindBy(className = "cart_price")
    public  WebElement single_item_value;

    @FindBy(className = "cart_quantity_delete")
    public  WebElement remove_product;

    @FindBy(className = "modal-content")
    public  WebElement checkout_login_popup;

    @FindBy(className = "modal-header")
    public  WebElement checkout_popup_header;

    @FindBy(className = "modal-body")
    public  WebElement checkout_popup_body;

    @FindBy(className = "modal-footer")
    public  WebElement checkout_popup_footer;

    @FindBy(id = "address_delivery")
    public  WebElement delivery_address;

    public Cart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
