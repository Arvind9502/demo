package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		//clicking redio buttons
		/*
		 * WebElement radio=driver.findElement(By.id("yes")); radio.click(); WebElement
		 * rad=driver.findElement(By.id("no")); rad.click();
		 */
		WebElement unchecked=driver.findElement(By.name("news"));
		boolean result1=unchecked.isSelected();
		System.out.println(result1);
		
		WebElement checked=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		boolean result2=checked.isSelected();
		System.out.println(result2);
		if (result1) {
			System.out.println("unchecked is selected");
	}
		else if (result2) {
			System.out.println("checked is selected");
		}
		}
		} 
			


