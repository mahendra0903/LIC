package POMClasses;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserPage {
	//private WebDriver driver;
	
	@FindBy (xpath="//a[text()='New User']")
	private WebElement newUser;
	
	
	public NewUserPage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver,this);
	}
    
	public void clickNewUser(WebDriver driver) throws InterruptedException 
	{
		newUser.click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		ArrayList<String> addr= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));

		Thread.sleep(5000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://ebiz.licindia.in/D2CPM/?&_ga=2.226417818.1474094648.1634017259-937230977.1633543572#Register"))
	    {
		    System.out.println("Test is Passed");    
	    }
		else
		{
			System.out.println("Test is Failed");
		}
	
		
	}
}
