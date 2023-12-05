package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
	public WebDriver driver;
	@FindBy(id = "com.google.android.calculator:id/digit_9")
	WebElement Entering9;
	
	public void verifingnum9() {
		Entering9.click();
	}
	
	@FindBy(id="com.google.android.calculator:id/op_mul")
	WebElement multi;
	
	public void multipule() {
		multi.click();
	}
	
	@FindBy(id="com.google.android.calculator:id/digit_6")
	WebElement Entering6;
	
	public void verifingnum6() {
		Entering6.click();
	}
	
	@FindBy(id="com.google.android.calculator:id/eq")
	WebElement Equal;
	
	public void Equals() {
		Equal.click();
	}
	
	@FindBy(id="com.google.android.calculator:id/digit_2")
	WebElement Entering2;
	
	public void verifingnum2() {
		Entering2.click();
	}
	
	
	
	

	
	public CalculatorPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void captureScreenshot(WebDriver driver,String tname)throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
		FileUtils.copyFile(source, target);
	
}
}
	


