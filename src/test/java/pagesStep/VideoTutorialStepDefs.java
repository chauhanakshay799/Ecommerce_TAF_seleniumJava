package pagesStep;

import WebDriverCustomise.WebDriverManager;
import org.openqa.selenium.WebDriver;
import pages.VideoTutorial;

public class VideoTutorialStepDefs {

    WebDriver driver;
    public VideoTutorial videoTutorial;

    public VideoTutorialStepDefs() {
        this.driver = WebDriverManager.getDriver();
        this.videoTutorial = new VideoTutorial(driver);
    }
}
