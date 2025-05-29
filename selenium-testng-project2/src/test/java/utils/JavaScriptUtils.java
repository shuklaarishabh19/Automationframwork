package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils {
	private WebDriver driver;
    private JavascriptExecutor js;

    public JavaScriptUtils(WebDriver driver) {
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    // Scrolls the element into view
    public void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    // Clicks on the element using JavaScript
    public void clickByJS(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    // Sets value into input field using JavaScript
    public void setValueByJS(WebElement element, String value) {
        js.executeScript("arguments[0].value='" + value + "';", element);
    }

    // Returns inner text of an element using JavaScript
    public String getInnerTextByJS(WebElement element) {
        return (String) js.executeScript("return arguments[0].innerText;", element);
    }

}
