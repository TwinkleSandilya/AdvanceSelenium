package GenericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class BaseClass extends WebDriverUtility {



	@BeforeSuite
	public void connectserver() {
		Reporter.log("connecting to server",true);
	}


	@BeforeTest
	public void connectdatabase() {
		Reporter.log("connecting to database",true);
	}

	@BeforeClass
	public void openbrowser() throws IOException {
		Reporter.log("opening broser",true);
		driver=new ChromeDriver();
		maximize();
		implicitwait();
		String url = PropertyFileUtility.propertyData("url");
		getUrl(url);
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


	}
	@BeforeMethod
	
		public void login() {
		Reporter.log("login",true);

		//driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("[type='submit']")).click();
	}


		@AfterMethod
		public void logout() {
			Reporter.log("logout",true);

		}
		@AfterClass
		public void closebrowser() {
			Reporter.log("closing the browser",true);
		}

		@AfterTest
		public void disconnectdatabase() {
			Reporter.log("disconnecting to database",true);
		}
		@AfterSuite
		public void disconnectserver() {
			Reporter.log("disconnecting to server",true);
		}
	}
