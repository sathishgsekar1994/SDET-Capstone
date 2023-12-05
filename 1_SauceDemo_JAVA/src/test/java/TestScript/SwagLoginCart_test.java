package TestScript;

import java.io.IOException;

import org.testng.annotations.Test;

public class SwagLoginCart_test extends SwagLogin_test {
	

	@Test(priority=2,dataProvider = "getData")
	public void cart(String username,String password,String firstname,String lastname,String zipcode) throws IOException, InterruptedException {
		
		cart.getAddToCart().click();
		captureScreenshot(driver,"Cart");
		Thread.sleep(2000);
		cart.getclickCartSymbol().click();
		captureScreenshot(driver,"Cartpage");
		Thread.sleep(2000);
		cart.getclickCheckOut().click();
		captureScreenshot(driver,"Checkout");
		Thread.sleep(2000);
		
		cart.getenterFname().sendKeys(firstname);
		cart.getenterLname().sendKeys(lastname);
		cart.getenterZipcode().sendKeys(zipcode);
		captureScreenshot(driver,"DetailsEntry");
		Thread.sleep(3000);
		System.out.println("Checkout");
		cart.getclickContinue().click();
		
		

}
}
