package amazon.ProjectOne;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(utility.ListenersforScreenshot.class)
public class Testcase14_OrderedPage_5StarRating extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer=utility.RetryLogic.class)
	public void fivestar_rating() throws EncryptedDocumentException, IOException
	{
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.acctlist(driver);
		h1.signin();
		LoginAmazon l1= new LoginAmazon(driver);
		l1.un("loginamazon",0,0);
		l1.cnt();
		l1.pswd("loginamazon",0,1);
		l1.signin();
		h1.acctlist(driver);
		
		ProfileInformation_Amazon p1=new ProfileInformation_Amazon(driver);
		p1.orders();
		//p1.orderselct();
		Assert.assertEquals(driver.getTitle(),"Your Orders","Sorry the testcase is failed");
		
	}
	

}
