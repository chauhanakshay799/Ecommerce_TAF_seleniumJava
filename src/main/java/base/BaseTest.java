package base;

import WebDriverCustomise.WebDriverManager;
import WebDriverCustomise.WebdriverCapabilities;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import static org.slf4j.LoggerFactory.getLogger;


public class BaseTest {

    private static final Logger logger = getLogger(BaseTest.class);


    public WebDriver setup() {
        try {
            WebDriver driver = initialiseDriver();

            if (driver == null) {
                throw new IllegalStateException("WebDriver is null or already initialized.");
            }

            WebDriverManager.setDriver(driver);
            return driver;

        } catch (Exception e) {
            logger.error("Failed to initialize WebDriver: {}", e.getMessage(), e);
            throw new RuntimeException("WebDriver could not be initialized", e);
        }
    }

    private WebDriver initialiseDriver() {

        String browserName = "chrome"; //later change it property values fro mresource package
        String runEnvironment = "sandbox"; // check for versatality to be run in what env

        if (browserName == null || browserName.trim().isEmpty()) {
            logger.error("Browser name is null or empty. WebDriver initialization failed.");
        }
        if (runEnvironment == null || runEnvironment.trim().isEmpty()) {
            logger.error("Run environment is null or empty. WebDriver initialization failed.");
        }

        logger.info("Initialising WebDriver with browser: {}for run environment: {}", browserName, runEnvironment);

        WebdriverCapabilities capabilities = new WebdriverCapabilities();
        return capabilities.getDriver(browserName, runEnvironment);

    }

    public void tearDown() {

        WebDriver driver = WebDriverManager.getDriver();

        if (driver == null) {
            logger.error("WebDriver instance is null. Tear down aborted.");
            return;
        }

        logger.info("Initiating WebDriver teardown.");

        try {
            WebDriverManager.removeDriver(driver);
            logger.info("WebDriver successfully closed. Session terminated.");
        } catch (Exception e) {
            logger.error("An error occurred while tearing down the WebDriver.", e);
        }
    }

}