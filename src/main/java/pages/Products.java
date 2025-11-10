package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import java.util.List;

public class Products {

    @FindBy(xpath = "//*[@class='nav navbar-nav']/li[2]")
    public WebElement Products_Link;

    @FindBy(id = "sale_image")
    public WebElement Sale_image;

    @FindBy (xpath = "")
    public WebElement Product_Name;

    @FindBy (id = "quantity")
    public WebElement getProductDetailpage_quantity;

    @FindBy(id = "search_product")
    public WebElement Search_Product;

    @FindBy (xpath = "//*[@class='features_items']/div[@class='col-sm-4']")
    public List<WebElement> Products_List;

    @FindBy(id = "submit_search")
    public WebElement Submit_Search;

    @FindBy (css = ".title.text-center")
    public WebElement All_Product_Title;

    @FindBy(xpath = "//div[contains(@class,'productinfo') and contains(@class,'text-center')]/p")
    public List<WebElement> Product_Details_shirt;

    @FindBy(css = ".title.text-center")
    public WebElement Searched_product_title;

    @FindBy( css = "nav.nav-pills.nav-justified")
    public List<WebElement> View_product_button;

    @FindBy(xpath = "//div[contains(@class,'productinfo') and contains(@class,'text-center')]//a[contains(@class,'add-to-cart')]")
    public List<WebElement> AddToCart_button_default;

    @FindBy(xpath = "//div[contains(@class,'product-overlay')]//a[contains(@class,'add-to-cart')]")
    public List<WebElement> AddToCart_button_overlay;

    @FindBy(xpath = "//div[contains(@class,'productinfo') and contains(@class,'text-center')]/h2")
    public List <WebElement> Product_price_default;

    @FindBy(xpath = "//div[contains(@class,'productinfo') and contains(@class,'text-center')]/p")
    public List <WebElement> Product_description_default;

    @FindBy(xpath = "//div[contains(@class,'overlay-content')]//h2")
    public List <WebElement> Product_price_overlay;

    @FindBy(xpath = "//div[contains(@class,'overlay-content')]//p")
    public List <WebElement> Product_description_overlay;

    @FindBy (xpath = "//div[contains(@class, 'productinfo') and contains(@class, 'text-center')]/img")
    public List<WebElement> Product_image;

    @FindBy(css = ".btn.btn-default.cart")
    public WebElement Product_add_to_cart_button;

    @FindBy (className = "modal-content")
    public WebElement AddToCart_success_popup;

    @FindBy (className = "modal-body")
    public WebElement AddToCart_success_popup_message;

    @FindBy(xpath = "//*[@class='product-information']/h2")
    public WebElement productDetailPage_name;

    @FindBy(xpath = "//*[@class='product-information']/span/span")
    public WebElement productDetailPage_price;

    @FindBy(css = ".btn.btn-success.close-modal.btn-block")
    public WebElement AddToCart_success_popup_continueShop;

    @FindBy(xpath = "//*[@class= 'text-center']/a")
    public WebElement AddToCart_success_popup_viewCart;

    @FindBy(xpath = "//*[@class='product-information']/p")
    public List <WebElement> productDetailPage_category_price_stock_brand_condition;

    @FindBy(xpath = "//table[@id='cart_info_table']/tbody/tr")
    public List<WebElement> productDetailPage_viewCart_table;

    @FindBy (xpath = ".//td[@class='cart_price']/p")
    public WebElement productDetailPage_cart_price;

    @FindBy (xpath = ".//td[@class='cart_quantity']/button")
    public List<WebElement> getProductDetailPage_quantityText;

    @FindBy (xpath = ".//td[@class='cart_total']/p")
    public List<WebElement>  getProductDetailPage_priceTotal;

    public Products(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
