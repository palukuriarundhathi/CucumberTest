package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.GDMLoginPage;
import org.testng.*;
import org.testng.annotations.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LoginPageSteps {
	
	
	GDMLoginPage  obj;
	WebDriver driver;
	
	@Before
	@Given("Open Browser and enter Url")
	public void open_browser_and_enter_url() throws InterruptedException {
	   System.out.println("Opening Browser");
	   
	   WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	   driver.get("https://www.dnbdecisionmaker.com/dm/index.jsp");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	   obj = new GDMLoginPage(driver);
	   obj.signinClick();
	   obj.webAccessIdLogin();
	   
	   Thread.sleep(3000);
	   System.out.println("Ramesh");
	  // driver.close();	   
	}

	@When("I enter UserName and Password")

	public void i_enter_user_name_and_password() {
		 System.out.println("Enter UserName"); 
		obj = new GDMLoginPage(driver);
		 obj.setUsername();
		   obj.Countinue1();
		   obj.setpassword();
		   obj.Countinue2();
	}
     
	
	@Test
	@When("click on Login button")
	public void click_on_login_button() {
		 System.out.println("Click on Login Button"); 
		 obj = new GDMLoginPage(driver);
		 obj.Countinue2();
	}

	@After
	@Then("Application should navigate to HomePage")
	public void application_should_navigate_to_home_page() throws InterruptedException {
		 System.out.println("Redirecting to HomePage "); 
		 
		 obj = new GDMLoginPage(driver);
		 String title = driver.getTitle();
		 //Assert.assertEquals("GDM", title);
		 //org.testng.Assert.assertEquals("D&B Global DecisionMaker", title);
		 org.testng.Assert.assertEquals("dnb - Sign In", title);
		 
		 Thread.sleep(5000);
		 driver.close();
		 
		 //Assert.assertEquals("GDM", title);
		// //assert.
	}


}
