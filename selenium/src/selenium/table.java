package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Desktop\\drivers\\gecko\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//get number of rows and columns
		driver.get("http://www.leafground.com/pages/table.html");
		List<WebElement> row=driver.findElements(By.tagName("tr"));
		System.out.println("total rows="+row.size());
		List<WebElement>coloum=driver.findElements(By.tagName("th"));
		System.out.println("total column="+coloum.size());
		
		
		//To get progress value
		WebElement element=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		System.out.println("percentage="+element.getText());
		
		//check the vitals tag[check box]
		List<WebElement> get=driver.findElements(By.xpath("//td[2]"));
		List<Integer> number=new ArrayList<Integer>();
		for (WebElement tabledata : get) {
			String values=tabledata.getText().replace("%","");
			number.add(Integer.parseInt(values));
		}
		System.out.println(number);
		int smallnum=Collections.min(number);
		System.out.println(smallnum);
		
		String path ="//td[normalize-space()='"+smallnum+"%']//following::td[1]//input[@type='checkbox']";
		System.out.println(path);
		Thread.sleep(1000);
		WebElement link=driver.findElement(By.xpath(path));
		link.click();

}
}