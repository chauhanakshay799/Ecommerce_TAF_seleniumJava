package pagesStep;

import WebDriverCustomise.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.Home;

public class HomeStepDefs {

    WebDriver  driver;
    public Home home;

    public HomeStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.home = new Home(driver);
    }
}
