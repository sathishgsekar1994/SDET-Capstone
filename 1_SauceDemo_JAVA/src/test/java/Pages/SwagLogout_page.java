package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SwagLogout_page {
	WebDriver driver;
	By button = By.id("react-burger-menu-btn");
	By button1 = By.id("logout_sidebar_link");
	
	
	
	public void clickmorebutton() 
	{
		driver.findElement(button).click();
	}
	
	public void clicklogoutbutton2() 
	{
		driver.findElement(button1).click();
	}
	
	public SwagLogout_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
