package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Get URL
		driver.get("https://www.goibibo.com/hotels/");
		WebElement India=driver.findElement(By.xpath("//input[@type='radio']/h4[India]"));
		India.click();
		
		//
	}

}
