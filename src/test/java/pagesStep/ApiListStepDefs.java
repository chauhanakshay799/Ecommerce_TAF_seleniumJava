package pagesStep;

import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.ApiList;

public class ApiListStepDefs {

    public WebDriver  driver;
    public ApiList apiList;

    public ApiListStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.apiList = new ApiList(driver);

    }






}
