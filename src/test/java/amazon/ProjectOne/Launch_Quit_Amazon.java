package amazon.ProjectOne;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utility.ListenersforScreenshot;

public class Launch_Quit_Amazon extends ListenersforScreenshot
{
	// ChromeDriver driver;
	@BeforeMethod
	public void launch_browser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterMethod
	public void quit_browser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
