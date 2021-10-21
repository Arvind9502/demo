package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;



public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement abc=driver.findElement(By.id("at-cv-lightbox-close"));
		abc.click();
		
		//first element
		WebElement text=driver.findElement(By.id("user-message"));
		text.sendKeys("edubridge");
		WebElement button=driver.findElement(By.xpath("//*[@id=\"get-input\"]/button"));
		button.click();
		WebElement txt=driver.findElement(By.id("display"));
		System.out.println(txt.getText());
		
		//second element
		
		WebElement num1=driver.findElement(By.id("sum1"));
		num1.sendKeys("30");
		WebElement num2=driver.findElement(By.id("sum2"));
		num2.sendKeys("20");
		WebElement click1=driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button"));
		click1.click();
		WebElement result=driver.findElement(By.id("displayvalue"));
		System.out.println(result.getText());
		
		driver.close();
		
		
	}
}