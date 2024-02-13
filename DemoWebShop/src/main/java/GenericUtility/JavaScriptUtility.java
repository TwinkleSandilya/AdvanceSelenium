package GenericUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility  extends WebDriverUtility{
	
	/**
	 * this method is used to scroll the webpage according to the x axis and y axis
	 * @param x
	 * @param y
	 */
	public static void ScrollBy(int x,int y) {
		js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}	
	public static void ScrollTo(int x,int y) {	
		js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	//this method is used to scroll the page until the element is visible
	public static void Scroll_In_To_View(Boolean b,WebElement element,int index) {	
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments["+index+"].scrollInToview("+b+");,"+element+"");
	}
	//this method is used to click the disable element
	public static void clickDisable(WebElement element,int index) {
		js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
}
