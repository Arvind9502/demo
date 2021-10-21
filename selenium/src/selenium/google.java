package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CloseWindow;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.seleniumhq.jetty9.util.Scanner;
//import com.sun.tools.javac.util.Context.Key;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
//driver.findElement(By.name("q")).sendKeys("laptop"+Keys.ENTER);
//driver.navigate().to("https://www.youtube.com/");
//String currentURL=driver.getCurrentUrl();
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
	}
}
