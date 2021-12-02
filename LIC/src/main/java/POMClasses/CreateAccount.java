package POMClasses;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CreateAccount {
	
	WebDriver driver;
	
	@FindBy (xpath="//input[@name='policyNumber']")
	private WebElement policyNumber;
	
	@FindBy (xpath="//input[@name='premiumAmount']")
	private WebElement Instalment;
	
    @FindBy (xpath="//input[@name='datefield']")
    private WebElement dateOfBirth;
    
    @FindBy (xpath="//input[@name='mobileNumber']")
    private WebElement mobileNumber;
    
    @FindBy (xpath="//input[@name='emailId']")
    private WebElement emailID;
    
    @FindBy (xpath="//input[@name='passportNumber']")
    private WebElement passport;
    
    @FindBy (xpath="//input[@name='panNumber']")
    private WebElement PanNumber;
    
    @FindBy (xpath="//label[text()='Male']")
    private WebElement Gender;
    
    @FindBy (xpath="//input[@name='confirmMobilenumber']")
    private WebElement checkBox;
    
    @FindBy (xpath="//span[@id='da_button-1161-btnEl']")
    private WebElement proceed;
    
    
    public CreateAccount(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    
    public void sendPolicyNumber()
    {
    	policyNumber.sendKeys("123456789");
    }
    
    
    public void sendInstalment()
    {
    	Instalment.sendKeys("10000");
    }
    
    public void sendDateOfBirth()
    {
    	dateOfBirth.sendKeys("09/03/1997");
    }
    
    
    public void sendMobileNumber()
    {
    	mobileNumber.sendKeys("8600315002");
    }

		
    public void sendEmailID()
    {
    	emailID.sendKeys("mahemdrakolate@gmail.com");
    }
    
    
	
    public void sendPassport()
    {
    	passport.sendKeys("A2096457");
    }
    
    
    public void sendPanNumber()
    {
    	PanNumber.sendKeys("EABPH2477F");
    }
    
    
    public void sendGender()
    {
    	Gender.click();
    }
    
    
    
    public void sendCheckBox()
    {
    	checkBox.click();
    	boolean result = checkBox.isSelected();
	    if(result)
			{
				System.out.println("it is selected");
			}
			else
			{
				checkBox.click();
			}
    }
    
    
    public void ClickProceed(WebDriver driver) throws IOException, InterruptedException
    {
    	proceed.click();
    	this.driver=driver;
    	Thread.sleep(3000);
    	driver.quit();;
    }

}
