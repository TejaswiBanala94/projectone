package amazon.ProjectOne;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility.ListenersforScreenshot.class)

public class Testcase2_for_Loginwith_CorrectCredentials extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void login() throws EncryptedDocumentException, IOException
	{
		
//		DDT d1=new DDT();
//		d1.credentials();
		
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.acctlist(driver);
		h1.signin();
		LoginAmazon l1= new LoginAmazon(driver);
		l1.un("loginforamazon",0,0);
		l1.cnt();
		l1.pswd("loginforamazon",0,1);
		l1.signin();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", "Sorry the testcase is failed");
	}
	

}
