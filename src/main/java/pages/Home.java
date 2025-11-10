package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class Home {

    @FindBy(xpath = "//*[@class='nav navbar-nav']/li[1]")
    public  WebElement Home_button;

    @FindBy(className = "features_items")
    public  WebElement Featured_item_tiles;

    @FindBy(className = "recommended_items")
    public  WebElement Recommended_item_tiles;

    @FindBy(xpath = "//*[@class =\"left-sidebar\"]/h2")
    public  WebElement Category_title;

    @FindBy(xpath = "//*[@class =\"brands_products\"]/h2")
    public  WebElement Brands_title;

    @FindBy(css = ".right.control-carousel.hidden-xs")
    public  WebElement Top_carousel_right_click;

    @FindBy(css = ".left.control-carousel.hidden-xs")
    public  WebElement Top_carousel_left_click;

    @FindBy(className = "carousel-indicators")
    public  WebElement carousel_controller;

    @FindBy(xpath = "//a[@href='#Men']")
    public  WebElement Men_dropdown;

    @FindBy(xpath = "//a[@href='#Women']")
    public  WebElement Woman_dropdown;

    @FindBy(xpath = "//a[@href='#Kids']")
    public  WebElement Kids_dropdown;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[1]")
    public  WebElement Brand_Polo;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[2]")
    public  WebElement Brand_HnM;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[3]")
    public  WebElement Brand_Madame;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[4]")
    public  WebElement Brand_MastnHarbour;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[5]")
    public  WebElement Brand_Babyhug;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[6]")
    public  WebElement Brand_Allen_Solly;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[7]")
    public  WebElement Brand_Kookie_Kids;

    @FindBy(xpath = "//*[@class=\"nav nav-pills nav-stacked\"]/li[8]")
    public  WebElement Brand_Biba;

    @FindBy(id = "scrollUp")
    public  WebElement scrollUp;

    @FindBy(id = "susbscribe_email")
    public  WebElement subscribe_email;

    @FindBy(id = "subscribe")
    public  WebElement subscribe;

    @FindBy(xpath = "//div[@id='success-subscribe']/div")
    public  WebElement success_subscribe;

    @FindBy(xpath = "(//*[@class='row'])[5]")
    public  WebElement copyright_text;

    @FindBy(css = ".logo.pull-left")
    public  WebElement logo;

    @FindBy(xpath = "//div[@class='item active']//a[@class='test_cases_list']")
    public  WebElement top_carousel_test_cases_list;

    @FindBy(xpath = "//div[@class='item active']//a[@class='apis_list']")
    public  WebElement top_carousel_api_list;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[1]")
    public  WebElement Women_subcategory_dropdown;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[2]")
    public  WebElement Men_subcategory_dropdown;

    @FindBy(xpath = "//*[@id=\"Women\"]/div/ul/li[3]")
    public  WebElement Kids_subcategory_dropdown;

    @FindBy(xpath = "//div[@class='single-widget']/h2")
    public  WebElement Subscription_placeholder;

    public Home(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
