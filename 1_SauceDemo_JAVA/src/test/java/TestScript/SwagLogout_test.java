package TestScript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SwagLogout_test extends SwagLoginCart_test{
	WebDriver driver;
	@Test(priority=3)
	public void logout() throws InterruptedException, IOException {
		

	    logout.clickmorebutton();
	    Thread.sleep(2000);
	    logout.clicklogoutbutton2();
	    System.out.println("Logout Successful");

}
}