package selenium;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
//by this we are clicking on button.
		/*
		 * WebElement button=driver.findElement(By.id("home")); button.click();
		 * driver.navigate().back(); //this block is to get position of button
		 * WebElement position= driver.findElement(By.id("position"));
		 * org.openqa.selenium.Point xycoordinates= position.getLocation(); int x =
		 * xycoordinates.getX(); int y = xycoordinates.getY();
		 * System.out.println("x and y coordinates are  "+x+" "+y);
		 */
		//this block is for get button colour
		WebElement bgcolor=driver.findElement(By.id("color"));
String color= bgcolor.getCssValue("background-color");
System.out.println(color);
//get button size
WebElement size=driver.findElement(By.id("size"));
int Width= size.getSize().getWidth();
int Height= size.getSize().getHeight();
System.out.println("Height and Width are  "+Height+" "+Width);
driver.close();
	}
}
