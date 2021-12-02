package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class VerifyHomePage {
	POMClasses.HomePage home;
	WebDriver driver;
	POMClasses.NewUserPage newUser;
	@BeforeClass
	public void SetProperty()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    home=new POMClasses.HomePage(driver);
	    newUser=new POMClasses.NewUserPage(driver);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.navigate().to("https://licindia.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void VerifyClickOnHomePage() throws InterruptedException
	{
		home.clickCustomerPortal();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		
		if(url.equals("https://licindia.in/Home-(1)/Customer-Portal"))
		{
			System.out.println("Test is Passed");
		}
		else
		{
			System.out.println("Test is failed");
		}
		
	}
	
	
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("xyz");
//	}
	
	@AfterClass
	public void CloseHomePage()
	{
		driver.quit();
	}
	
	

}
