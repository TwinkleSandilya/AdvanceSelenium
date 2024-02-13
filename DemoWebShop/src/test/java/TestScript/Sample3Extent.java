package TestScript;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample3Extent {
	@Test
	public void testcase() {
		ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Users\\Twinkle Sandilya\\eclipse-workspace\\DemoWebShop\\ExtentReport\\Report.html");
		ExtentReports er = new ExtentReports();
		er.attachReporter(esr);
		ExtentTest et = er.createTest("Sample3Extent");
		et.log(Status.INFO, "test case successfully attached to the report");
		er.flush();
	}

}
