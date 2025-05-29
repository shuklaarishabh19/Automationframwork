package utils;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtils {
	// Select by visible text
    public static void selectByVisibleText(WebElement dropdown, String text) {
        try {
            new Select(dropdown).selectByVisibleText(text);
        } catch (Exception e) {
            System.out.println("Unable to select by visible text: " + text + " - " + e.getMessage());
        }
    }

    // Select by value attribute
    public static void selectByValue(WebElement dropdown, String value) {
        try {
            new Select(dropdown).selectByValue(value);
        } catch (Exception e) {
            System.out.println("Unable to select by value: " + value + " - " + e.getMessage());
        }
    }

    // Select by index
    public static void selectByIndex(WebElement dropdown, int index) {
        try {
            new Select(dropdown).selectByIndex(index);
        } catch (Exception e) {
            System.out.println("Unable to select by index: " + index + " - " + e.getMessage());
        }
    }

    // Get all dropdown options (visible text)
    public static List<String> getAllDropdownOptions(WebElement dropdown) {
        List<String> optionsText = new ArrayList<>();
        try {
            List<WebElement> options = new Select(dropdown).getOptions();
            for (WebElement option : options) {
                optionsText.add(option.getText().trim());
            }
        } catch (Exception e) {
            System.out.println("Unable to get dropdown options - " + e.getMessage());
        }
        return optionsText;
    }

}
