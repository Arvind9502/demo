package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoleaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		WebElement box=driver.findElement(By.id("tags"));
		Actions act= new Actions(driver);
		act.moveToElement(box).click().sendKeys("s").build().perform();
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		System.out.println("total options="+list.size());
		for (WebElement getlist: list) {
			if (getlist.getText().equals("Selenium")) {
				getlist.click();
				break;
			}
			}
		}
		
		
		
		
		

}
