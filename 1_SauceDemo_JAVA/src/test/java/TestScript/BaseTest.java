package TestScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import Pages.SwagLoginCart_page;
import Pages.SwagLogin_page;
import Pages.SwagLogout_page;
import Utilities.ExcelUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	SwagLogin_page login;
    SwagLoginCart_page cart;
    SwagLogout_page logout;
	
	@BeforeSuite
	@Parameters({"Browser","URL"})
	public void Setup(String Browser,String url) {
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		login=new SwagLogin_page(driver);
		cart=new SwagLoginCart_page(driver);
		logout=new SwagLogout_page(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterClass
	public void tearDown() {
	   // driver.close();
		driver.quit();
	}
	
	public void captureScreenshot(WebDriver driver,String tname)throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshot/"+tname+".png");
		FileUtils.copyFile(source, target);
	}
	
	@DataProvider
	public String[][] getData() throws IOException{
		String ExcelPath=System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\SwagLabs.xlsx";
		String XLSheetName="Sheet1";
		int row=ExcelUtil.getRowCount(ExcelPath,XLSheetName);
		int cell=ExcelUtil.getCellCount(ExcelPath, XLSheetName, row);
		String [][]data=new String[row][cell];
		for(int r=1;r<=row;r++) {
			for(int c=0;c<cell;c++) {
				data[r-1][c]=ExcelUtil.getCellData(ExcelPath, XLSheetName, r, c);
			}
		}
		return data;
	}
}
