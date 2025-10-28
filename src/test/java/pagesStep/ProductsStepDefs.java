package pagesStep;

import Utility.UtilityFunctions;
import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.Products;

public class ProductsStepDefs extends Products {

    private final WebDriver driver = WebDriverManager.getDriver();
    UtilityFunctions utilFunc = new UtilityFunctions(driver);

    public  ProductsStepDefs( WebDriver driver) {
        super(driver);
    }

    @And("Click on 'Products' button")
    public void click_on_products_button() {
        Products_Link.click();
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void navigated_to_all_products_page_successfully() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(driver.getTitle().trim().contains("All Products"));
        All_Product_Title.getText().equalsIgnoreCase("All Products");
    }

    @And("The products list is visible")
    public void the_products_list_is_visible() {
        Assert.assertFalse(View_product_button.isEmpty(), "No products found!");
        Assert.assertTrue(View_product_button.stream().anyMatch(WebElement::isDisplayed),"Product list not visible!");
    }

    @And("Click on 'View Product' of first product")
    public void click_on_view_product_of_first_product() {
        View_product_button.getFirst().click();
    }

    @And("User is landed to product detail page")
    public void user_is_landed_to_product_detail_page() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(driver.getTitle().trim().contains("Product Details"));
        Assert.assertTrue(driver.getCurrentUrl().trim().contains("product_details"));
    }

    @And("Verify that product details are visible: name, category, price, availability, condition, brand")
    public void verify_that_product_details_are_visible() {
        Assert.assertTrue(productDetailPage_category_price_stock_brand_condition.get(0).getText().contains("Category"));
        Assert.assertTrue(productDetailPage_category_price_stock_brand_condition.get(1).getText().contains("Price"));
        Assert.assertTrue(productDetailPage_category_price_stock_brand_condition.get(2).getText().contains("Availability"));
        Assert.assertTrue(productDetailPage_category_price_stock_brand_condition.get(3).getText().contains("Condition"));
        Assert.assertTrue(productDetailPage_category_price_stock_brand_condition.get(4).getText().contains("Brand"));
    }


}
