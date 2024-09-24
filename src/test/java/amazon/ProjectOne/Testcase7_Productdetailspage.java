package amazon.ProjectOne;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.SearchResult_Amazon;
@Listeners(utility.ListenersforScreenshot.class)
public class Testcase7_Productdetailspage extends Launch_Quit_Amazon 
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void prdctdet()
	{
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.searchproduct();
		
		SearchResult_Amazon s1 = new SearchResult_Amazon(driver);
		s1.slctsh();
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> id =ids.iterator();
		String parentid = id.next();//parent id
		String childid = id.next();//1st child id
		
		driver.switchTo().window(childid);    
		
		WebElement review = driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[1]"));
		Assert.assertEquals(review.isEnabled(), true, "sorry the testcase is failed");
	}

}
