package pagesStep;

import WebDriverCustomise.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.Cart;

public class CartStepDefs {

    public WebDriver driver;
    public Cart cart;


    public CartStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.cart = new Cart(driver);
    }


}
