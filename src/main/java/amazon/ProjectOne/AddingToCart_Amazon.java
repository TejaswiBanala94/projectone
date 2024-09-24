package amazon.ProjectOne;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddingToCart_Amazon 
{

	ChromeDriver driver;
	@FindBy(id="add-to-cart-button")
	WebElement addtocart;
	
	@FindBy(id="nav-cart-count-container")
	WebElement cart;
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedtobuy;
	
	@FindBy(id="quantity")
	WebElement quantityofproduct;
	
	@FindBy(name="submit.delete.ea0dfe60-dc1c-4255-82f7-6216cd2fd6ae")
	WebElement delete;
	
	public void dlt()
	{
		delete.click();
	}
	
	public void quntity()
	{
		Select s1= new Select(quantityofproduct);
		s1.selectByValue("2");
	}
	
	public void adcart()
	{
		addtocart.click();
	}
	public void crt()
	{
		cart.click();
	}
	public void probuy()
	{
		proceedtobuy.click();
	}
	
	public AddingToCart_Amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
