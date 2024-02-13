package TestScript;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Sample4Extent {
	
	@Test
	public void testcase() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		 String image = driver.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter esr = new ExtentSparkReporter("C:\\Users\\Twinkle Sandilya\\eclipse-workspace\\DemoWebShop\\ExtentReport\\Report.html");
		ExtentReports er = new ExtentReports();
		er.attachReporter(esr);
		ExtentTest et = er.createTest("Sample3Extent");
		et.log(Status.INFO, "test case successfully attached to the report");
		et.addScreenCaptureFromBase64String(image);
		er.flush();
		
	}
	

}
