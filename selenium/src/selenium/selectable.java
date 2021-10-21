package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.RefreshPage;

public class selectable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		System.out.println("List of items="+list.size());
		Actions act=new Actions(driver);
		
	//select from 1 to 5 items
		//act.clickAndHold(list.get(1));
		//act.clickAndHold(list.get(5));
		//act.release();
		//act.build().perform();
	//driver.navigate().refresh();
		act.keyDown(Keys.CONTROL).click(list.get(1)).click(list.get(5)).click(list.get(0));
		act.build().perform();
		
	
		
	}

}
