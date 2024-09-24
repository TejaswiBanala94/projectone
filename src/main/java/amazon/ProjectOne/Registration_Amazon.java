package amazon.ProjectOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Amazon 
{
	ChromeDriver driver;
	@FindBy(id="ap_customer_name")
	WebElement name;
	
	@FindBy(id="ap_phone_number")
	WebElement phonenumber;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement verifymobilenumber;
	//step2
	public void nm()
	{
	 name.sendKeys("Tejaswi");
	}
	public void phnum()
	{
		phonenumber.sendKeys("8187635482");
	}
	public void pswrd()
	{
		password.sendKeys("8187832382");
	}
	public void vmnum()
	{
		verifymobilenumber.click();
	}
	//step3
	public Registration_Amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
