package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitTodisaapera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/disapper.html");
		WebElement button=driver.findElement(By.id("btn"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		if (wait.until(ExpectedConditions.invisibilityOf(button)))
				{
				System.out.println("button is invisible");
				}
		else 
			System.out.println("button is visible");
		driver.close();
	}		
	}


