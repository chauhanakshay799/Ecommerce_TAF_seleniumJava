package pagesStep;

import WebDriverCustomise.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.ApiList;

public class ApiListStepDefs {

    public WebDriver  driver;
    public ApiList apiList;

    public ApiListStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.apiList = new ApiList(driver);
    }
}
