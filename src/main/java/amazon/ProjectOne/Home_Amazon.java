package amazon.ProjectOne;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Amazon 
{
	ChromeDriver driver;
	
	//step 1
		@FindBy(xpath="//span[@class='nav-line-2 ']")
		WebElement accountandlist;
		
		@FindBy(linkText="Start here.")
		WebElement startherebutton;
		
		@FindBy(xpath="(//span[.='Sign in'])[1]")
		WebElement signinbutton;
		
		@FindBy(id="twotabsearchtextbox")
		WebElement search_tf;
		
		@FindBy(id="twotabsearchtextbox")
		WebElement srch_tf;
		
		@FindBy(id="searchDropdownBox")
		WebElement allcategory;
		@FindBy(xpath="(//a[@class='a-link-normal s-navigation-item'])[11]")
		WebElement category_women;
		
		//step2
		public void acctlist(ChromeDriver driver)
		{
			Actions a1= new Actions(driver);
			a1.moveToElement(accountandlist).perform();
			
		}
		public void category()
		{
			category_women.click();
		}
		public void alcatgry()
		{
			Select s1= new Select(allcategory);
			s1.selectByVisibleText("Shoes & Handbags");
		}
		public void strthr()
		{
			startherebutton.click();
		}
		public void signin()
		{
			signinbutton.click();
		}
		public void searchproduct()
		{
			search_tf.sendKeys("shoe"+Keys.ENTER);
		}
		public void searchprice()
		{
		srch_tf.sendKeys("shoes"+Keys.ENTER);
		}
		
		//step3
		public Home_Amazon(ChromeDriver driver)
		{
			
			PageFactory.initElements(driver, this);
		}

}
