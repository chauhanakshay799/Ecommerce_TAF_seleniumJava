package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;


import java.util.List;

public class Cart {

    @FindBy(id = "empty_cart")
    public static WebElement emptyCartMessage;

    @FindBy(xpath = "//li[contains(@class, 'active')]")
    public static WebElement breadcrumb_shoppingCart;

    @FindBy(css = "btn.btn-default.check_out")
    public static WebElement cart_checkout;

    @FindBy(css = "#cart_info_table tbody tr")
    public static List<WebElement> cartItems;

    @FindBy (className = "image")
    public static WebElement cartImage_placeholder;

    @FindBy (className = "description")
    public static WebElement description_placeholder;

    @FindBy (className = "price")
    public static WebElement price_placeholder;

    @FindBy (className = "quantity")
    public static WebElement quantity_placeholder;

    @FindBy (className = "total")
    public static WebElement total_placeholder;

    @FindBy(className = "cart_quantity")
    public static WebElement cart_quantity_value;

    @FindBy(className = "cart_price")
    public static WebElement single_item_value;

    @FindBy(className = "cart_quantity_delete")
    public static WebElement remove_product;

    @FindBy(className = "modal-content")
    public static WebElement checkout_login_popup;

    @FindBy(className = "modal-header")
    public static WebElement checkout_popup_header;

    @FindBy(className = "modal-body")
    public static WebElement checkout_popup_body;

    @FindBy(className = "modal-footer")
    public static WebElement checkout_popup_footer;

    @FindBy(id = "address_delivery")
    public static WebElement delivery_address;


    public Cart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
