package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//1st frame
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.id("Click"));
		frame1.click();
		System.out.println(frame1.getText());
		
		//2nd frame
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2=driver.findElement(By.id("Click1"));
		frame2.click();
		System.out.println(frame2.getText());
		driver.switchTo().defaultContent();
		
		//get count of frames
		List<WebElement> count=driver.findElements(By.tagName("iframe"));
		System.out.println(count.size());
		driver.close();

	}

}
