package amazon.ProjectOne;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;

public class Testcase5_searchingshoe extends Launch_Quit_Amazon 
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void search()
	{
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.searchproduct();
		
		WebElement products = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[5]"));
	Assert.assertEquals(products.isDisplayed(), true, "sorry the testcase is failed");
	
	}
	

}
