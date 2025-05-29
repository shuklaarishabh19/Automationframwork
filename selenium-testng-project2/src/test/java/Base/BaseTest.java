package Base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.BrowserActions;

public class BaseTest {
	
	public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        //WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.iimjobs.com/");
    	
    	driver=BrowserActions.launchBrowser("chrome");
    	BrowserActions.maximizeWindow();
    	BrowserActions.navigateToUrl("https://www.iimjobs.com/");
    }

    @AfterMethod
    public void tearDown() {
//        driver.quit();
    	BrowserActions.quitBrowser();
    }

}
