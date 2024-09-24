package amazon.ProjectOne;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkoutpage_Amazon 
{
	ChromeDriver driver;
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement useaddress;
	
	@FindBy(name="ppw-instrumentRowSelection")
	WebElement creditdebit;
	
	@FindBy(linkText="Enter card details")
	WebElement entercarddetails;
	
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
	WebElement netbanking ;
	
	@FindBy(name="ApxSecureIframe")
	WebElement cardnumber ;
	@FindBy(xpath="//select[@name='ppw-bankSelection_dropdown']")
	WebElement netbanking_dropdown;
	@FindBy(linkText="ICICI Bank")  
	WebElement icicibank_sel;
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[7]")
	WebElement usethispayment_text;
	@FindBy(id="prime-interstitial-nothanks-button")
	WebElement nothanks_text;
	
	public void nothanks() throws InterruptedException
	{
		nothanks_text.click();
		Thread.sleep(2000);
		nothanks_text.sendKeys(Keys.ESCAPE);
	}
	
	public void usethispayment() throws InterruptedException
	{
		Thread.sleep(2000);
		usethispayment_text.click();
	}
	public void icicibank()
	{
		icicibank_sel.click();
	}
	
	public void ntbankingdropdown()
	{
//		netbanking_dropdown.click();
		Select s1 = new Select(netbanking_dropdown);
		s1.selectByIndex(4);
	}
	
	public void crdnum()
	{
		driver.switchTo().frame(cardnumber);
		cardnumber.sendKeys("44233263344");
	}
	
	
	public void usadd()
	{
		useaddress.click();
	}
	
	public void entrcrddet()
	{
		entercarddetails.click();
	}
	
	public void crdt()
	{
		creditdebit.click();
	}
	public void ntbnkng()
	{
		netbanking.click();
	}
	
	public Checkoutpage_Amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
