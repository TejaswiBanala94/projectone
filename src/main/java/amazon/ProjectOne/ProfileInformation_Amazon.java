package amazon.ProjectOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileInformation_Amazon 
{
	ChromeDriver driver;
	@FindBy(xpath="//button[@class='sc-fqkvVR sc-hZDyAQ jZunJN jGnYjN']")
	WebElement manageprofile;
	
	@FindBy(xpath="//div[@class='sc-hmdomO qqYTW']")
	WebElement profle;
	@FindBy(linkText = "Your Orders")
	WebElement orders_link;
	@FindBy(xpath="//div[@class='w-full h-full border-gray-400']")
	WebElement orders_feild;
	
	public void orderselct()
	{
		orders_feild.click();
	}
	public void orders()
	{
		orders_link.click();
	}
	
	public void mngprfle()
	{
		manageprofile.click();
	}
	
	public void prfl()
	{
		profle.click();
	}
	public ProfileInformation_Amazon(ChromeDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	
	

}
