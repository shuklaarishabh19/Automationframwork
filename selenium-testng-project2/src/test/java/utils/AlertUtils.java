package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class AlertUtils {
	private WebDriver driver;

    // Accept alert
    public void acceptAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert to accept - " + e.getMessage());
        }
    }

    // Dismiss alert
    public void dismissAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert to dismiss - " + e.getMessage());
        }
    }

    // Get alert text
    public String getAlertText() {
        try {
            Alert alert = driver.switchTo().alert();
            return alert.getText();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert to get text from - " + e.getMessage());
            return null;
        }
    }

    // Send keys to alert (for prompt)
    public void sendKeysToAlert(String text) {
        try {
            Alert alert = driver.switchTo().alert();
            alert.sendKeys(text);
        } catch (NoAlertPresentException e) {
            System.out.println("No prompt alert to send keys - " + e.getMessage());
        }
    }

}
