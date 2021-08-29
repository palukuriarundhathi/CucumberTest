package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GDMLoginPage {
	
WebDriver driver;
	
	public GDMLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	@FindBy(xpath ="//a[normalize-space()='Sign In']")
	@CacheLookup
	WebElement signIn;
	
	@FindBy(xpath ="//span[normalize-space()='Sign In with Web Access ID']")
	@CacheLookup
	WebElement webAccessId;
	
	
	@FindBy(id ="idp-discovery-username")
	@CacheLookup
	WebElement username;
	
	@FindBy(id ="idp-discovery-submit")
	@CacheLookup
	WebElement continue1;
	
	@FindBy(xpath ="//input[@id='okta-signin-password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath ="//input[@id='okta-signin-submit']")
	@CacheLookup
	WebElement continue2;
	
	
	
		
	public void signinClick() {
		
		signIn.click();
	}
	public void webAccessIdLogin() {
		webAccessId.click();
	}
	
   public void setUsername() {
 
	 username.sendKeys("testprodgdmuser@gmail.com");
	}
   public void setpassword() {
	   
	   password.sendKeys("Password123");
		}

   public void Countinue1() {
		
	   continue1.click();
	}	
	
   public void Countinue2() {
		
	   continue2.click();
	}	

}
