package TestPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class VerifyNewUserButton {
	WebDriver driver;
	POMClasses.NewUserPage newuser;
	POMClasses.HomePage home;
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://licindia.in/");
		driver.manage().window().maximize();
		newuser= new  POMClasses.NewUserPage(driver);
		home=new POMClasses.HomePage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		home.clickCustomerPortal();
	}
	
	@Test
	public void verifyNewUser() throws InterruptedException
	{
		newuser.clickNewUser(driver);
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	public void afterMethod()
	{
		driver.quit();
	}

}
