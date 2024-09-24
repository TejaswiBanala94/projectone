package amazon.ProjectOne;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDescription_Amazon 
{
	ChromeDriver driver;
	//step1
	@FindBy(xpath="(//div[@class='_bGlmZ_img_3idRh _bGlmZ_expandedImgT1_RpAoS'])[4]")
	WebElement searchresult;
	
	@FindBy(id="wishListMainButton")
	WebElement addtowhishlistbtn;

//	@FindBy(linkText="1,799")
//	WebElement price;
//	
	
//	@FindBy(linkText="View Your List")
//	WebElement viewyourlist;
	//step2
	public void serchres()
	{
		searchresult.click();
	}
	
	public void addwish()
	{
		addtowhishlistbtn.click();
		//driver.switchTo().frame(addtowhishlistbtn);
	}
//	public void viewlst()
//	{
//		viewyourlist.click();
//	}
	//step3
	public ProductDescription_Amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
