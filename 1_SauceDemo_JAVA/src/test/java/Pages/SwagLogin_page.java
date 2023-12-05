package Pages;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLogin_page {
	WebDriver driver;
	
	By Username = By.id("user-name");
	By Password= By.id("password");
	By button = By.id("login-button");
	/*@FindBy(xpath = "//*[@id='login_button_container']/div/form/div[3]/h3/text()")
	WebElement Invalid_user_error;*/
	By Invalid_user_error = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3/text()");
			
				public void enterUsername(String name) 
			{
				driver.findElement(Username).clear();
				driver.findElement(Username).sendKeys(name);
			}
			public void enterPassword(String pass) 
			{
				driver.findElement(Password).clear();
				driver.findElement(Password).sendKeys(pass);
			}
			public void clickbutton() 
			{
				driver.findElement(button).click();
			}
	public String error()
	{
        String errortext= driver.findElement(By.xpath("//*[@id='login_button_container']//following::h3")).getText();
		return errortext;
	}
			
			public SwagLogin_page(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}

	
	


}

