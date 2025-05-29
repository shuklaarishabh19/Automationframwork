package utils;

import org.openqa.selenium.WebElement;

public class ElementActions {
	// Clicks on a web element
    public static void click(WebElement element) {
        element.click();
    }

    // Sends text to a web element
    public static void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }

    // Clears input field
    public static void clearText(WebElement element) {
        element.clear();
    }

    // Gets visible text from element
    public static String getText(WebElement element) {
        return element.getText();
    }

    // Gets attribute value of an element
    public static String getAttribute(WebElement element, String attributeName) {
        return element.getAttribute(attributeName);
    }

    // Checks if element is displayed
    public static boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    // Checks if element is enabled
    public static boolean isElementEnabled(WebElement element) {
        return element.isEnabled();
    }

    // Checks if checkbox/radio is selected
    public static boolean isElementSelected(WebElement element) {
        return element.isSelected();
    }

}
