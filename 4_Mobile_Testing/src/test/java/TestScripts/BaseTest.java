package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.CalculatorPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	AndroidDriver driver;
	CalculatorPage cal;
	@BeforeClass
	public void Setup() throws MalformedURLException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Sathish");
		options.setApp(System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\base.apk");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	    
		cal=new CalculatorPage(driver);
	}
	
	@AfterClass
	public void TestDown() {
		//driver.close();
	}
}
