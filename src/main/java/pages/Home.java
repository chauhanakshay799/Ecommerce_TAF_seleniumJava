package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class Home {

    @FindBy(xpath = "//*[@class='nav navbar-nav']/li[1]")
    public static WebElement Home_button;

    @FindBy(className = "features_items")
    public static WebElement Featured_item_tiles;

    @FindBy(className = "recommended_items")
    public static WebElement Recommended_item_tiles;

    @FindBy(xpath = "//*[@class =\"left-sidebar\"]/h2")
    public static WebElement Category_title;

    @FindBy(xpath = "//*[@class =\"brands_products\"]/h2")
    public static WebElement Brands_title;

    @FindBy(css = ".right.control-carousel.hidden-xs")
    public static WebElement Top_carousel_right_click;

    @FindBy(css = ".left.control-carousel.hidden-xs")
    public static WebElement Top_carousel_left_click;

    @FindBy(className = "carousel-indicators")
    public static WebElement carousel_controller;

    @FindBy(xpath = "//a[@href='#Men']")
    public static WebElement Men_dropdown;

    @FindBy(xpath = "//a[@href='#Women']")
    public static WebElement Woman_dropdown;

    @FindBy(xpath = "//a[@href='#Kids']")
    public static WebElement Kids_dropdown;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[1]")
    public static WebElement Brand_Polo;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[2]")
    public static WebElement Brand_HnM;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[3]")
    public static WebElement Brand_Madame;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[4]")
    public static WebElement Brand_MastnHarbour;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[5]")
    public static WebElement Brand_Babyhug;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[6]")
    public static WebElement Brand_Allen_Solly;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[7]")
    public static WebElement Brand_Kookie_Kids;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[8]")
    public static WebElement Brand_Biba;

    @FindBy(id = "scrollUp")
    public static WebElement scrollUp;

    @FindBy(id = "susbscribe_email")
    public static WebElement susbscribe_email;

    @FindBy(id = "subscribe")
    public static WebElement subscribe;

    @FindBy(xpath = "(//*[@class='row'])[5]")
    public static WebElement copyright_text;

    @FindBy(css = ".logo.pull-left")
    public static WebElement logo;

    @FindBy(xpath = "//div[@class='item active']//a[@class='test_cases_list']")
    public static WebElement top_carousel_test_cases_list;

    @FindBy(xpath = "//div[@class='item active']//a[@class='apis_list']")
    public static WebElement top_carousel_api_list;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[1]")
    public static WebElement Women_subcategory_dropdown;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[2]")
    public static WebElement Men_subcategory_dropdown;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[3]")
    public static WebElement Kids_subcategory_dropdown;


    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
