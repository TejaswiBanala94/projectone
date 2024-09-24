package amazon.ProjectOne;

import org.testng.Assert;
import org.testng.annotations.Listeners;


import org.testng.annotations.Test;


@Listeners(utility.ListenersforScreenshot.class)
public class Testcase1_for_RegisterNewUser extends Launch_Quit_Amazon
{
	@Test(retryAnalyzer = utility.RetryLogic.class)
	public void register()
	{
		 Home_Amazon h1= new Home_Amazon(driver);
			
			h1.strthr();
      
		Registration_Amazon r1=new Registration_Amazon(driver);
		r1.nm();
		r1.phnum();
		r1.pswrd();
		r1.vmnum();
		Assert.assertEquals( driver.getTitle(),"Authentication required"," sorry the testcase is failed");
	}

}
