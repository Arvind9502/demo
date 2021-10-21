package selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;



public class hyperlink {

	//private static final String List = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		//go to homepage
		WebElement Link=driver.findElement(By.linkText("Go to Home Page"));
	Link.click();
	//get url which is linked to that particular text
	driver.navigate().back();
	WebElement url = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
	String URL=url.getAttribute("href");
	System.out.println(URL);
	
	//check broken url
	
	  WebElement
	  broken=driver.findElement(By.partialLinkText("Verify am I broken"));
	  broken.click(); String result=driver.getTitle();
	  if (result.contains("404"))
	  { 
		  System.out.println("link is broken");
		  }
	  else
	  {
	  System.out.println("link is not broken"); 
	  }
	  driver.navigate().back();
	
	//go to home page with same name
	  WebElement page=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a"));
	 page.click();
	 driver.navigate().back();
	 String urllink;
	//get how many links
	 int num=0;
	 List<WebElement> count=driver.findElements(By.tagName("a"));
	 System.out.println(count.size());
	 Iterator<WebElement> i=count.iterator();
	 while (i.hasNext()) {
		 urllink=i.next().getAttribute("href");
	 System.out.println(urllink);
	 System.out.println(num);
	num++;
	}
	
		}
}
