package amazon.ProjectOne;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import amazon.ProjectOne.AddingToCart_Amazon;
import amazon.ProjectOne.Checkoutpage_Amazon;
import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.LoginAmazon;
import amazon.ProjectOne.SearchResult_Amazon;
@Listeners(utility.ListenersforScreenshot.class)
public class Testcase13_Couponcode extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer=utility.RetryLogic.class)
	public void couponcode() throws EncryptedDocumentException, IOException, InterruptedException
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
		//a1.crt();
		a1.probuy();
		
		LoginAmazon l1= new LoginAmazon(driver);
		l1.un("loginamazon",0,0);
		l1.cnt();
		l1.pswd("loginamazon",0,1);
		l1.signin();
		
		Checkoutpage_Amazon c1 = new Checkoutpage_Amazon(driver);
		c1.usadd();
		c1.ntbnkng();
		c1.ntbankingdropdown();
		c1.icicibank();
		c1.usethispayment();
		c1.nothanks();
		
		WebElement e1 = driver.findElement(By.id("spc-gcpromoinput"));
		Assert.assertEquals(e1.isEnabled(), true, "Sorry the testcase is failed");
	}

}
