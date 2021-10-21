package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/mouseOver.html");
	WebElement button=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/a"));
	Actions action=new Actions(driver);
	action.moveToElement(button).perform();
	
	//selenium
	WebElement link1=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[1]/a"));
	action.moveToElement(link1).click().build().perform();
	Alert alert1=driver.switchTo().alert();
	System.out.println(alert1.getText());
	alert1.accept();
	
	//RPA
	WebElement link2=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[2]/a"));
	action.moveToElement(link2).click().build().perform();
	Alert alert2=driver.switchTo().alert();
	System.out.println(alert2.getText());
	alert2.accept();
	
	//WebServices
	WebElement link3=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[5]/ul/li/ul/li[3]/a"));
	action.moveToElement(link3).click().build().perform();
	Alert alert3=driver.switchTo().alert();
	System.out.println(alert3.getText());
	alert3.accept();
	
	driver.close();
	
	}

}
