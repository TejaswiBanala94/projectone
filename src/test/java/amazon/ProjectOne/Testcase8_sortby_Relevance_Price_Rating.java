package amazon.ProjectOne;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.SearchResult_Amazon;
@Listeners(utility.ListenersforScreenshot.class)
public class Testcase8_sortby_Relevance_Price_Rating extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void sortbyprice()
	{
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.searchproduct();
		
		SearchResult_Amazon s1= new SearchResult_Amazon(driver);
		s1.ctgry();
		s1.srtby(); 
		s1.plh();
		
		String s2=driver.getCurrentUrl();
		Assert.assertEquals(s2.contains("price-asc-rank"), true, "sorry the testcase is failed");
		
	}

}
