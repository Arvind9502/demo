package selenium;

import java.io.File;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	private static final File TakesScreenshot = null;
	 

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		TakesScreenshot("ss");
	
		
	}

	private static void TakesScreenshot(String filename)
	{
		org.openqa.selenium.TakesScreenshot driver = null;
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     
		
	}

}
