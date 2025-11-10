package pagesStep;

import Utility.UtilityFunctions;
import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.Products;

import java.util.List;

public class ProductsStepDefs extends Products {

    private final WebDriver driver = WebDriverManager.getDriver();
    UtilityFunctions utilFunc = new UtilityFunctions(driver);

    public ProductsStepDefs(WebDriver driver) {
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
        Assert.assertTrue(View_product_button.stream().anyMatch(WebElement::isDisplayed), "Product list not visible!");
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

    @And("Enter product name {} in search input and click search button")
    public void enter_product_name_in_search_input_and_click_search_button(String productName) {
        Search_Product.sendKeys(productName);
        Submit_Search.click();
    }

    @And("Verify 'SEARCHED PRODUCTS' is visible")
    public void verify_searched_products_is_visible() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(Searched_product_title.getText().equalsIgnoreCase("Searched Products"));
    }

    @And("Verify all the products related to search are visible")
    public void verify_all_products_related_to_search_are_visible() {
        int index = 1;
        for (WebElement element : Products_List) {
            Assert.assertTrue(element.isDisplayed(), "Product at index " + index + " is not visible: " + element.getText());
            index++;
        }
    }

    @And("Hover over first product and click 'Add to cart'")
    public void hover_over_first_product_and_click_add_to_cart() {
        utilFunc.hoverAction(Products_List.getFirst());
        AddToCart_button_overlay.getFirst().click();
    }

    @And("Click 'Continue Shopping' button")
    public void click_continue_shopping_button() {
        AddToCart_success_popup_continueShop.click();
    }

    @And("Hover over second product and click 'Add to cart'")
    public void hover_over_second_product_and_click_add_to_cart() {
        utilFunc.hoverAction(Products_List.get(1));
        AddToCart_button_overlay.get(1).click();
    }

    @And("Click 'View Cart' button")
    public void click_view_cart_button() {
        AddToCart_success_popup_viewCart.click();
    }

    @And("Verify both products are added to Cart")
    public void verify_both_products_are_added_to_Cart() {
        utilFunc.pageLoadedFull();
        Assert.assertEquals(productDetailPage_viewCart_table.size(), 2, "Product list differ than 2 items!");
    }

    @And("Verify their prices, quantity and total price")
    public void verify_their_prices_and_total_price() {
        //testcase12 last step
    }

    @And("Click on 'View Product' for any product on homepage")
    public void click_on_view_product_of_any_product() {
        View_product_button.get((int)(Math.random() * 10)).click();
    }

    @And("Verify product detail is opened")
    public void verify_product_detail_is_opened() {
        utilFunc.pageLoadedFull();
        driver.getCurrentUrl().trim().contains("product_details");
    }

    @And("Increase quantity to 4")
    public void increase_quantity_to_4() {
        getProductDetailpage_quantity.clear();
        getProductDetailpage_quantity.sendKeys("4");
    }

    @And("Click 'Add to cart' button")
    public void click_add_to_cart_button() {
        Product_add_to_cart_button.click();
    }

    @And("Verify that product is displayed in cart page with exact quantity")
    public void verify_product_with_exact_quantity() {
        utilFunc.pageLoadedFull();
        Assert.assertEquals(getProductDetailPage_quantityText.getFirst().getText(), "4");
    }

    @And("Add products to cart")
    public void add_products_to_cart() {

    }


}