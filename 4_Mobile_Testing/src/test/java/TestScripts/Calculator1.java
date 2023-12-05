package TestScripts;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Calculator1 extends BaseTest{
	@Test
	public void AppiumTest() throws InterruptedException, IOException {
			
			driver.findElement(By.id("com.google.android.calculator:id/digit_9")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.google.android.calculator:id/digit_6")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
			
			captureScreenshot(driver, "Result1");
	}
	
	 public void captureScreenshot(WebDriver driver,String tname)throws IOException {
 		TakesScreenshot ts=(TakesScreenshot)driver;
 		File source=ts.getScreenshotAs(OutputType.FILE);
 		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
 		FileUtils.copyFile(source, target);
	}
}
