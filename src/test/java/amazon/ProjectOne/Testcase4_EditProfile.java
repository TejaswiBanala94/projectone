package amazon.ProjectOne;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.LoginAmazon;
import amazon.ProjectOne.ProfileInformation_Amazon;
import utility.DDT;

public class Testcase4_EditProfile extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void editprfle() throws EncryptedDocumentException, IOException, InterruptedException
	{
//		DDT d1=new DDT();
//		d1.credentials();
		
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
		p1.mngprfle();
		Thread.sleep(2000);
		p1.prfl();
		Thread.sleep(2000);
		
		Assert.assertEquals(driver.getTitle(), "Profile Hub", "Sorry the testcase is failed");
		
		
	}
	

}
