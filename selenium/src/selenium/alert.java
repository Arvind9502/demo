package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		//alert box
		WebElement alert=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		alert.click();
		Alert alert1=driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		alert1.accept();
		
		//Click the button to display a confirm box.
		WebElement confirm=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		confirm.click();
		driver.switchTo().alert().dismiss();
		WebElement result=driver.findElement(By.id("result"));
		System.	out.println(result.getText());
		
		//Click the button to display a prompt box.
		WebElement click=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button"));
		click.click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("selenium test");
		alert2.accept();
		WebElement result1=driver.findElement(By.id("result1"));
		System.	out.println(result1.getText());
		
		//Click the button to learn line-breaks in an alert.
	
	WebElement link=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
	link.click();
	Alert alert3=driver.switchTo().alert();
	System.out.println(alert3.getText());
	driver.switchTo().alert().accept();
	
	//sweet alert//sweet alert is not considered as a alert. 
	WebElement sweet=driver.findElement(By.xpath("//*[@id=\"btn\"]"));
	sweet.click();
	WebElement ok=driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button"));
	ok.click();
	//sweet.sendKeys(Keys.ESCAPE);
	driver.close();
	}
	
}
