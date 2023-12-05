package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLoginCart_page {
	
	WebDriver driver;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement AddToCart;
	public WebElement getAddToCart() {
		return AddToCart;
	}	
	@FindBy(id = "shopping_cart_container")
	WebElement clickCartSymbol;
	public WebElement getclickCartSymbol() {
		return clickCartSymbol;
	}
	
	@FindBy(id = "checkout")
	WebElement clickCheckOut;
	public WebElement getclickCheckOut() {
		return clickCheckOut;
	}
	@FindBy(id = "first-name")
	WebElement enterFname;
	public WebElement getenterFname() {
		return enterFname;
	}
	
	@FindBy(id = "last-name")
	WebElement enterLname;
	public WebElement getenterLname() {
		return enterLname;
	}
	
	@FindBy(id = "postal-code")
	WebElement enterZipcode;
	public WebElement getenterZipcode() {
		return enterZipcode;
	}
	
	@FindBy(id = "continue")
	WebElement clickContinue;
	public WebElement getclickContinue() {
		return clickContinue;
	}
	
	
	public SwagLoginCart_page(WebDriver rDriver) {
		this.driver= rDriver;
		PageFactory.initElements(rDriver, this);
	}
	
	
	
}