package PomScript;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RegisterPage extends BasePage {

				public RegisterPage(WebDriver driver){
					super(driver);
					//PageFactory.initElements(driver, this);
				
			}
	     @FindBy(linkText="Register")
	     private WebElement registerlink;
	     
	    public WebElement getRegisterlink() {
			return registerlink;
		}
	    
	    @FindBy(id="gender-female")
	    private WebElement Gender;
	    public WebElement getGender() {
			return Gender;
	}
	    
	    
	   @FindBy(id="FirstName")
	   private WebElement Firstname;
	   public WebElement getFirstName() {
			return Firstname;
	   }
	   
	   @FindBy(id="LastName")
	   private WebElement Lastname;
	   public WebElement getLastName() {
			return Lastname;
	   }
	   
	   
	   @FindBy(id="Email")
	   private WebElement Email;
	   public WebElement getEmail() {
			return Email;
	   }
	   
	   @FindBy(id="Password")
	   private WebElement Password;
	   public WebElement getPassword() {
			return Password;
	   }
	   
	   
	   @FindBy(id="ConfirmPassword")
	   private WebElement ConfirmPassword;
	   public WebElement getConfirmPassword() {
			return ConfirmPassword;
	   }
	    @FindBy(id="register-button")
	    private WebElement Registerbutton;
	    public WebElement getRegisterbutton() {
			return Registerbutton;
	   }
		}

		


