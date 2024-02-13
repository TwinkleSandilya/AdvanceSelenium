package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
  public BasePage(WebDriver Driver) {
	  PageFactory.initElements(Driver,this);
  }
}
