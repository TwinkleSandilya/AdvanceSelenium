package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import PomScript.WelcomePage;

public class LoginTest extends  BaseClass{
	
	@Test
	public void testCase() {
		String username = System.getProperty("username");
		String password = System.getProperty("Password");
		
		Reporter.log(username,true);
		Reporter.log(password,true);
		
		WelcomePage w=new WelcomePage();
		w.getLogin().click();
		
		LoginPage lp=new LoginPage(driver);
		
		
		
		
		
		
	}

}
