package amazon.ProjectOne;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.LoginAmazon;
@Listeners(utility.ListenersforScreenshot.class)

public class Testcase3_for_Loginfails extends Launch_Quit_Amazon 
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void loginwithincorrect() throws EncryptedDocumentException, IOException
	{
		Home_Amazon h1 = new Home_Amazon(driver);
		h1.acctlist(driver);
		h1.signin();
		LoginAmazon l1= new LoginAmazon(driver);
		l1.un("loginamazon",1,0);
		l1.cnt();
		//l1.pswd("loginamazon",1,1);
		//l1.signin();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/ap/signin", "Sorry the testcase is failed");
	}

	

}
