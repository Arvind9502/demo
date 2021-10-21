package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class openwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		String parentwindow=driver.getWindowHandle();
		
		//first window
		WebElement button=driver.findElement(By.id("home"));
		button.click();
		Set<String> data=driver.getWindowHandles();
		for (String newwindow : data) 
		{
			driver.switchTo().window(newwindow);
		}
		WebElement second=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		second.click();
		driver.switchTo().window(parentwindow);
		
		//open multiple window
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		button1.click();
		int countofwindows=driver.getWindowHandles().size();
		System.out.println("no of windows opened= "+countofwindows);
		driver.switchTo().window(parentwindow);
		
		//donot close me [3rd button]
		WebElement button3=driver.findElement(By.xpath("//*[@id=\"color\"]"));
		button3.click();
		int n=0;
		Set<String> data1=driver.getWindowHandles();
		for (String window : data1)
		{
			if (!window.equals(parentwindow)) 
			{
			driver.switchTo().window(window);
			driver.close();
			n++;
			}
		}
		System.out.println("total windows= "+n);
		driver.switchTo().window(parentwindow);
		
		//wait for window open
		WebElement button4=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
		button4.click();
		System.out.println("waiting");
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Set<String> data3=driver.getWindowHandles();
		for (String string : data3) {
			if (!string.equals(parentwindow)) {
				driver.switchTo().window(string);
				driver.close();
				System.out.println("close");
			}
		}
	}

}
