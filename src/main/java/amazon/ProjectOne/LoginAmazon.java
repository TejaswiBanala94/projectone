package amazon.ProjectOne;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DDT;

public class LoginAmazon extends DDT
{
	ChromeDriver driver;
	public  DDT d1 = new DDT();
	
	
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinbutton;
	//step2
		public void un(String sheet, int row ,int cell) throws EncryptedDocumentException, IOException
		{
			String uname = DDT.credentialusername(sheet,row,cell);
		    username.sendKeys(uname);
		}
		public void cnt()
		{
			continuebutton.click();
		}
		public void pswd(String sheet, int row ,int cell) throws EncryptedDocumentException, IOException
		{
			String passwd = DDT.credentialpasswd(sheet,row,cell);
		 password.sendKeys(passwd);
		}
		public void signin()
		{
			signinbutton.click();
		}
		//step3
		public LoginAmazon(ChromeDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	

}
