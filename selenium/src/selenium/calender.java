package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Calendar.html");
		WebElement window=driver.findElement(By.id("datepicker"));
		//window.sendKeys("10/10/2021"+Keys.ENTER);
		window.click();
		WebElement forward=driver.findElement(By.xpath("//a[@title='Next']"));
		forward.click();
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),'20')]"));
		date.click();
	}

}
