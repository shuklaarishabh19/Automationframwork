package test;
import java.io.IOException;
import org.testng.Assert;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import pages.LoginPage;
import utils.ExcelUtils;
import utils.ScreenshotUtils;

@Listeners(listeners.TestListener.class)
public class LoginTest extends BaseTest{
	
	@Test(dataProvider = "loginData")
    public void loginTest(String username, String password, int rowIndex) throws Exception {
        LoginPage page = new LoginPage(driver);
        page.login(username, password);
        
        boolean isSuccess = page.isLoginSuccessful();
        try {
            Assert.assertTrue(isSuccess, "Login failed");
            ExcelUtils.writeResult(rowIndex, "Yes");
        } catch (AssertionError e) {
            ExcelUtils.writeResult(rowIndex, "No");
            //ScreenshotUtils.capture(driver, "LoginTest_Row" + rowIndex);
            throw e; 
        }
    }

    @DataProvider(name = "loginData")
    public Object[][] loginDataProvider() throws IOException {
        return ExcelUtils.getLoginData();
        
        
    }
}
