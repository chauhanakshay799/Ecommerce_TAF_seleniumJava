package Utility;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.Logger;

import java.time.Duration;


public class UtilityFunctions {

    WebDriver driver;
    public JavascriptExecutor js;
    private static final Logger logger = LogManager.getLogger(UtilityFunctions.class);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));



    public UtilityFunctions(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public WebElement waitUntilVisible(WebElement element, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForPageReadyState() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(
                webDriver -> ((JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState").equals("complete")
        );
    }

    public void dropDownGeneric(WebElement element, String value) {
        new Select(element).selectByVisibleText(value);
    }

    public void pageLoadedFull() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        wait.until(webDriver ->
                js.executeScript("return document.readyState").toString().equals("complete")
        );
    }

    public void acceptAlertBox() {
        try {
            logger.debug("Waiting for alert to appear...");
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            logger.info("Alert found with message: {}", alert.getText());
            alert.accept();
            logger.info("Alert accepted successfully.");
        } catch (Exception e) {
            logger.warn("No alert present or error while accepting alert.", e);
        }
    }
}
