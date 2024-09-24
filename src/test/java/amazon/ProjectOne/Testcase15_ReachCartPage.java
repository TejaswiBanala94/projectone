package amazon.ProjectOne;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.ProjectOne.AddingToCart_Amazon;
import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.SearchResult_Amazon;
@Listeners(utility.ListenersforScreenshot.class)
public class Testcase15_ReachCartPage extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer=utility.RetryLogic.class)
	public void cartpagewithoutlogin()
	{
		Home_Amazon h1= new Home_Amazon(driver);
		h1.searchproduct();
		SearchResult_Amazon s1 = new SearchResult_Amazon(driver);
		s1.slctsh();
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> id =ids.iterator();
		String parentid = id.next();//parent id
		String childid = id.next();//1st child id
		
		driver.switchTo().window(childid);
		AddingToCart_Amazon a1 = new AddingToCart_Amazon(driver);
		a1.adcart();
		a1.crt();
		
		String s2=driver.getCurrentUrl();
		Assert.assertEquals(s2.contains("nav_cart"), true, "sorry the testcase is failed");
		
	}

}
