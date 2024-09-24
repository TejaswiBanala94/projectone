package amazon.ProjectOne;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.ProjectOne.Home_Amazon;
import amazon.ProjectOne.LoginAmazon;
import amazon.ProjectOne.SearchResult_Amazon;
import utility.DDT;

public class Testcase6_searchingWithFilters extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void filters() throws EncryptedDocumentException, IOException
	{
//		DDT d1=new DDT();
//		d1.credentials();
		
		Home_Amazon h1 = new Home_Amazon(driver);
//		h1.acctlist(driver);
//		h1.signin();
//		LoginAmazon l1= new LoginAmazon(driver);
//		l1.un("loginamazon",0,0);
//		l1.cnt();                            
//		l1.pswd("loginamazon",0,1);
//		l1.signin();
		h1.searchproduct();
		
		h1.category();
		
		WebElement womensports_shoe = driver.findElement(By.xpath("(//a[@class='a-link-normal s-navigation-item'])[5]"));
		Assert.assertEquals(womensports_shoe.isEnabled(), true, "sorry the testcase is failed");

	}

}
