package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Pages.CalculatorPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



@Test
public class Calculator2 extends BaseTest{
		
	
	@Test
	public void AppiumApplcation(){
		
        try {
		    cal.verifingnum9();
		    cal.multipule();
		    cal.verifingnum6();
		    cal.Equals();
		    cal.multipule();
		    cal.verifingnum2();
		    cal.Equals();
		    
		    cal.captureScreenshot(driver,"Result2");
		    
	} 
        catch(Exception e) {
        	e.printStackTrace();
		}
    }
}

		
		
				
		
	


	
	


		
		

