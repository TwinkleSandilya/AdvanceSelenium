package GenericUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Twinkle Sandilya
 */
public class WebDriverUtility {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Select S;
	public static Actions a;
	public static JavascriptExecutor js;
	
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static String currentUrl() {
		return driver.getCurrentUrl();
	}
	public static  String pageSource() {
		return driver.getPageSource();
	}
	public static  String title() {
	return driver.getTitle();
	}
	
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public static  String currentWindow() {
		return driver.getWindowHandle();
	}
	public static Set<String> allwindow(){
	return driver.getWindowHandles();
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void minimize() {
		driver.manage().window().minimize();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void backward() {
		driver.navigate().back();
	}
	public static void refresh() {
	driver.navigate().refresh();
	}
	public static void toUrl(String url)
	{
	driver.navigate().to(url);
}
       public static void closeWindow() {
    	   driver.close();
       }
       public static  void  quitWindow() {
    	   driver.quit();
       }
       public static void ExplicitWait(WebElement element) {
    	   
    	   wait=new WebDriverWait(driver, Duration.ofSeconds(15));
    	   wait.until(ExpectedConditions.visibilityOf(element));
       }
       public static void dropDown(int index,WebElement element) {
    	   S= new Select(element);
    	   S.selectByIndex(index);
       }
       public static void dropDown(String value,WebElement element) {
    	   S= new Select(element);
    	   S.selectByValue(value);
       }
       public static void dropDown(WebElement element,String Visibletext) {
    	   S= new Select(element);
    	   S.selectByVisibleText(Visibletext);
       }

      public static void moveCursor(WebElement element) {
    	  a=new Actions(driver);
    	  a.moveToElement(element).perform();
      }
      public static void rightClick(WebElement element) {
    	  a=new Actions(driver);
    	  a.contextClick(element).perform();
      }
      public static void DoubleClick(WebElement element) {
      a=new Actions(driver);
	  a.doubleClick(element).perform();
  }
      public static void dragAndDrop(WebElement source,WebElement Destination) {
    	  a=new Actions(driver);
    	  a.dragAndDrop(source, Destination).perform();
      }
      public static void clickElement(WebElement element) {
    	  a=new Actions(driver);
    	  a.click(element).perform();
    	  
      }
      public static void click() {
    	  a=new Actions(driver);
    	  a.click().perform();
    	  
      
}
} 	  
      
