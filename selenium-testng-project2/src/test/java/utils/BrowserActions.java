package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserActions {
	private static WebDriver driver;

    // Launches browser based on the input string
    public static WebDriver launchBrowser(String browserName) {
        switch (browserName.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Unsupported browser. Launching Chrome by default.");
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }

    // Maximizes browser window
    public static void maximizeWindow() {
        driver.manage().window().maximize();
    }

    // Navigates to a given URL
    public static void navigateToUrl(String url) {
        driver.get(url);
    }

    // Closes the current browser window
    public static void closeBrowser() {
        driver.close();
    }

    // Quits all browser instances and ends the session
    public static void quitBrowser() {
        driver.quit();
    }

    // Getter for WebDriver if needed
    public static WebDriver getDriver() {
        return driver;
    }

}
