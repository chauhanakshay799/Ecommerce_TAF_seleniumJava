package pagesStep;

import Utility.UtilityFunctions;
import WebDriverCustomise.WebDriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.TestCaseList;

public class TestCaseListStepDefs extends TestCaseList {

    private final WebDriver driver = WebDriverManager.getDriver();
    UtilityFunctions utilFunc = new UtilityFunctions(driver);


    public TestCaseListStepDefs(WebDriver driver) {
        super(driver);
    }

    @And("Click on 'Test Cases' button")
    public void take_to_testcase_page () {
        testCase_page_button.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verify_user_is_navigated_to_testcase_pages_successfully() {
        utilFunc.pageLoadedFull();
        Assert.assertTrue(driver.getTitle().trim().contains("Test Cases"));
    }

}
