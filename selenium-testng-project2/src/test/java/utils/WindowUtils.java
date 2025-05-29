package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowUtils {
	private WebDriver driver;
    private String mainWindowHandle;

    public WindowUtils(WebDriver driver) {
        this.driver = driver;
        this.mainWindowHandle = driver.getWindowHandle(); // Save main window handle
    }

    // Switch to window by title
    public void switchToWindowByTitle(String windowTitle) {
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            if (driver.getTitle().contains(windowTitle)) {
                return;
            }
        }

        throw new RuntimeException("Window with title containing '" + windowTitle + "' not found.");
    }

    // Switch to window by handle
    public void switchToWindowByHandle(String windowHandle) {
        driver.switchTo().window(windowHandle);
    }

    // Close current window and switch back to main window
    public void closeCurrentWindowAndSwitchToMain() {
        driver.close();
        driver.switchTo().window(mainWindowHandle);
    }

}
