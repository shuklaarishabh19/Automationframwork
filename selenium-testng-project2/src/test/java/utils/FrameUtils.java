package utils;

import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameUtils {
	
	private WebDriver driver;

    public FrameUtils(WebDriver driver) {
        this.driver = driver;
    }

    // Switch to frame by index
    public void switchToFrameByIndex(int index) {
        try {
            driver.switchTo().frame(index);
        } catch (NoSuchFrameException e) {
            System.out.println("No frame found with index: " + index + " - " + e.getMessage());
        }
    }

    // Switch to frame by name or ID
    public void switchToFrameByNameOrId(String nameOrId) {
        try {
            driver.switchTo().frame(nameOrId);
        } catch (NoSuchFrameException e) {
            System.out.println("No frame found with name or ID: " + nameOrId + " - " + e.getMessage());
        }
    }

    // Switch to frame by WebElement
    public void switchToFrameByElement(WebElement frameElement) {
        try {
            driver.switchTo().frame(frameElement);
        } catch (NoSuchFrameException e) {
            System.out.println("No frame found with WebElement: " + frameElement + " - " + e.getMessage());
        }
    }

    // Switch back to default content
    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

}
