package amazon.ProjectOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResult_Amazon 
{
	ChromeDriver driver;
	//step1
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[11]")
	WebElement selectingshoe;  
	
	@FindBy(xpath="//span[@class='a-size-base a-color-base']")
	WebElement category;
	
	@FindBy(xpath="//span[.='Sort by:']")
	WebElement sortby;
	
	@FindBy(linkText="Price: Low to High")
	WebElement pricelh ;
	
	
	//step2
	public void slctsh()
	{
		selectingshoe.click();
		
	}
	public void srtby()
	{
		sortby.click();
	}
	public void plh()
	{
		pricelh.click();
	}
	public void ctgry()
	{
		category.click();
	}
	//step3
	public SearchResult_Amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
