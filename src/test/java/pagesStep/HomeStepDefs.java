package pagesStep;

import Utility.UtilityFunctions;
import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.Home;

public class HomeStepDefs {

    WebDriver  driver;
    public Home home;
    UtilityFunctions utilFunc = new UtilityFunctions(driver);



    public HomeStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.home = new Home(driver);
    }

    @Given("Navigate to url {string}")
    public void i_navigate_to_url(String url) {
        driver.get(url);
        utilFunc.pageLoadedFull();
    }

    @And("Verify that home page is visible successfully")
    public void verify_home_page_is_visible() {
        utilFunc.pageLoadedFull();
    }



}
