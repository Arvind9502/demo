package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/alertappear.html");
		WebElement link=driver.findElement(By.id("alert"));
		link.click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("ok");
		driver.close();
		
	}

}
