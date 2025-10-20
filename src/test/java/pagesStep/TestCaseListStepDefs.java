package pagesStep;

import WebDriverCustomise.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.TestCaseList;

public class TestCaseListStepDefs {

    WebDriver driver;
    public TestCaseList testcaselist;

    public TestCaseListStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.testcaselist = new TestCaseList(driver);
    }
}
