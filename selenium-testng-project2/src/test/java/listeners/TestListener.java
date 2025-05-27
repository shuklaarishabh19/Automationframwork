package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.BaseTest;
import utils.ExtentManager;
import utils.ScreenshotUtils;

public class TestListener implements ITestListener {
	
    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    
    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());
        test.set(extentTest);
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().log(Status.PASS, "Test Passed");
    }

	@Override
    public void onTestFailure(ITestResult result) {
		test.get().log(Status.FAIL, "Test Failed: " + result.getThrowable());
        String testName = result.getName();
        ScreenshotUtils.capture(BaseTest.driver, testName);
        System.out.println("Screenshot taken for failed test: " + testName);
    }
	
	@Override
    public void onTestSkipped(ITestResult result) {
        test.get().log(Status.SKIP, "Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
	

}
