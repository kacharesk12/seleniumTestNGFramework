package resources;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class listeners extends extentReportManager implements ITestListener {

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());

	}

	public void onTestSucess(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, "Test case passed is " + result.getName());

		}
	}

	public void onTestskip(ITestResult result) {
		if (result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, "Test case skipped is " + result.getName());
		}

	}

	public void onTestFailed(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test case failed is "+result.getName());
			test.log(Status.FAIL, "Test case failed is "+result.getThrowable());
			String screenshotPath = baseClass.screenshot(baseClass.driver, result.getName());
			test.addScreenCaptureFromPath(screenshotPath);
		}
	}
}
