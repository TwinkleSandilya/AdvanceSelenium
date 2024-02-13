package TestScript;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ReadExcelUtility;

public class SampleTest extends BaseClass {
	//@Test
	//public void t1() {
		//Reporter.log("sample1 class executed",true);
		
		@Test(dataProvider="credential")
		public void login(String username,String password) {
			Reporter.log("sample1 class executed",true);
			Reporter.log("username",true);
			Reporter.log("password",true);
		}
		@DataProvider(name="credential")
		public Object[][] data() throws IOException{
			return ReadExcelUtility.fetchAllData("sheet1");
	}

}
