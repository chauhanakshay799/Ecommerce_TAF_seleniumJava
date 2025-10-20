package pagesStep;

import WebDriverCustomise.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.Products;

public class ProductsStepDefs {

    WebDriver driver;
    public Products products;

    public  ProductsStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.products = new Products(driver);
    }
}
