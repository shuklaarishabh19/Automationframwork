package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;

    By username = By.xpath("//input[@placeholder='Email']");
    By password = By.xpath("//input[@name='password']");
    By loginBtn = By.xpath("//button[@type='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    public boolean isLoginSuccessful() throws InterruptedException {
    	//Thread.sleep(10);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 

    	try {
            return wait.until(ExpectedConditions.titleContains("My Jobfeed"));
        } catch (Exception e) {
            return false; // timeout or other failure
        }
    	
    	
        
        
    }

}
