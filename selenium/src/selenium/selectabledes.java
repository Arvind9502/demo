package selenium;

import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class selectabledes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromenew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/sortable.html");
		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		System.out.println("List of items="+list.size());
		Actions act=new Actions(driver);
		
		int i,j=1;
		for (i = 0; i <list.size()-1; i++) 
		{
			WebElement from=list.get(j);
			String fromtext=list.get(j).getText();
			WebElement to=list.get(i);
			String totext=list.get(i).getText();
			act.dragAndDrop(from, to).build().perform();
			System.out.println(fromtext+"from moved to"+totext);
			j++;
		}
	
		}
	}


