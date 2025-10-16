package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class products extends BaseTest {

    @FindBy(id = "sale_image")
    public static WebElement Sale_image;

    @FindBy(id = "search_product")
    public static WebElement Search_Product;

    @FindBy (css = ".title.text-center")
    public static WebElement All_Product_Title;

    @FindBy(xpath = "//div[contains(@class,'productinfo') and contains(@class,'text-center')]/p")
    public static List<WebElement> Product_Details_shirt;

    @FindBy(css = ".title.text-center")
    public static WebElement Searched_product_title;

    @FindBy( css = "nav.nav-pills.nav-justified")
    public static List<WebElement> View_product_button;

    @FindBy(xpath = "//div[contains(@class,'productinfo') and contains(@class,'text-center')]//a[contains(@class,'add-to-cart')]")
    public static List<WebElement> AddToCart_button_default;

    @FindBy(xpath = "//div[contains(@class,'product-overlay')]//a[contains(@class,'add-to-cart')]")
    public static List<WebElement> AddToCart_button_overlay;

    @FindBy(xpath = "//div[contains(@class,'productinfo') and contains(@class,'text-center')]/h2")
    public static List <WebElement> Product_price_default;

    @FindBy(xpath = "//div[contains(@class,'productinfo') and contains(@class,'text-center')]/p")
    public static List <WebElement> Product_description_default;

    @FindBy(xpath = "//div[contains(@class,'overlay-content')]//h2")
    public static List <WebElement> Product_price_overlay;

    @FindBy(xpath = "//div[contains(@class,'overlay-content')]//p")
    public static List <WebElement> Product_description_overlay;

    @FindBy (xpath = "//div[contains(@class, 'productinfo') and contains(@class, 'text-center')]/img")
    public static List<WebElement> Product_image;

    @FindBy (className = "modal-content")
    public static WebElement AddToCart_success_popup;

    @FindBy (className = "modal-body")
    public static WebElement AddToCart_success_popup_message;

    @FindBy (css = ".btn.btn-success.close-modal.btn-block\n")
    public static WebElement AddToCart_success_popup_continueShopping;



}
