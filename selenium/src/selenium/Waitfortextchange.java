package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfortextchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/TextChange.html");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		WebElement button=driver.findElement(By.id("btn"));
		System.out.println(button.getText());
		wait.until(ExpectedConditions.textToBePresentInElement(button, "Click ME!"));
		button.click();
		Alert button1=driver.switchTo().alert();
		System.out.println(button1.getText());
		button1.accept();
		driver.close();	
		//try, catch [use these commands also]
}
}