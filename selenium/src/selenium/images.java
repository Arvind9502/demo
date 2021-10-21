package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		WebElement image1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		if (image1.getAttribute("naturalHeight").equals("0"))
		{
		System.out.println("image 1 is broken");	
		}
		else {
			System.out.println("image 1 is not broken");
		}
		image1.click();
		driver.navigate().back();
		WebElement image2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		if (image2.getAttribute("naturalWidth").equals("0")) 
		{
			System.out.println("image 2 is broken");
			
		}
		else {
			System.out.println("image 2 is not broken");
		}
		
			WebElement image3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/img"));
			Actions act=new Actions(driver);
			act.moveToElement(image3).click().perform();
			//driver.close();
		
	}

}
